package com.msv.sejiwaku.homepage.journalscreen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopikDariSejiwaku(
    text1:String,
    text2:String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                onClick = onClick,
                modifier = Modifier
                    .height(58.dp)
                    .width(337.dp),
                border = BorderStroke(1.5.dp, Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                )
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 17.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = text1/*"Kenali Dirimu Dengan Baik"*/, fontSize = 9.sp, style = TextStyle(letterSpacing = 0.1.sp))
                        Text(text = text2/*"Curahkan segala perasaan yang ada dalam dirimu"*/, fontSize = 7.sp, letterSpacing = 0.1.sp)
                    }
                }
            }
        }
    }
}