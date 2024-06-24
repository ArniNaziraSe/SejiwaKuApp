package com.msv.sejiwaku.pembayaranpremium.premium

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
import com.msv.sejiwaku.pembayaranpremium.component.DaftarFilturDidapatP
import com.msv.sejiwaku.pembayaranpremium.component.HeaderPembayaran
import com.msv.sejiwaku.pembayaranpremium.component.PerpindahanPembayaran
import com.msv.sejiwaku.pembayaranpremium.component.TeksPembayaran
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu_muda

@Composable
fun PremiumPembayaran(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HeaderPembayaran(judul = "Upgrade Premium") {
            
        }
        Spacer(modifier = Modifier.size(20.dp))
        PerpindahanPembayaran(
            onClicksatu = {
                navController.navigate(BottonBarScreen.PembayaranFree.route) {
                    popUpTo(BottonBarScreen.PembayaranPremium.route) {
                        inclusive = true
                    }
                }
            },
            onClickdua = { /*TODO*/ },
            colorsatu = abu_abu_muda,
            colordua = Color.White
        )
        Spacer(modifier = Modifier.size(27.dp))
        TeksPembayaran(text = "Premium", painter = R.drawable.dolarpremium)
        Spacer(modifier = Modifier.size(27.dp))
        DaftarFilturDidapatP()
        Spacer(modifier = Modifier.size(327.dp))
        ButtonPembayaran(text = "Lanjut Rp. 69.000,-") {
            navController.navigate(BottonBarScreen.DetailPembayaranPremium.route) {
                popUpTo(BottonBarScreen.PembayaranPremium.route) {
                    inclusive = true
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewPremiumPembayaran() {
    SejiwakuTheme {
        PremiumPembayaran(
            navController = rememberNavController()
        )
    }
}