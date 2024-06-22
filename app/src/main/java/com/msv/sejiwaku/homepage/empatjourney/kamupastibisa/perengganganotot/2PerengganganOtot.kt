package com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.perengganganotot

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.component.WaktuTimer
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.ui.theme.toska
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PerengganganOtot(
    navController: NavController
) {
    val mContext = LocalContext.current
    val mMediaPlayer = MediaPlayer.create(mContext, R.raw.audio1)
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.konselingdetailtombolback),
            contentDescription = "tombol back",
            modifier = Modifier
                .size(40.dp)
                .padding(start = 14.dp, top = 5.dp)
                .clickable { navController.navigate(BottonBarScreen.DetailKamuPastiBisaSatu.route) }
        )
        Spacer(modifier = Modifier.size(11.dp))
        Text(text = "Perenggangan Otot", fontFamily = inter, fontSize = 12.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 37.dp))
        Spacer(modifier = Modifier.size(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.perengganganotot),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
        }
        Spacer(modifier = Modifier.size(51.dp))
        Text(text = "Nama Perenggangan satu ini adalah Chest stretch in door, peranggangan ini akan membantu Anda mengontol nafas Anda, berikut caranya:\n" +
                "1. Berdirilah di tengah-tengah pintu yang terbuka.\n" +
                "2. Peganglah kedua sisi kosen pintu.\n" +
                "3. Condongkan tubuh ke depan pintu dengan melangkahkan salah satu kaki kedepan hingga melewati dada dan bahu.\n" +
                "4. Tahan selama 30 detik kemudian ulangi. Anda memang perlu rutin melakukan stretching, tapi hati-hati dengan risiko\n", fontSize = 12.sp, fontFamily = inter, modifier = Modifier.padding(start = 30.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.size(60.dp))
        WaktuTimer(timer = "00 : 30", colortext = Color.Black, colorbackground = toska, colorborder = Color.White, ukuranborder = 2, gambar = painterResource(
            id = R.drawable.buttonmulai
        )
        ) {
            //navigator
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(end = 18.dp, top = 30.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Surface(
                onClick = {
                    navController.navigate(BottonBarScreen.DetailKamuPastiBisaDua.route){
                        popUpTo(BottonBarScreen.DetailPereganganOtot.route){
                            inclusive = true
                        }
                    }
                }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lanjuthirupnapasperlahan),
                    contentDescription = "lanjut",
                    modifier = Modifier.size(width = 79.dp, height = 24.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHirupNafasPerlahan() {
    PerengganganOtot(navController = rememberNavController())
}