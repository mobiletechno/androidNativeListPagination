package com.rajkumarpractice.androidnativeproject.data.repository

import com.rajkumarpractice.androidnativeproject.UsersApi
import com.rajkumarpractice.androidnativeproject.UsersResponse

class UserRepositoryImpl(
    private val api: UsersApi
) : UserRepository {

    override suspend fun getUsers(page: Int, limit: Int): UsersResponse {
        return api.getUsers(page, limit)
    }
}