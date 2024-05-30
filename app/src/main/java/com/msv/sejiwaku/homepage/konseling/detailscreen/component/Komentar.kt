package com.msv.sejiwaku.homepage.konseling.detailscreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun Komentar(
    images:Int,
    namakomentar:String,
    datetime:String,
    deskripsikomentar:String
) {
    Row(
        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
    ) {
        Column {
            Image(painter = painterResource(id = images), contentDescription = null, modifier = Modifier.clip(
                CircleShape))
        }
        Spacer(modifier = Modifier.size(5.dp))
        Column {
            Text(text = namakomentar, fontFamily = inter, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.kotakkotak), contentDescription = null, modifier = Modifier.size(10.dp))
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = datetime, fontSize = 9.sp,)
            }
            Spacer(modifier = Modifier.size(11.dp))
            Garis(tinggi = 2, lebar = 70)
            Spacer(modifier = Modifier.size(11.dp))
            Text(text = deskripsikomentar, fontSize = 9.sp, lineHeight = 9.sp, modifier = Modifier.padding(end = 7.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKomentar() {
    Komentar(
        R.drawable.examplekomentar,
        "Sukijan",
        "20 Nov 2023",
        "Dokternya enak, sangat asik untuk diajak berbicara. Selain itu dokternya juga sangat berpengalaman dibidangnya."
    )
}