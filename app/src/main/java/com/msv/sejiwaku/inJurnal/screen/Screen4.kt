package com.msv.sejiwaku.inJurnal.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun Screen4() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.journallanjut), contentDescription = "history")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Lihat Riwayat Jurnal")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Pilih Jurnal", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            JournalOption(
                iconId = R.drawable.write_jurnal,
                title = "Menulis",
                description = "Tulis apa yang ingin kamu ..."
            )
            JournalOption(
                iconId = R.drawable.gambar_jurnal,
                title = "Gambar",
                description = "Gambar apa yang ingin kamu ..."
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "My Daily Journal", fontWeight = FontWeight.Bold, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Daily Journalmu masih kosong nih", color = Color.Gray)
        }
    }
}

@Composable
fun JournalOption(iconId: Int, title: String, description: String) {
    Row {
        Card(
            shape = RoundedCornerShape((8.dp)),
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(painter = painterResource(id = iconId), contentDescription = title, tint = Color(0xFF33B9AC), modifier = Modifier.size(48.dp))
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = description, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}

@Preview
@Composable
private fun Screen4Preview() {
    SejiwakuTheme {
        Screen4()
    }
}