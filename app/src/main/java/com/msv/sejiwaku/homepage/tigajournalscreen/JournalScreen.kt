package com.msv.sejiwaku.homepage.tigajournalscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.tigajournalscreen.component.JurnalLanjutan
import com.msv.sejiwaku.homepage.tigajournalscreen.component.LihatRiwayatJurnal
import com.msv.sejiwaku.homepage.tigajournalscreen.component.LihatSemua
import com.msv.sejiwaku.homepage.tigajournalscreen.component.MyDailyJurnal
import com.msv.sejiwaku.homepage.tigajournalscreen.component.TopikDariSejiwaku
import com.msv.sejiwaku.sda.navigator.BottonBarScreen

@Composable
fun JournalScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {

        },
        bottomBar = {

        }
    ) {contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            Spacer(modifier = Modifier.size(69.dp))
            LihatRiwayatJurnal()
            Spacer(modifier = Modifier.size(15.dp))
            MyDailyJurnal(
                onClick = {navController.navigate(BottonBarScreen.JournalScreen1.route)}
            )
            Spacer(modifier = Modifier.size(21.dp))
            Column(
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Text(text = "Lanjutkan Jurnalmu", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = "Jangan lupakan jurnalmu ya, karena jurnal ini adalah curahan hatimu", fontSize = 9.sp)
            }
            Spacer(modifier = Modifier.size(12.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(start = 15.dp),

                ) {
                    JurnalLanjutan(
                        gambar = R.drawable.journalgambardua,
                        judul = "Aku Bukanlah  Pecundang Lagi"
                    )
                    LihatSemua(
                        onClick = {navController.navigate(BottonBarScreen.Detail.route)}
                    )
                }
            }
            Spacer(modifier = Modifier.size(9.dp))
            // Buat garisnya
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .background(
                        Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                    )
            ) {
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column(
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Text(text = "Topik Jurnal dari  SejiwaKu", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = "Pilih salah satu jurnal dan mulai menulis segala isi hatimu", fontSize = 9.sp)
            }
            Spacer(modifier = Modifier.size(10.dp))
            TopikDariSejiwaku(
                text1 = "Kenali Dirimu Dengan Baik",
                text2 = "Curahkan segala perasaan yang ada dalam dirimu",
                onClick = {navController.navigate(BottonBarScreen.Detail.route)}
            )
            Spacer(modifier = Modifier.size(10.dp))
            TopikDariSejiwaku(
                text1 = "Ketahui potensi dirimu",
                text2 = "Akan selalu ada jalan untuk dirimu, jangan pernah takut untuk mengetahui potensimu",
                onClick = {navController.navigate(BottonBarScreen.Detail.route)}
            )
        }
    }
}

@Preview
@Composable
private fun PreviewJournal() {
    JournalScreen(
        navController = rememberNavController()
    )
}