package com.msv.sejiwaku.bagianonboardingnya

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.sda.logindata.SharedPreferencesManager
import com.msv.sejiwaku.sda.navigator.BagianLoginDanTemannya
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
import com.msv.sejiwaku.ui.theme.inter

data class OnSatu(
    val judul1: String,
    val text1: String,
    val gambar1 : Int,
)



@Composable
fun HalamanOnboarding1(navController: NavController) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    val dataStore = DataStoreJourneyDua(context)
    val perpindahan = {
//        coroutineScope.launch {
//            dataStore.saveStatus(true)
//        }
        navController.navigate(BagianLoginDanTemannya.OnboardingKedua.route) {
            popUpTo(BagianLoginDanTemannya.OnboardingPertama.route) {
                inclusive = true
            }
        }
    }
    val namafont = inter
    val ukuran = 97.dp
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    )
                )
                .height(67.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Sejiwaku", fontFamily = namafont, fontSize = 28.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        //////////============///////////===========
        Text(text = "Bagaimana perasaanmu saat ini?", fontFamily = namafont, modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 16.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            val onboarding1 = listOf(
                OnSatu(
                    judul1 = "Sangat Buruk",
                    text1 = "Perasaanku sangat buruk kali ini...:(",
                    gambar1 = R.drawable.on1
                ),
                OnSatu(
                    judul1 = "Buruk",
                    text1 = "Perasaanku buruk kali ini.....:(",
                    gambar1 = R.drawable.on2
                ),
                OnSatu(
                    judul1 = "Netral",
                    text1 = "Perasaanku biasa aja.....:|",
                    gambar1 = R.drawable.on3
                ),
                OnSatu(
                    judul1 = "Baik",
                    text1 = "Perasaanku baik aja....:(",
                    gambar1 = R.drawable.on4
                ),
                OnSatu(
                    judul1 = "Sangat Baik",
                    text1 = "Perasaanku sangat baik kali ini.....:)",
                    gambar1 = R.drawable.on5
                ),
            )
            onboarding1.map { onboarding1 ->
                Spacer(modifier = Modifier.size(9.dp))
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
                                Image(painter = painterResource(id = onboarding1.gambar1), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = onboarding1.judul1,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                Text(text = onboarding1.text1,fontFamily = namafont, fontSize = 9.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

////////////////////////////////////////
@Composable
fun HalamanOnboarding2(navController: NavController) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    val dataStore = DataStoreJourneyDua(context)
    val perpindahan = {
//        coroutineScope.launch {
//            dataStore.saveStatus(true)
//        }
        navController.navigate(BagianLoginDanTemannya.OnboardingKetiga.route){
            popUpTo(BagianLoginDanTemannya.OnboardingKedua.route) {
                inclusive = true
            }
        }
    }
    val namafont = inter
    val ukuran = 97.dp
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    )
                )
                .height(67.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Sejiwaku", fontFamily = namafont, fontSize = 28.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        //////////============///////////===========
        Text(text = "Emosi apa yang saat ini sedang kamu keluarkan?", fontFamily = namafont, modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 16.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            val onboarding1 = listOf(
                OnSatu(
                    judul1 = "Marah",
                    text1 = "Perasaanku sangat buruk kali ini...:(",
                    gambar1 = R.drawable.on6
                ),
                OnSatu(
                    judul1 = "Sedih",
                    text1 = "Perasaanku buruk kali ini.....:(",
                    gambar1 = R.drawable.on7
                ),
                OnSatu(
                    judul1 = "Takut",
                    text1 = "Perasaanku biasa aja.....:|",
                    gambar1 = R.drawable.on8
                ),
                OnSatu(
                    judul1 = "Galau",
                    text1 = "Perasaanku baik aja....:(",
                    gambar1 = R.drawable.on9
                ),
                OnSatu(
                    judul1 = "       Pusing",
                    text1 = "         Perasaanku sangat baik kali ini.....:)",
                    gambar1 = R.drawable.on10
                ),
            )
            onboarding1.map { onboarding1 ->
                Spacer(modifier = Modifier.size(9.dp))
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
                                Image(painter = painterResource(id = onboarding1.gambar1), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = onboarding1.judul1,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                Text(text = onboarding1.text1,fontFamily = namafont, fontSize = 9.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

///////////////////////////////////////////

@Composable
fun HalamanOnboarding3(navController: NavController) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    val dataStore = DataStoreJourneyDua(context)
    val perpindahan = {
//        coroutineScope.launch {
//            dataStore.saveStatus(true)
//        }
        navController.navigate(BagianLoginDanTemannya.HasilOnboarding.route){
            popUpTo(BagianLoginDanTemannya.OnboardingKetiga.route) {
                inclusive = true
            }
        }
    }
    val namafont = inter
    val ukuran = 97.dp
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    )
                )
                .height(67.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Sejiwaku", fontFamily = namafont, fontSize = 28.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        //////////============///////////===========
        Text(text = "Apa yang membuat kamu merasa seperti itu?", fontFamily = namafont, modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 16.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            val onboarding1 = listOf(
                OnSatu(
                    judul1 = "Diri Sendiri",
                    text1 = "Perasaanku sangat buruk kali ini...:(",
                    gambar1 = R.drawable.on11
                ),
                OnSatu(
                    judul1 = "Keluarga",
                    text1 = "Perasaanku buruk kali ini.....:(",
                    gambar1 = R.drawable.on12
                ),
                OnSatu(
                    judul1 = "Teman",
                    text1 = "Perasaanku biasa aja.....:|",
                    gambar1 = R.drawable.on13
                ),
                OnSatu(
                    judul1 = "Lingkungan",
                    text1 = "Perasaanku baik aja....:(",
                    gambar1 = R.drawable.on14
                ),
                OnSatu(
                    judul1 = "Pekerjaan",
                    text1 = "Perasaanku sangat baik kali ini.....:)",
                    gambar1 = R.drawable.on15
                ),
            )
            onboarding1.map { onboarding1 ->
                Spacer(modifier = Modifier.size(9.dp))
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
                                Image(painter = painterResource(id = onboarding1.gambar1), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = onboarding1.judul1,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                Text(text = onboarding1.text1,fontFamily = namafont, fontSize = 9.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
private fun Preview1() {
    //HalamanOnboarding1()
}

//@Preview(showBackground = true)
@Composable
private fun Preview2() {
    //HalamanOnboarding2()
}

@Preview(showBackground = true)
@Composable
private fun Preview3() {
    //HalamanOnboarding3()
}