package com.jeon.circulardiagram.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.jeon.circulardiagram.ui.theme.CircularDiagramTheme

@Composable
fun Graph1() {

    Graph1Gauge(70.0f, 100.0f)

}

@Composable
private fun Graph1Gauge(percent: Float, maxPercent: Float){
    // 360 중에 70% 값을 구해서 그 수치를 표현 해준다
    val colorPercent = 360 * (percent / maxPercent)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .aspectRatio(1f)
    ) {
        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
            drawArc(
                color = Color.LightGray,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(35f)
            )
            drawArc(
                color = Color.Blue,
                startAngle = -90f,
                sweepAngle = colorPercent,
                useCenter = false,
                style = Stroke(35f)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "${((percent / maxPercent) * 100).toInt()}%",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${percent} / ${maxPercent}",
                fontSize = 20.sp
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun Graph1Preview() {
    CircularDiagramTheme {
        Graph1()
    }
}
