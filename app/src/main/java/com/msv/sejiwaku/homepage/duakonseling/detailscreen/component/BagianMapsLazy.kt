package com.msv.sejiwaku.homepage.duakonseling.detailscreen.component

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.ui.theme.toska
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun LazyMaps(
    onClick: String, // Parameter untuk URL tautan
    namars: String,
    hargars: String
) {
    val context = LocalContext.current
    Box {
        Card(
            modifier = Modifier
                .height(147.dp)
                .width(145.dp),
            colors = CardDefaults.cardColors(containerColor = toska) // Ganti dengan warna yang sesuai
        ) {
            Text(text = "")
        }
        Card(
            modifier = Modifier
                .height(147.dp)
                .width(145.dp)
                .padding(top = 0.5.dp, start = 0.5.dp, end = 0.5.dp, bottom = 1.5.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(73.dp)
                        .width(120.dp)
                        .clickable {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(onClick))
                            context.startActivity(intent)
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gambarmapslink),
                        contentDescription = "Gambar Maps",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Spacer(modifier = Modifier.size(5.dp))
                Text(text = namars, fontFamily = inter, fontSize = 12.sp, color = Color.Black)
                Text(
                    text = "Biaya Konsultasi Rp. $hargars",
                    fontFamily = inter,
                    fontSize = 9.sp,
                    color = Color(0xFFFFA500) // Ganti dengan warna yang sesuai
                )
                Spacer(modifier = Modifier.size(5.dp))
                Card(
                    modifier = Modifier
                        .height(17.dp)
                        .width(105.dp),
                    shape = RoundedCornerShape(6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF008080)) // Ganti dengan warna yang sesuai
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Konfirmasi Sekarang",
                            fontSize = 9.sp,
                            fontFamily = inter,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLazyMaps() {
    LazyMaps(
        "www.google.com",
        "Rs.Sehat Selalu",
        "250.000"
    )
}