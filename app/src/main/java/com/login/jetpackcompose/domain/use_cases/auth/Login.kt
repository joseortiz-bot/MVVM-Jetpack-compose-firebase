package com.login.jetpackcompose.domain.use_cases.auth

import com.login.jetpackcompose.domain.repository.AuthRepository
import javax.inject.Inject

class Login @Inject constructor(private val repository: AuthRepository) {

    suspend operator fun invoke(email: String, password: String) = repository.login(email, password)

}