package com.rajkumarpractice.androidnativeproject.ui

import androidx.lifecycle.ViewModel
import com.rajkumarpractice.androidnativeproject.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: UserRepository
) : ViewModel() {

}