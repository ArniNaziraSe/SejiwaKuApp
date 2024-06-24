package com.msv.sejiwaku.homepage.duakonseling.detailscreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.duakonseling.component.Bintang
import com.msv.sejiwaku.homepage.duakonseling.detailscreen.component.Garis
import com.msv.sejiwaku.homepage.duakonseling.detailscreen.component.Komentar
import com.msv.sejiwaku.homepage.duakonseling.detailscreen.component.LazyMaps
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.ui.theme.toska

@Composable
fun DetailScreenKonseling(
    navController: NavController
) {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 14.dp, top = 14.dp)
        ) {
            Image(
                modifier = Modifier.clickable {
                                              navController.navigate(BottonBarScreen.Konseling.route)
                },
                painter = painterResource(id = R.drawable.konselingdetailtombolback),
                contentDescription = "Tombol Back"
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.fotokonseling11),
                    contentDescription = null,
                    modifier = Modifier.size(width = 146.3.dp, height = 89.dp)
                )
            }
            Spacer(modifier = Modifier.size(13.7.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.size(13.7.dp))
                Text(text = "Rudmi Rayan, M.Psi", fontFamily = inter, fontWeight = FontWeight.Bold)
                Bintang(rating = 4.0)
                Button(
                    onClick = {
                              navController.navigate(BottonBarScreen.GaleriChat.route)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = toska),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.size(height = 28.dp, width = 110.dp)
                ) {
                    Text(text = "Chat Sekarang", fontSize = 9.sp)
                }
            }
        }
        Text(text = "Profile Dokter", fontFamily = inter, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp, top = 7.dp))
        Column(
            modifier = Modifier.padding(14.dp)
        ) {
            Box {
                Surface(
                    modifier = Modifier

                        .height(77.9.dp)
                        .fillMaxWidth(),
                    color = toska,
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .height(75.dp)
                        .fillMaxWidth()
                        .padding(top = 1.dp),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.961f,
                        green = 0.961f,
                        blue = 0.961f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(
                                top = 8.dp,
                                bottom = 8.dp,
                                start = 2.dp,
                                end = 6.dp
                            ),
                    ) {
                        Spacer(modifier = Modifier.size(10.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                        ) {
                            Text(
                                text = "Rudmi Rayan, M.Psi merupakan dokter psikologi yang melakukan praktik di rumah sakit Siti Khadijah, Surabaya, namun ia juga biasa melakukan praktik di kediamannya yang terletak di Lidah Wetan, Surabaya. Rudmi Rayan, M.Psi berpengalaman dalam dunia psikologi selama 2,5 tahun serta dapat menyelesaikan berbagai masalah seperti depresi berlebih.",
                                fontFamily = inter,
                                fontSize = 8.sp,
                                lineHeight = 10.sp
                            )
                        }
                    }
                }
            }
        }
        Text(text = "Lokasi dan Jadwal Praktik", fontFamily = inter, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp, top = 7.dp))
        Row(
            modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        ) {
            LazyMaps(
                onClick = "https://www.google.com/maps",
                namars = "Rumah Sakit Contoh",
                hargars = "150.000"
            )
            Spacer(modifier = Modifier.size(10.dp))
            LazyMaps(
                onClick = "https://www.google.com/maps",
                namars = "Rumah Sakit Contoh",
                hargars = "150.000"
            )
        }
        Spacer(modifier = Modifier.size(28.dp))
        Garis(tinggi = 4, lebar = 400)
        Spacer(modifier = Modifier.size(19.dp))
        Column(
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(text = "Penilaian", fontFamily = inter)
            Bintang(rating = 4.0)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 7.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Text(text = "Lihat Semua Disini", fontSize = 9.sp, fontFamily = inter, fontWeight = FontWeight.Bold, color = toska)
            Spacer(modifier = Modifier.size(6.dp))
            Image(
                painter = painterResource(id = R.drawable.journallanjutdua),
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(modifier = Modifier.size(5.dp))
        Garis(tinggi = 2, lebar = 400)
        Komentar(
            R.drawable.examplekomentar,
            "Sukijan",
            "20 Nov 2023",
            "Dokternya enak, sangat asik untuk diajak berbicara. Selain itu dokternya juga sangat berpengalaman dibidangnya."
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDetailJourney() {
    DetailScreenKonseling(navController = rememberNavController())
}