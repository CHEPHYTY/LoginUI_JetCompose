package com.soumya.loginuiprojecttutorial.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.soumya.loginuiprojecttutorial.navigation.PostOfficeAppRouter
import com.soumya.loginuiprojecttutorial.navigation.Screen
import com.soumya.loginuiprojecttutorial.screens.LoginScreen
import com.soumya.loginuiprojecttutorial.screens.SignUpScreen
import com.soumya.loginuiprojecttutorial.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen->{
                    LoginScreen()
                }
            }

        }

    }
}