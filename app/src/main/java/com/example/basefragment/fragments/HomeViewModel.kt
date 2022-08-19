package com.example.basefragment.fragments

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeViewModel : ViewModel() {
    val testFlow: Flow<String> = flow{
        delay(20000)
        emit("com.facebook.orca")
    }
}