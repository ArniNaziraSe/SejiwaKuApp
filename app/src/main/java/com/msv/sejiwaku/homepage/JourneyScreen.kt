package com.msv.sejiwaku.homepage

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.LoginScreen
//import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi
import com.msv.sejiwaku.ui.theme.inter

data class JourneyData(
    val gambar : Int,
    val judul: String,
    val waktu: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JourneyScreen(
    navController: NavController,
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
                Column {
                    Icon(imageVector = Icons.Default.Image, contentDescription = null)
                }
            }
        }
    ) { contentPadding ->
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .verticalScroll(scrollState),
        ) {
            val perpindahan = { }
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
                val journeyku = listOf(
                    JourneyData(
                        gambar = R.drawable.journey01,
                        judul = "Menerima Diri pt 1",
                        waktu = "Durasi 3 hari"
                    ),
                    JourneyData(
                        gambar = R.drawable.journey02,
                        judul = "Menerima Diri pt 2",
                        waktu = "Durasi 4 hari"
                    ),
                    JourneyData(
                        gambar = R.drawable.journey03,
                        judul = "Menerima Diri pt 3",
                        waktu = "Durasi 5 hari"
                    )
                )
                journeyku.map { journeyku ->

                    Box {
                        Surface(
                            modifier = Modifier
                                .clickable { }
                                .height(ukuran)
                                .fillMaxWidth(),
                            color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ),
                            shape = RoundedCornerShape(10.dp),

                            ) {
                        }
                        Surface(
                            onClick = perpindahan,
                            modifier = Modifier
                                .height(94.dp)
                                .fillMaxWidth(),
                            color = Color.White,
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ),)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .padding(13.dp),
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = journeyku.gambar), contentDescription = "")
                                }
                                Spacer(modifier = Modifier.size(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(text = journeyku.judul,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                    Text(text = journeyku.waktu,fontFamily = namafont, fontSize = 9.sp)
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(9.dp))
                }
                Text(text = "Kamu Pasti Bisa", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = warnaabuabu, modifier = Modifier.padding(start = 5.dp))
                Spacer(modifier = Modifier.size(4.dp))
                val journeykudua = listOf(
                    JourneyData(
                        gambar = R.drawable.journey11,
                        judul = "Kamu Pasti Bisa pt 1",
                        waktu = "Durasi 3 hari"
                    ),
                    JourneyData(
                        gambar = R.drawable.journey12,
                        judul = "Kamu Pasti Bisa pt 2",
                        waktu = "Durasi 4 hari"
                    ),
                    JourneyData(
                        gambar = R.drawable.journey11,
                        judul = "Kamu Pasti Bisa pt 3",
                        waktu = "Durasi 3 hari"
                    ),
                )
                journeykudua.map { journeykudua ->

                    Box {
                        Surface(
                            modifier = Modifier
                                .clickable { }
                                .height(ukuran)
                                .fillMaxWidth(),
                            color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ),
                            shape = RoundedCornerShape(10.dp),

                            ) {
                        }
                        Surface(
                            onClick = perpindahan,
                            modifier = Modifier
                                .height(94.dp)
                                .fillMaxWidth(),
                            color = Color.White,
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ),)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                                    .padding(13.dp),
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(painter = painterResource(id = journeykudua.gambar), contentDescription = "")
                                }
                                Spacer(modifier = Modifier.size(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(text = journeykudua.judul,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                    Text(text = journeykudua.waktu,fontFamily = namafont, fontSize = 9.sp)
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(9.dp))
                }
            }
        }
    }
}