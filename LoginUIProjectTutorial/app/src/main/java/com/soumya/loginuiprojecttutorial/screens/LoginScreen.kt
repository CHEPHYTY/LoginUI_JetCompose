package com.soumya.loginuiprojecttutorial.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soumya.loginuiprojecttutorial.R
import com.soumya.loginuiprojecttutorial.components.*
import com.soumya.loginuiprojecttutorial.navigation.PostOfficeAppRouter
import com.soumya.loginuiprojecttutorial.navigation.Screen
import com.soumya.loginuiprojecttutorial.navigation.SystemBackButtonHandler


@Composable
fun LoginScreen()
{
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier= Modifier.fillMaxSize()) {
            NormalTextComponent(value = "\uD83E\uDD17Welcome Back\uD83E\uDD17")

            HeadingTextComponent(value = "Sign In")
            Spacer(modifier = Modifier.height(30.dp))
            MyTextFieldComponent(
                labelValue = "Email",
                painterResource(id = R.drawable.email)
            )


            PasswordTextFieldComponent(
                labelValue = "Password",
                painterResource(id = R.drawable.password)
            )
            Spacer(modifier = Modifier.height(10.dp))

            NormalSmallTextComponent(value = "Forgot your Password")

            Spacer(modifier = Modifier.height(50.dp))

            ButtonComponent(value = stringResource(R.string.sign_in))

            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            Spacer(modifier = Modifier.height(20.dp))

            LoginClickableTextComponent(tryingToLogin = false,
                onTextSelected ={ PostOfficeAppRouter.navigateTo(Screen.SignUpScreen) }
            )

        }

        SystemBackButtonHandler {
            PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewOfSignINScreen() {
    LoginScreen()
}