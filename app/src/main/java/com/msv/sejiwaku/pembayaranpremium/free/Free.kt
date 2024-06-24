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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.pembayaranpremium.component.ButtonPembayaran
import com.msv.sejiwaku.pembayaranpremium.component.DaftarFilturDidapat
import com.msv.sejiwaku.pembayaranpremium.component.HeaderPembayaran
import com.msv.sejiwaku.pembayaranpremium.component.PerpindahanPembayaran
import com.msv.sejiwaku.pembayaranpremium.component.TeksPembayaran
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu_muda
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun FreePembayaran(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HeaderPembayaran(judul = "Upgrade Premium") {
            navController.navigate(BottonBarScreen.AkunFree.route)
        }
        Spacer(modifier = Modifier.size(20.dp))
        PerpindahanPembayaran(
            onClicksatu = { /*TODO*/ },
            onClickdua = {
                navController.navigate(BottonBarScreen.PembayaranPremium.route) {
                    popUpTo(BottonBarScreen.PembayaranFree.route) {
                        inclusive = true
                    }
                }
                         },
            colorsatu = Color.White,
            colordua = abu_abu_muda
        )
        Spacer(modifier = Modifier.size(27.dp))
        TeksPembayaran(text = "Free", painter = R.drawable.bintang, tint = Color.Yellow)
        Spacer(modifier = Modifier.size(27.dp))
        DaftarFilturDidapat()
        Spacer(modifier = Modifier.size(327.dp))
        ButtonPembayaran(text = "Lanjut Rp. 0,-") {
            
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewFreePembayaran() {
    SejiwakuTheme {
        FreePembayaran(
            navController = rememberNavController()
        )
    }
}