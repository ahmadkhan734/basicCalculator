package com.example.basiccalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccalculator.ui.theme.BasicCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val viewModels = viewModels <CalculatorViewModel>()
                    val state = viewModels.value.state
                    val buttonSpacing = 8.dp
                    Calculator(
                        state = state,
                        onAction = viewModels.value::onAction,
                        buttonSpacing = buttonSpacing,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.DarkGray)
                            .padding(16.dp))



                }
            }
        }
    }
}

//
//@Preview
//@Composable
//fun DefaultPreview() {
//    BasicCalculatorTheme {
//        Calculator(state = CalculatorState(), onAction = {})
//
//    }
//
//}
