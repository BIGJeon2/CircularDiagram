package com.jeon.circulardiagram.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jeon.circulardiagram.ui.theme.CircularDiagramTheme

@Composable
fun Graph3() {

    Text(
        text = "3",
        fontSize = 30.sp
    )

}

@Preview(showBackground = true)
@Composable
fun Graph3Preview() {
    CircularDiagramTheme {
        Graph3()
    }
}