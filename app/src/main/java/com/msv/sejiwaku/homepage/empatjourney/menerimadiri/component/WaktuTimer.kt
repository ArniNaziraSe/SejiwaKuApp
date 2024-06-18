package com.msv.sejiwaku.homepage.empatjourney.menerimadiri.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WaktuTimer(
    timer:String,
    colortext:Color,
    colorbackground:Color,
    colorborder: Color,
    ukuranborder:Int,
    gambar:Painter,
    onClick:()->Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.size(width = 321.dp, height = 79.dp),
            color = colorbackground,
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(ukuranborder.dp, color = colorborder)
        ) {
            Row(

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = timer, fontFamily = inter, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = colortext)
                Surface(
                    onClick = onClick,
                    shape = RoundedCornerShape(7.dp)
                ) {
                    Image(painter = gambar, contentDescription = "gambarnya")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewWaktuTimer() {
    WaktuTimer(
        timer = "05:00",
        colortext = Color.White,
        colorbackground = Color.Red,
        colorborder = Color.Transparent,
        ukuranborder = 2,
        gambar = painterResource(id = R.drawable.buttonmulai)
    ) {

    }
}