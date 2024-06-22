package com.msv.sejiwaku.homepage.empatjourney

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.empatjourney.component.TemplateIsiJourney
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
//import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import androidx.compose.runtime.collectAsState
import com.msv.sejiwaku.sda.logindata.DataStoreJourneySatu

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
        val context = LocalContext.current
        val coroutineScope = rememberCoroutineScope()
        val dataStore = DataStoreJourneyDua(context)
        val dataStoreDua = DataStoreJourneySatu(context)
        val scrollState = rememberScrollState()
        val statusUiKey = dataStore.getStatusUi.collectAsState(initial = false)
        val statusUiKeydua = dataStoreDua.getStatusUijourneysatu.collectAsState(initial = false)

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
                    onClick = {
                        if (statusUiKeydua.value){
                            navController.navigate(BottonBarScreen.DetailMenerimaDiriScreenTiga.route){
                                popUpTo(BottonBarScreen.Journey.route){
                                    inclusive = true
                                }
                            }
                        } else {
                            navController.navigate(BottonBarScreen.DetailMenerimaDiript1.route){
                                popUpTo(BottonBarScreen.Journey.route){
                                    inclusive = true
                                }
                            }
                        }
                    }
                )
                Spacer(modifier = Modifier.size(7.dp))
                Text(text = "Kamu Pasti Bisa", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = warnaabuabu, modifier = Modifier.padding(start = 5.dp))
                Spacer(modifier = Modifier.size(4.dp))
                TemplateIsiJourney(
                    gambar = R.drawable.journey11,
                    judul = "Kamu Pasti Bisa pt 1",
                    waktu = "Durasi 3 hari",
                    onClick = {
                        if (statusUiKey.value){
                            navController.navigate(BottonBarScreen.DetailKamuPastiBisaTiga.route){
                                popUpTo(BottonBarScreen.Journey.route){
                                    inclusive = true
                                }
                            }
                        } else {
                            navController.navigate(BottonBarScreen.DetailKamuPastiBisaSatu.route){
                                popUpTo(BottonBarScreen.Journey.route){
                                    inclusive = true
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}