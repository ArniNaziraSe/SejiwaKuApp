package com.msv.sejiwaku.homepage.tigajournalscreen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
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
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun JurnalLanjutan(
    gambar:Int,
    judul:String
) {
    Surface(
        modifier = Modifier
            .height(126.dp)
            .width(148.dp),
        border = BorderStroke(2.dp, Color(
            red = 0.2f,
            green = 0.725f,
            blue = 0.675f,
            alpha = 1.0f
        )
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = gambar), contentDescription = null, modifier = Modifier
                    .size(width = 120.dp, height = 73.dp)
                    .padding())

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = judul,
                    fontSize = 9.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(106.dp).padding(start = 10.dp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

        }
    }
}
@Composable
fun ScrollViewWithEllipsisExample() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        repeat(20) {
            Text(
                text = "Item $it Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut bibendum odio non ex lacinia...",
                modifier = Modifier
                    .padding(8.dp),
                maxLines = 1, // Batasi jumlah baris menjadi 1
                overflow = TextOverflow.Ellipsis // Atur overflow menjadi ellipsis
            )
        }
    }
}

@Preview
@Composable
private fun PreviewLagi() {
    JurnalLanjutan(
        gambar = R.drawable.journalgambardua,
        judul = "Aku Bukanlah  Pecundang Lagi"
    )
}