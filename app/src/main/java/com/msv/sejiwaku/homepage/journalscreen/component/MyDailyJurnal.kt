package com.msv.sejiwaku.homepage.journalscreen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun MyDailyJurnal() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .height(108.dp)
                    .width(339.dp),
                border = BorderStroke(3.dp, Color(
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
                            .padding(start = 17.dp, bottom = 13.dp),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(text = "My Daily Jurnal", fontSize = 12.sp)
                    }
                    Spacer(modifier = Modifier.size(57.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 17.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.journalgambar),
                            contentDescription = null,
                            modifier = Modifier.size(122.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewDaily() {
    MyDailyJurnal()
}