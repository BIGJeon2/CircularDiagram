package com.jeon.circulardiagram.screen

import android.content.res.ColorStateList
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jeon.circulardiagram.ui.theme.CircularDiagramTheme

@Composable
fun Graph2() {
    Box(modifier = Modifier.padding(120.dp)){
        pieChart(25.0f, 75.0f, listOf(Color.Red, Color.Blue))
    }
}

@Composable
private fun pieChart(pieSize1: Float, pieSize2: Float, colorList: List<Color>){

    val totalSize = pieSize1 + pieSize2

    BoxWithConstraints(
        modifier = Modifier.padding(20.dp)
    ) {
        val pieDetailSize = constraints.maxWidth.toFloat()

        Canvas(
            modifier = Modifier.size(pieDetailSize.dp)
        ) {

            val sweep1 = 360 * (pieSize1 / totalSize)

            drawArc(
                color = colorList[0],
                startAngle = 0f,
                sweepAngle = sweep1,
                useCenter = true,
                size = Size(pieDetailSize, pieDetailSize)
            )
            drawArc(
                color = colorList[1],
                startAngle = sweep1,
                sweepAngle = 360 - sweep1,
                useCenter = true,
                size = Size(pieDetailSize, pieDetailSize)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun Graph2Preview() {
    CircularDiagramTheme {
        pieChart(25.0f, 75.0f, listOf(Color.Red, Color.Blue))
    }
}