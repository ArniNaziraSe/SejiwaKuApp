package com.msv.sejiwaku.homepage.journey

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.journey.component.TemplateIsiJourney
//import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.navigator.BottonBarScreen

data class JourneyData(
    val gambar: Int,
    val judul: String,
    val waktu: String,
    val screen: () -> Unit
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JourneyScreen(
    navController: NavController,
    onClick: () -> Unit
) {
    val namafont = inter
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                }
            )
        },
        bottomBar = {
            BottomAppBar {

            }
        }
    ) { contentPadding ->
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .verticalScroll(scrollState),
        ) {
            val perpindahan = ""
            val ukuran = 97.dp
            val warnaabuabu = Color(red = 0.518f, green = 0.518f, blue = 0.518f, alpha = 1.0f)
            val warnatoska = Color(
                red = 0.2f,
                green = 0.725f,
                blue = 0.675f,
                alpha = 1.0f
            )


            Column(
                modifier = Modifier.padding(start = 14.dp)
            ) {
                Text(text = "Topik Journey dari Sejiwaku", fontWeight = FontWeight.Bold, fontSize = 12.sp,fontFamily = namafont)
                Text(text = "Yuk pahami pikiran dan perasaanmu melalui refleksi dalam journey ini", fontSize = 9.sp)
            }
            Spacer(modifier = Modifier.size(13.dp))
            Text(text = "Menerima Diri", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = warnaabuabu, modifier = Modifier.padding(start = 17.dp))
            Spacer(modifier = Modifier.size(6.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp, end = 15.dp)
            ) {
                TemplateIsiJourney(
                    gambar = R.drawable.journey01,
                    judul = "Menerima Diri pt 1",
                    waktu = "Durasi 3 hari",
                    onClick = {navController.navigate(BottonBarScreen.Detail.route)}
                )
                Spacer(modifier = Modifier.size(7.dp))
                Text(text = "Kamu Pasti Bisa", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = warnaabuabu, modifier = Modifier.padding(start = 5.dp))
                Spacer(modifier = Modifier.size(4.dp))
                TemplateIsiJourney(
                    gambar = R.drawable.journey11,
                    judul = "Kamu Pasti Bisa pt 1",
                    waktu = "Durasi 3 hari",
                    onClick = {navController.navigate(BottonBarScreen.Detail.route)}
                )
            }
        }
    }
}