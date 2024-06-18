package com.msv.sejiwaku.homepage.duakonseling

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.duakonseling.component.ColumnKonselingPertama
import com.msv.sejiwaku.sda.navigator.BottonBarScreen
import com.msv.sejiwaku.sda.navigator.Urutan
import com.msv.sejiwaku.ui.theme.inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KonselingScreen(
    navController: NavController,
    onClik: () -> Unit
) {
    Spacer(modifier = Modifier.size(30.dp))
    Scaffold(
        topBar = {

        },
        bottomBar = {

        }

    ) {contentPadding ->
        //IsiKonselingnya(modifier = Modifier.padding(contentPadding))
        val namafont = inter
        var pencarian by remember {
            mutableStateOf("")
        }
        val scrollState = rememberScrollState()
        Box {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_saja),
                    contentDescription = "logo",
                    modifier = Modifier.size(123.dp),
                    alpha = 0.3f
                )
            }
            Column(
                modifier = Modifier
                    .padding(contentPadding)
                    .verticalScroll(scrollState),
            ) {
                Spacer(modifier = Modifier.size(70.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box {
                        Column(
                            modifier = Modifier.padding(top = 10.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .background(
                                        Color(
                                            red = 0.2f,
                                            green = 0.725f,
                                            blue = 0.675f,
                                            alpha = 1.0f
                                        ), RoundedCornerShape(17.dp)
                                    )
                                    .padding(start = 10.dp, top = 7.dp, end = 10.dp)
                                    .height(29.dp)
                                    .width(270.dp)
                            ) {

                            }
                        }
                        Column(
                            modifier = Modifier.padding(top = 10.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .background(
                                        Color(
                                            red = 0.906f,
                                            green = 0.906f,
                                            blue = 0.906f,
                                            alpha = 1.0f
                                        ), RoundedCornerShape(17.dp)
                                    )
                                    .padding(start = 10.dp, top = 7.dp, end = 10.dp)
                                    .height(26.dp)
                                    .width(270.dp)
                            ) {

                            }
                        }
                        TextField(
                            value = pencarian,
                            onValueChange = {
                                pencarian = it
                            },
                            placeholder = {
                                Text(text = "Cari konseling offline di sekitarmu", fontSize = 12.sp, color = Color(
                                    red = 0.525f,
                                    green = 0.525f,
                                    blue = 0.525f,
                                    alpha = 1.0f
                                )
                                )
                            },
                            leadingIcon = {
                                Image(
                                    painter = painterResource(id = R.drawable.pencarian),
                                    contentDescription = "pencarian di jurney",
                                    modifier = Modifier.size(15.dp)
                                )
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                cursorColor = Color.Black,
                                focusedTextColor = Color.Black,
                                focusedTrailingIconColor = Color.Red,
                                unfocusedTrailingIconColor = Color.Red,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                containerColor = Color.Transparent
                            )
                        )
                    }

                }
                Spacer(modifier = Modifier.size(21.dp))
                Text(text = "Rekomendasi Untukmu", fontSize = 12.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Text(text = "Yuk berkonseling terekomendasi untuk permasalahan yang kamu alami", fontSize = 9.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Spacer(modifier = Modifier.size(12.dp))
                Column(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    ColumnKonselingPertama(
                        rating = 4.5,
                        screen = { Urutan.DETAILHOMESATU },
                        gambar = R.drawable.fotokonseling1,
                        nama = "Rocky Sur",
                        deskripsi = "Berpengalaman dalam dunia psikologi selama 6 tahun. Dapat menyelesaikan berbagai masalah seperti stress dan depresi."
                    )
                    Spacer(modifier = Modifier.size(9.dp))
                    ColumnKonselingPertama(
                        rating = 4.5,
                        screen = { Urutan.DETAILHOMESATU },
                        gambar = R.drawable.fotokonseling2,
                        nama = "Rudi Bachrie",
                        deskripsi = "Berpengalaman dalam dunia psikologi selama 4 tahun. Dapat menyelesaikan berbagai masalah seperti mental illness."
                    )
                }
                Spacer(modifier = Modifier.size(21.dp))
                Text(text = "Konseling Sekarang", fontSize = 12.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Text(text = "Yuk berkonseling sekarang juga agar kamu bisa tenang", fontSize = 9.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Spacer(modifier = Modifier.size(12.dp))
                Column(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    ColumnKonselingPertama(
                        rating = 4.0,
                        screen = onClik,
                        gambar = R.drawable.fotokonseling11,
                        nama = "Rudmi Rayan",
                        deskripsi = "Berpengalaman dalam dunia psikologi selama 2,5 tahun. Dapat menyelesaikan berbagai masalah seperti depresi berlebih."
                    )
                    Spacer(modifier = Modifier.size(9.dp))
                    ColumnKonselingPertama(
                        rating = 4.0,
                        screen = { navController.navigate(BottonBarScreen.Detail.route) },
                        gambar = R.drawable.fotokonseling12,
                        nama = "Maria Jessi",
                        deskripsi = "Berpengalaman dalam dunia psikologi selama 3 tahun. Dapat menyelesaikan berbagai masalah seperti tidak percaya diri."
                    )
                    Spacer(modifier = Modifier.size(9.dp))
                    ColumnKonselingPertama(
                        rating = 4.0,
                        screen = { Urutan.DETAILHOMESATU },
                        gambar = R.drawable.fotokonseling13,
                        nama = "Michael",
                        deskripsi = "Berpengalaman dalam dunia psikologi selama 4 tahun. Dapat menyelesaikan berbagai masalah seperti stress dan depresi."
                    )
                }
            }
        }
    }
}