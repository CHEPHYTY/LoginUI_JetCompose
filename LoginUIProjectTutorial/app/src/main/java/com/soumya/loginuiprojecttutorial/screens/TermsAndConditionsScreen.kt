package com.soumya.loginuiprojecttutorial.screens

import android.view.View.OnClickListener
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soumya.loginuiprojecttutorial.R
import com.soumya.loginuiprojecttutorial.components.HeadingTextComponent
import com.soumya.loginuiprojecttutorial.navigation.PostOfficeAppRouter
import com.soumya.loginuiprojecttutorial.navigation.Screen
import com.soumya.loginuiprojecttutorial.navigation.SystemBackButtonHandler


@Composable
fun TermsAndConditionsScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(top = 16.dp)
    ) {
//        Row(
//            modifier = Modifier.width(200.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.back_button),
//                contentDescription = "Back Button",
//                modifier = Modifier
//                    .size(40.dp)
//                    .padding(start = 10.dp)
//                    .clickable { PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
//                    }
//
//            )

            HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))


    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun preview_the_above() {
    TermsAndConditionsScreen()
}