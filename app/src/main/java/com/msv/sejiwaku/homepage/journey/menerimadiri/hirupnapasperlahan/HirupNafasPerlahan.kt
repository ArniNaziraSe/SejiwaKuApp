package com.msv.sejiwaku.homepage.journey.menerimadiri.hirupnapasperlahan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun HirupNafasPerlahan() {
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
        Text(text = "Hirup Nafas Perlahan", fontFamily = inter, fontSize = 12.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 37.dp))
        Spacer(modifier = Modifier.size(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.gambarmenrrimadiri1),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
        }
        Spacer(modifier = Modifier.size(51.dp))
        Text(text = "Mari lakukan ini bersama\n" +
                "1. Regangkan tubuhmu\n" +
                "2. Cari posisi yang pas untukmu\n" +
                "3. Coba berdiri dengan tegak\n" +
                "4. Pejamkan matamu\n" +
                "5. Hirup nafasmu dengan durasi 5 detik\n" +
                "6. Buang nafasmu dengan durasi 3 detik\n" +
                "7. Lakukan sebanyak 3 repetisi\n" +
                "8. Lakukan dalam 3 menit", fontSize = 12.sp, fontFamily = inter, modifier = Modifier.padding(start = 30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHirupNafasPerlahan() {
    HirupNafasPerlahan()
}