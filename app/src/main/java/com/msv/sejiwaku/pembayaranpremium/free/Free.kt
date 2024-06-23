package com.msv.sejiwaku.pembayaranpremium.free

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.pembayaranpremium.component.PerpindahanPembayaran
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu_muda

@Composable
fun FreePembayaran() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        PerpindahanPembayaran(
            onClicksatu = { /*TODO*/ },
            onClickdua = { /*TODO*/ },
            colorsatu = Color.White,
            colordua = abu_abu_muda
        )
    }
}

@Preview
@Composable
private fun PreviewFreePembayaran() {
    SejiwakuTheme {
        FreePembayaran()
    }
}