package com.login.jetpackcompose.domain.use_cases.auth

import com.login.jetpackcompose.domain.repository.AuthRepository
import javax.inject.Inject

class GetCurrentUser @Inject constructor(private val repository: AuthRepository) {

    operator fun invoke() = repository.currentUser

}