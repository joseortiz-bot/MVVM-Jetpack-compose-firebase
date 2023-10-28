package com.login.jetpackcompose.presentation.screens.signup

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.login.jetpackcompose.presentation.components.DefaultTopBar
import com.login.jetpackcompose.presentation.screens.signup.components.SignUp
import com.login.jetpackcompose.presentation.screens.signup.components.SignupContent
import com.login.jetpackcompose.presentation.ui.theme.GamerMVVMAppTheme

@Composable
fun SignupScreen(navController: NavHostController) {
    
    Scaffold(
        topBar = {
             DefaultTopBar(
                 title = "Nuevo usuario",
                 upAvailable = true,
                 navController = navController
             )
        },
        content = {
            SignupContent(navController)
        },
        bottomBar = {}
    )
    SignUp(navController = navController)
    
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSignupScreen() {
    GamerMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            SignupScreen(rememberNavController())
        }
    }
}