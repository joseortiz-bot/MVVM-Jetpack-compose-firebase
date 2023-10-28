package com.login.jetpackcompose.domain.use_cases.auth

import com.login.jetpackcompose.domain.model.User
import com.login.jetpackcompose.domain.repository.AuthRepository
import javax.inject.Inject

class Signup @Inject constructor(private val repository: AuthRepository) {

    suspend operator fun invoke(user: User) = repository.signUp(user)

}