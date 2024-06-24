package com.msv.sejiwaku.chatPremium.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChatViewModel : ViewModel() {
    private val _pesan = MutableStateFlow<List<String>>(emptyList())
    val pesan: StateFlow<List<String>> = _pesan.asStateFlow()

    private val _jumlahChat = MutableStateFlow(0)
    val jumlahChat: StateFlow<Int> = _jumlahChat.asStateFlow()

    fun addPesan(pesanBaru: String) {
        if (_pesan.value.size < 50) {
            _pesan.value = _pesan.value + pesanBaru
            _jumlahChat.value = _pesan.value.size
        }
    }
}
