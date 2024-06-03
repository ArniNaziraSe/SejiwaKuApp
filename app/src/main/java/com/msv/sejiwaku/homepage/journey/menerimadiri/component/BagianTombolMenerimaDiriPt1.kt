package com.msv.sejiwaku.homepage.journey.menerimadiri.component

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun BagianTombolMenerimaDiriPt1(
    gambarnya:Int,
    judulnya:String,
    waktunya:String,
    onClick:() -> Unit,
    lebar:Int,
    cheklish:Painter,
    alpha:Float,
    ukurancheklish:Int
) {
    val namafont = inter
    val ukuran = 97.dp
    val warnaabuabu = Color(red = 0.518f, green = 0.518f, blue = 0.518f, alpha = 1.0f)
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Surface(
                modifier = Modifier
                    .clickable { }
                    .height(ukuran)
                    .width(lebar.dp),
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
                onClick = onClick,
                modifier = Modifier
                    .height(94.dp)
                    .width(lebar.dp),
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
                        .padding(13.dp),
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = painterResource(id = gambarnya), contentDescription = "")
                    }
                    Spacer(modifier = Modifier.size(20.dp))
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = judulnya,fontFamily = namafont, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        Text(text = waktunya,fontFamily = namafont, fontSize = 9.sp)
                    }
                    Spacer(modifier = Modifier.size(ukurancheklish.dp))
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(painter = cheklish, contentDescription = "cheklish", modifier = Modifier.size(22.dp), alpha = alpha)
                    }
                }
            }
        }
    }
}