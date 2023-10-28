package com.login.jetpackcompose.presentation.screens.profile_update.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.login.jetpackcompose.domain.model.Response
import com.login.jetpackcompose.presentation.components.ProgressBar
import com.login.jetpackcompose.presentation.screens.profile_update.ProfileUpdateViewModel

@Composable
fun SaveImage(viewModel: ProfileUpdateViewModel = hiltViewModel()) {

    when (val response = viewModel.saveImageResponse) {
        Response.Loading -> {
            ProgressBar()
        }
        is Response.Success -> {
            viewModel.onUpdate(response.data)
        }
        is Response.Failure -> {
            Toast.makeText(LocalContext.current, response.exception?.message ?: "Error desconcido", Toast.LENGTH_LONG).show()
        }
    }

}