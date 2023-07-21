package com.soumya.loginuiprojecttutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.soumya.loginuiprojecttutorial.app.PostOfficeApp
import com.soumya.loginuiprojecttutorial.screens.SignUpScreen
import com.soumya.loginuiprojecttutorial.ui.theme.LoginUIProjectTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PostOfficeApp()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginUIProjectTutorialTheme {
        Greeting("Android")
    }
}