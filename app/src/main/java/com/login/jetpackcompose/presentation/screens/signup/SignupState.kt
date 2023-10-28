package com.login.jetpackcompose.presentation.screens.signup

data class SignupState(
    val username: String = "",
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
)
