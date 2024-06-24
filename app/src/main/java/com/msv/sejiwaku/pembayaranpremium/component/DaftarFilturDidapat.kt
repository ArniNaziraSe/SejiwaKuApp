package com.msv.sejiwaku.pembayaranpremium.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu

@Composable
fun DaftarFilturDidapat() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .width(307.dp)
                .height(150.dp)
                .border(2.dp, abu_abu, RoundedCornerShape(6.dp)),
            ) {
            Spacer(modifier = Modifier.size(24.dp))
            DaftarList(text = "chat (20 bubble chat/tidak bisa bertambah)")
            Spacer(modifier = Modifier.size(6.dp))
            DaftarList(text = "Catatan, Jurnal (10x bisa disimpan)")
            Spacer(modifier = Modifier.size(6.dp))
            DaftarList(text = "Journey (Khusus akses tidak bertanda premium)")
        }
    }
}

@Preview
@Composable
private fun PreviewDaftarFilturDidapat() {
    SejiwakuTheme {
        DaftarFilturDidapat()
    }
}