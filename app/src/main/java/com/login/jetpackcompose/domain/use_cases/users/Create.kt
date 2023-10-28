package com.login.jetpackcompose.domain.use_cases.users

import com.login.jetpackcompose.domain.model.User
import com.login.jetpackcompose.domain.repository.UsersRepository
import javax.inject.Inject

class Create @Inject constructor(private val repository: UsersRepository) {

    suspend operator fun invoke(user: User) = repository.create(user)

}