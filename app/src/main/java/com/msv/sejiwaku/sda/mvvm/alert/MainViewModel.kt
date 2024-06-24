package com.msv.sejiwaku.sda.mvvm.alert

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val showDialog = mutableStateOf(false)

    fun showAlert() {
        showDialog.value = true
    }

    fun dismissAlert() {
        showDialog.value = false
    }
}
