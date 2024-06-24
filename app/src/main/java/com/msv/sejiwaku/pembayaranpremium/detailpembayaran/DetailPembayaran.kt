package com.msv.sejiwaku.pembayaranpremium.detailpembayaran

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.pembayaranpremium.component.ButtonSubmit
import com.msv.sejiwaku.pembayaranpremium.component.GrupRadio
import com.msv.sejiwaku.pembayaranpremium.component.HeaderPembayaran
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import com.msv.sejiwaku.ui.theme.Poppins
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun DetailPembayaran(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var opsiTerpilih by remember { mutableStateOf("Opsi 1") }
        HeaderPembayaran(judul = "Detail Pembayaran") {
            navController.navigate(BottonBarScreen.PembayaranPremium.route)
        }
        Column(
            modifier = Modifier.padding(start = 20.dp)
        ) {
            Text(text = "Pembayaran", fontWeight = FontWeight.Bold, fontSize = 16.sp, fontFamily = inter)
            Text(text = "Lakukan pembayaran anda dengan mudah", fontSize = 12.sp, fontFamily = inter)
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Pilih Metode Pembayaran", fontWeight = FontWeight.Bold, fontSize = 16.sp, fontFamily = inter)
            Spacer(modifier = Modifier.size(5.dp))
            GrupRadio(
                opsi = listOf(
                    Pair("BCA", R.drawable.bca),
                    Pair("BNI", R.drawable.bni),
                    Pair("Mandiri", R.drawable.mandiri),
                    Pair("OVO", R.drawable.ovo),
                    Pair("DANA", R.drawable.dana),
                    Pair("GOPAY", R.drawable.gopay),
                    Pair("LINKAJA", R.drawable.linkaja)
                ),
                opsiTerpilih = opsiTerpilih,
                onOpsiSelected = { opsi ->
                    opsiTerpilih = opsi
                }
            )
            Spacer(modifier = Modifier.size(140.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(start = 10.dp, end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Total", fontFamily = Poppins, fontSize = 12.sp)
                Text(text = "Rp. 69.000", fontFamily = Poppins, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            ButtonSubmit(
                text = "Bayar Sekarang",
                onClick = {
                    navController.navigate(BottonBarScreen.Payment.route)
                }
            )
        }
    }
}

@Preview
@Composable
private fun PreviewDetailPembayaran() {
    SejiwakuTheme {
        DetailPembayaran(
            navController = rememberNavController()
        )
    }
}