package com.jeon.customcirculardiagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jeon.customcirculardiagram.ui.theme.CircularDiagramTheme

class CircularDiagram : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularDiagramTheme {

            }
        }
    }
}

@Composable
private fun CircularDiagramPractice(){
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CircularDiagramTheme {

    }
}