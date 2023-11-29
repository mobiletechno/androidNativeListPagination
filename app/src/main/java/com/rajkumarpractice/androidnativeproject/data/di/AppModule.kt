package com.rajkumarpractice.androidnativeproject.data.di

import com.rajkumarpractice.androidnativeproject.UsersApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import  com.rajkumarpractice.androidnativeproject.data.repository.UserRepository
import  com.rajkumarpractice.androidnativeproject.data.repository.UserRepositoryImpl


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideUsersApi(): UsersApi = UsersApi()

    @Provides
    fun provideUserRepository(api: UsersApi): UserRepository = UserRepositoryImpl(api)
}