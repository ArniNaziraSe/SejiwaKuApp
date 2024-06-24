package com.msv.sejiwaku.homepage.empatjourney.kamupastibisa

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.component.BagianTombolMenerimaDiriPt1
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun KamuPastiBisaScreenSatu(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.konselingdetailtombolback),
            contentDescription = "tombol back",
            modifier = Modifier
                .size(40.dp)
                .padding(start = 14.dp, top = 5.dp)
                .clickable { navController.navigate(BottonBarScreen.Journey.route) }
        )
        Spacer(modifier = Modifier.size(13.dp))
        Text(text = "Kamu Pasti Bisa pt 1", fontSize = 12.sp, fontWeight = FontWeight.Bold, fontFamily = inter, modifier = Modifier.padding(start = 25.dp))
        Text(text = "Yuk pahami pikiran dan perasaanmu melalui refleksi dalam journey ini", fontSize = 9.sp, fontFamily = inter, modifier = Modifier.padding(start = 25.dp))
        Spacer(modifier = Modifier.size(11.dp))
        BagianTombolMenerimaDiriPt1(
            gambarnya = R.drawable.gambarkamupastibisadepansatu,
            judulnya = "Perenggangan Otot",
            waktunya = "1 menit",
            onClick = {
                navController.navigate(BottonBarScreen.DetailPereganganOtot.route){
                    popUpTo(BottonBarScreen.DetailKamuPastiBisaSatu.route){
                        inclusive = true
                    }
                }
                      },
            lebar = 334,
            cheklish = painterResource(id = R.drawable.cheklish),
            alpha = 0.0f,
            ukurancheklish = 40
        )
        Spacer(modifier = Modifier.size(11.dp))
        BagianTombolMenerimaDiriPt1(
            gambarnya = R.drawable.gambarkamupastibisadepandua,
            judulnya = "Curhat Pada Diri Sendiri",
            waktunya = "10 menit",
            onClick = {},
            lebar = 334,
            cheklish = painterResource(id = R.drawable.cheklish),
            alpha = 0.0f,
            ukurancheklish = 40
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewMenerimaDiriScreen() {
    KamuPastiBisaScreenSatu(navController = rememberNavController())
}