package com.msv.sejiwaku.homepage.journey.menerimadiri.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun WaktuTimerDalam(
    timer:String,
    colortext: Color,
    colorbackground: Color,
    colorborder: Color,
    ukuranborder:Int,
    onClicksatu:()->Unit,
    onClickdua:()->Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.size(width = 321.dp, height = 85.dp),
            color = colorbackground,
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(ukuranborder.dp, color = colorborder)
        ) {
            Row(

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = timer, fontFamily = inter, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = colortext)
                Column(

                ) {
                    Surface(
                        onClick = onClicksatu,
                        shape = RoundedCornerShape(7.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.buttonmulai), contentDescription = "gambarnya", modifier = Modifier.size(width = 79.dp, height = 24.dp))
                    }
                    Surface(
                        onClick = onClickdua,
                        shape = RoundedCornerShape(7.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.buttonpause), contentDescription = "gambarnya", modifier = Modifier.size(width = 79.dp, height = 24.dp))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewWaktuTimerDalam() {
    WaktuTimerDalam(
        timer = "15:00",
        colortext = Color.White,
        colorbackground = Color.Red,
        colorborder = Color.Transparent,
        ukuranborder = 2,
        onClicksatu = {},
        onClickdua = {}
    )
}