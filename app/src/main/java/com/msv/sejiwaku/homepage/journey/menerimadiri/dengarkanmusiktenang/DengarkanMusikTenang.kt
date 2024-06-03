package com.msv.sejiwaku.homepage.journey.menerimadiri.dengarkanmusiktenang

import android.media.MediaPlayer
import androidx.compose.foundation.Image
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
import com.msv.sejiwaku.homepage.journey.menerimadiri.component.WaktuTimer
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.ui.theme.toska

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DengarkanMusikTenang(
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
        )
        Spacer(modifier = Modifier.size(11.dp))
        Text(text = "Dengarkan Lagu Pertama ini Untuk Meredakan Emosimu", fontFamily = inter, fontSize = 12.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 37.dp))
        Spacer(modifier = Modifier.size(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.gambarmenrrimadiri2),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
        }
        Spacer(modifier = Modifier.size(51.dp))
        Text(text = "Mari lakukan ini bersama\n" +
                "1. Tarik nafasmu perlahan\n" +
                "2. Buang nafas lewat mulut perlahan\n" +
                "3. Cari tempat ternyamanmu\n" +
                "4. Pejamkan matamu\n" +
                "5. Dengarkan lagu sampai habis\n" +
                "6. Kamu bisa mendengarkannya sambil menggunakan hetset kesayanganmu itu", fontSize = 12.sp, fontFamily = inter, modifier = Modifier.padding(start = 30.dp)
        )
        Spacer(modifier = Modifier.size(60.dp))
        WaktuTimer(timer = "03 : 00", colortext = Color.Black, colorbackground = toska, colorborder = Color.White, ukuranborder = 2, gambar = painterResource(
            id = R.drawable.buttonmulai
        )
        ) {
            //navigator
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHirupNafasPerlahan() {
    DengarkanMusikTenang(navController = rememberNavController())
}