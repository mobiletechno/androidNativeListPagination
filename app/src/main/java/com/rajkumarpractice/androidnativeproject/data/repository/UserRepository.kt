package com.rajkumarpractice.androidnativeproject.data.repository

import com.rajkumarpractice.androidnativeproject.UsersResponse


interface UserRepository {

    suspend fun getUsers(page: Int, limit: Int): UsersResponse

}