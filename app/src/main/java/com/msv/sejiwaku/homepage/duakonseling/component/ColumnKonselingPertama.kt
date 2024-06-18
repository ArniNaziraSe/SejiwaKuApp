package com.msv.sejiwaku.homepage.duakonseling.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.sda.navigator.Urutan
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun ColumnKonselingPertama(
    rating:Double,
    screen:() -> Unit,
    gambar:Int,
    nama:String,
    deskripsi:String

) {
    val namafont = inter
    val ukuran = 97.dp
    val isHalfStar = (rating % 1) != 0.0
    val star = 5
    val rating = rating
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
            onClick = screen,
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
                    .padding(
                        top = 8.dp,
                        bottom = 8.dp,
                        start = 6.dp,
                        end = 6.dp
                    ),
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = gambar),
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                ) {
                    Text(text = nama,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Text(text = deskripsi,fontFamily = namafont, fontSize = 9.sp, lineHeight = 10.sp)
                    Spacer(modifier = Modifier.size(4.dp))
                    Bintang(rating = 4.5)
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewTes() {
    ColumnKonselingPertama(
        rating = 4.5,
        screen = { Urutan.DETAILHOMESATU },
        gambar = R.drawable.fotokonseling1,
        nama = "Siapa",
        deskripsi = "Berpengalaman dalam dunia psikologi selama 6 tahun. Dapat menyelesaikan berbagai masalah seperti stress dan depresi."
    )
}