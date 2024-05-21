package com.jeon.circulardiagram.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jeon.circulardiagram.ui.theme.CircularDiagramTheme

@Composable
fun Graph3() {

    var varDataList = listOf(
        10,8,5,7,12,3,5
    )

    BarChart(varDataList)

}

@Composable
private fun BarChart(dataList: List<Int>){

    val dataMaxValue = dataList.max()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            dataList.forEach { data ->
                Bar(data, dataMaxValue)
            }
        }
    }

}

@Composable
private fun Bar(data: Int, maxValue: Int){

    val barHeight = (data.toFloat() / maxValue) * 300

    Box(
        modifier = Modifier
            .height(barHeight.dp)
            .width(30.dp)
            .background(Color.Cyan),
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            text = data.toString(),
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Graph3Preview() {
    CircularDiagramTheme {
        var varDataList = listOf(
            10,8,5,7,12,3,5
        )

        BarChart(varDataList)
    }
}