package com.soumya.loginuiprojecttutorial.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.D
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.soumya.loginuiprojecttutorial.R
import com.soumya.loginuiprojecttutorial.components.*
import com.soumya.loginuiprojecttutorial.navigation.PostOfficeAppRouter
import com.soumya.loginuiprojecttutorial.navigation.Screen

@Composable
fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))

            HeadingTextComponent(value = stringResource(id = R.string.Create_Account))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.middle_name),
                painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.email)
            )


            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.password)
            )

            CheckboxComponent(value = stringResource(R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                }
            )
            Spacer(modifier = Modifier.height(90.dp))

            ButtonComponent(value = stringResource(R.string.register))

            Spacer(modifier = Modifier.height(30.dp))

            DividerTextComponent()
            LoginClickableTextComponent(tryingToLogin = true,
                onTextSelected = { PostOfficeAppRouter.navigateTo(Screen.LoginScreen) }
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}