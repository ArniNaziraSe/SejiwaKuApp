package com.msv.sejiwaku.inJurnal.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun Screen5() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 30.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(painter = painterResource(
                    id = R.drawable.journallanjut),
                    contentDescription = "history",
                    modifier = Modifier.padding(top = 10.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column {
                    Text(text = "Lihat Riwayat Jurnal")
                    Text(text = "Daftar jurnal yang telah selesai kamu tulis", fontSize = 10.sp)
                }
                Spacer(modifier = Modifier.width(50.dp))
                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = "tombol history",
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Pilih Jurnal", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Text(text = "Pilih jenis jurnal yang kamu inginkan", fontSize = 12.sp)
        Spacer(modifier = Modifier.height(32.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxWidth()) {
            item {
                JournalOption(
                    iconId = R.drawable.write_jurnal,
                    title = "Menulis",
                    description = "Tulis apa yang ingin kamu ..."
                )
            }
            item {
                JournalOption(
                    iconId = R.drawable.gambar_jurnal,
                    title = "Gambar",
                    description = "Gambar apa yang ingin kamu ..."
                )
            }
        }
        Spacer(modifier = Modifier.height(48.dp))
        Text(text = "My Daily Journal", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Text(text = "Pilih salah satu jurnal dan mulai melanjutkan jurnal yang telah kamu buat", fontSize = 12.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ) {
                Column {
                    Text(text = "Apakah aku menjadi lebih baik")
                    Text(
                        text = "Curahkan segala perasaan yang ada dalam dirimu",
                        fontSize = 10.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2,
                        modifier = Modifier.width(200.dp)
                    )
                }
                Spacer(modifier = Modifier.width(40.dp))
                Icon(
                    painter = painterResource(id = R.drawable.write_jurnal),
                    contentDescription = "daily riwayat",
                    modifier = Modifier.padding(top = 12.dp)
                )
            }
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ) {
                Column {
                    Text(
                        text = "Bagaimana bisa menjadi lebih baik",
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        modifier = Modifier.width(200.dp)
                    )
                    Text(
                        text = "Akan selalu ada jalan untuk dirimu, jangan pernah takut untuk mengetahui potensimu",
                        fontSize = 10.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2,
                        modifier = Modifier.width(200.dp)
                    )
                }
                Spacer(modifier = Modifier.width(40.dp))
                Icon(
                    painter = painterResource(id = R.drawable.gambar_jurnal),
                    contentDescription = "daily riwayat",
                    modifier = Modifier.padding(top = 12.dp)
                )
            }
        }
    }
}

@Composable
fun JournalOption(iconId: Int, title: String, description: String) {
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
            Spacer(modifier = Modifier.height(12.dp))
            Column {
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = description, fontSize = 8.sp, color = Color.Gray)
            }
        }
    }
}

@Preview
@Composable
private fun Screen5Preview() {
    SejiwakuTheme {
        Screen5()
    }
}