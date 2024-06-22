package com.msv.sejiwaku.chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.abu_abu_muda

@Composable
fun KomponenIsi() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .width(318.dp)
                .background(
                    abu_abu_muda,
                    RoundedCornerShape(8.dp)
                )
        ) {
            TeksInputChat(conten = "Cari..", colortext = abu_abu_muda, value = "Cari..") {

            }
            DaftarChat(
                profileurl = "",
                nama = "Rudmi Rayan, M.Psi",
                waktu = "Chat diterima",
                onClickChat = {}
            )
            DaftarChat(
                profileurl = "",
                nama = "Dr. Rocky Sur",
                waktu = "Chat 2 bulan yang lalu",
                onClickChat = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKomponenIsi() {
    SejiwakuTheme {
        KomponenIsi()
    }
}