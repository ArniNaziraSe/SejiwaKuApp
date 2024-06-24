package com.msv.sejiwaku.pembayaranpremium.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun HeaderPembayaran(
    judul:String,
    onClick:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(67.dp)
    ) {
        Row {
            Column(
                modifier = Modifier
                    .width(50.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(painter = painterResource(id = R.drawable.backdua), contentDescription = "back", colorFilter = ColorFilter.tint(
                    Tosca), modifier = Modifier.clickable { onClick() }.width(20.dp).height(20.dp))
            }
            Column(
                modifier = Modifier.width(270.dp).fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = judul, fontSize = 21.sp, fontWeight = FontWeight.ExtraBold, fontFamily = inter, color = Tosca)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHeaderPembayaran() {
    SejiwakuTheme {
        HeaderPembayaran(judul = "Example") {
            
        }
    }
}