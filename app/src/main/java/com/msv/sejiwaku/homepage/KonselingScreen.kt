package com.msv.sejiwaku.homepage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.bagianonboardingnya.OnSatu
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.data.Datanya
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.data.MakananRow
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Halaman
import com.msv.sejiwaku.ui.theme.inter

data class KonselingData(
    val gambar: Int,
    val judul: String,
    val waktu: String,
    val rating: Double,
    val screen: Halaman
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KonselingScreen(
    navController: NavController
) {
    Spacer(modifier = Modifier.size(30.dp))
    val namafont = inter
    Scaffold(
        topBar = {

        },
        bottomBar = {
            BottomAppBar {
                Column {
                    Icon(imageVector = Icons.Default.Image, contentDescription = null)
                }
            }
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

//                    BasicTextField(
//                        value = pencarian,
//                        onValueChange = {
//                            pencarian = it
//                        },
//                        modifier = Modifier
//                            .background(
//                                Color(
//                                    red = 0.906f,
//                                    green = 0.906f,
//                                    blue = 0.906f,
//                                    alpha = 1.0f
//                                ), RoundedCornerShape(17.dp)
//                            )
//                            .padding(start = 10.dp, top = 7.dp, end = 10.dp)
//                            .height(27.dp)
//                            .width(270.dp),
//                        singleLine = true,
//                    )
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
                    val ukuran = 97.dp

                    val konselingsatu = listOf(
                        KonselingData(
                            gambar = R.drawable.fotokonseling1,
                            judul = "Rocky Sur",
                            waktu = "Berpengalaman dalam dunia psikologi selama 6 tahun. Dapat menyelesaikan berbagai masalah seperti stress dan depresi.",
                            rating = 4.5,
                            screen = Halaman.Ptsatu
                        ),
                        KonselingData(
                            gambar = R.drawable.fotokonseling2,
                            judul = "Rudi Bachrie",
                            waktu = "Berpengalaman dalam dunia psikologi selama 4 tahun. Dapat menyelesaikan berbagai masalah seperti mental illness.",
                            rating = 4.5,
                            screen = Halaman.Ptsatu
                        ),
//                    JourneyData(
//                        gambar = R.drawable.journey11,
//                        judul = "Kamu Pasti Bisa pt 3",
//                        waktu = "Durasi 3 hari",
//                        route = Halaman.Ptsatu.route
//                    ),
                    )
                    konselingsatu.map { konselingsatu ->
                        val isHalfStar = (konselingsatu.rating % 1) != 0.0
                        val star = 5
                        val rating = konselingsatu.rating
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
                                onClick = {
                                    navController.navigate(konselingsatu.screen.route) {
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            saveState = true
                                        }
                                        restoreState = true

                                    }
                                },
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
                                        .padding(
                                            top = 8.dp,
                                            bottom = 8.dp,
                                            start = 6.dp,
                                            end = 6.dp
                                        ),
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = konselingsatu.gambar),
                                            contentDescription = ""
                                        )
                                    }
                                    Spacer(modifier = Modifier.size(10.dp))
                                    Column(
                                        modifier = Modifier.fillMaxHeight(),
                                    ) {
                                        Text(text = konselingsatu.judul,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                        Text(text = konselingsatu.waktu,fontFamily = namafont, fontSize = 9.sp, lineHeight = 10.sp)
                                        Spacer(modifier = Modifier.size(4.dp))
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            for (index in 1..star){
                                                Icon(
                                                    modifier = Modifier
                                                        .clickable { index.toDouble() }
                                                        .size(11.dp),
                                                    contentDescription = null,
                                                    tint = Color(
                                                        red = 1.0f,
                                                        green = 0.663f,
                                                        blue = 0.008f,
                                                        alpha = 1.0f
                                                    ),
                                                    imageVector = if (index <= rating){
                                                        Icons.Rounded.Star
                                                    }else{
                                                        if (isHalfStar){
                                                            Icons.Rounded.StarHalf
                                                        } else {
                                                            Icons.Rounded.StarOutline
                                                        }
                                                    }
                                                )
                                            }
                                            Spacer(modifier = Modifier.size(4.dp))
                                            Text(text = konselingsatu.rating.toString(), fontSize = 11.sp)
                                        }
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.size(9.dp))
                    }
                }
                Spacer(modifier = Modifier.size(21.dp))
                Text(text = "Konseling Sekarang", fontSize = 12.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Text(text = "Yuk berkonseling sekarang juga agar kamu bisa tenang", fontSize = 9.sp, fontFamily = namafont, fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 13.dp))
                Spacer(modifier = Modifier.size(12.dp))
                Column(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    val ukuran = 97.dp

                    val konselingsatu = listOf(
                        KonselingData(
                            gambar = R.drawable.fotokonseling11,
                            judul = "Rudmi Rayan",
                            waktu = "Berpengalaman dalam dunia psikologi selama 2,5 tahun. Dapat menyelesaikan berbagai masalah seperti depresi berlebih.",
                            rating = 4.0,
                            screen = Halaman.Ptsatu
                        ),
                        KonselingData(
                            gambar = R.drawable.fotokonseling12,
                            judul = "Maria Jessi",
                            waktu = "Berpengalaman dalam dunia psikologi selama 3 tahun. Dapat menyelesaikan berbagai masalah seperti tidak percaya diri.",
                            rating = 4.0,
                            screen = Halaman.Ptsatu
                        ),
                        KonselingData(
                            gambar = R.drawable.fotokonseling13,
                            judul = "Michael",
                            waktu = "Berpengalaman dalam dunia psikologi selama 4 tahun. Dapat menyelesaikan berbagai masalah seperti stress dan depresi.",
                            rating = 4.0,
                            screen = Halaman.Ptsatu
                        ),
                    )
                    konselingsatu.map { konselingsatu ->
                        val isHalfStar = (konselingsatu.rating % 1) != 0.0
                        val star = 5
                        val rating = konselingsatu.rating
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
                                onClick = {
                                    navController.navigate(konselingsatu.screen.route) {
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            saveState = true
                                        }
                                        restoreState = true

                                    }
                                },
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
                                        .padding(
                                            top = 8.dp,
                                            bottom = 8.dp,
                                            start = 6.dp,
                                            end = 6.dp
                                        ),
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = konselingsatu.gambar),
                                            contentDescription = ""
                                        )
                                    }
                                    Spacer(modifier = Modifier.size(10.dp))
                                    Column(
                                        modifier = Modifier.fillMaxHeight(),
                                    ) {
                                        Text(text = konselingsatu.judul,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                        Text(text = konselingsatu.waktu,fontFamily = namafont, fontSize = 9.sp, lineHeight = 10.sp)
                                        Spacer(modifier = Modifier.size(4.dp))
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            for (index in 1..star){
                                                Icon(
                                                    modifier = Modifier
                                                        .clickable { index.toDouble() }
                                                        .size(11.dp),
                                                    contentDescription = null,
                                                    tint = Color(
                                                        red = 1.0f,
                                                        green = 0.663f,
                                                        blue = 0.008f,
                                                        alpha = 1.0f
                                                    ),
                                                    imageVector = if (index <= rating){
                                                        Icons.Rounded.Star
                                                    }else{
                                                        if (isHalfStar){
                                                            Icons.Rounded.StarHalf
                                                        } else {
                                                            Icons.Rounded.StarOutline
                                                        }
                                                    }
                                                )
                                            }
                                            Spacer(modifier = Modifier.size(4.dp))
                                            Text(text = konselingsatu.rating.toString(), fontSize = 11.sp)
                                        }
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.size(9.dp))
                    }
                }
                //MyListpertama(gambar = gambar, kata = kata)
            }
        }
    }
}

@Preview
@Composable
private fun PreviewKonseling() {
    KonselingScreen(navController = rememberNavController())
}


//@Composable
//fun MyListpertama(
//    modifier: Modifier = Modifier,
//    gambar: List<String>,
//    kata:List<String>,
//    makananRows: List<MakananRow> = Datanya.makananLazyRow,
//) {
//    Column(
//        modifier=Modifier.fillMaxWidth()
//    ) {
//
//        LazyColumn(
//            modifier = Modifier.padding(10.dp)
//        ) {
//            items(items = gambar){
//                Listpertama(gambar = it)
//            }
//        }
//    }
//}
//
//
//@Composable
//fun Listpertama(
//    gambar : String,
////    makananRow: MakananRow
//) {
//    Column(
//        modifier = Modifier.padding(10.dp)
//    ) {
//        val namafont = inter
//        Text(text = gambar)
//        //Text(text = makananRow.asal)
//    }
//}