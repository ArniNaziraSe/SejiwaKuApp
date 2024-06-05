package com.msv.sejiwaku.homepage.journey.kamupastibisa

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
import com.msv.sejiwaku.homepage.journey.menerimadiri.component.BagianTombolMenerimaDiriPt1
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.navigator.BottonBarScreen

@Composable
fun KamuPastiBisaScreenTiga(
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
                .clickable { navController.navigate(BottonBarScreen.DetailKamuPastiBisaSatu.route) }
        )
        Spacer(modifier = Modifier.size(13.dp))
        Text(text = "Menerima Diri pt 1", fontSize = 12.sp, fontWeight = FontWeight.Bold, fontFamily = inter, modifier = Modifier.padding(start = 25.dp))
        Text(text = "Yuk pahami pikiran dan perasaanmu melalui refleksi dalam journey ini", fontSize = 9.sp, fontFamily = inter, modifier = Modifier.padding(start = 25.dp))
        Spacer(modifier = Modifier.size(11.dp))
        BagianTombolMenerimaDiriPt1(
            gambarnya = R.drawable.gambarmenrrimadiri1,
            judulnya = "Hirup Nafas Perlahan",
            waktunya = "15 menit",
            onClick = {},
            lebar = 334,
            cheklish = painterResource(id = R.drawable.cheklish),
            alpha = 1f,
            ukurancheklish = 63
        )
        Spacer(modifier = Modifier.size(11.dp))
        BagianTombolMenerimaDiriPt1(
            gambarnya = R.drawable.gambarmenrrimadiri2,
            judulnya = "Dengarkan Musik Tenang",
            waktunya = "3 menit",
            onClick = {},
            lebar = 334,
            cheklish = painterResource(id = R.drawable.cheklish),
            alpha = 1f,
            ukurancheklish = 40
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewMenerimaDiriScreen() {
    KamuPastiBisaScreenTiga(navController = rememberNavController())
}