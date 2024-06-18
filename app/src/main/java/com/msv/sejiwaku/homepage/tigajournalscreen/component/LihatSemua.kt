package com.msv.sejiwaku.homepage.tigajournalscreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun LihatSemua(
    onClick: () -> Unit
) {
    Column(
        modifier= Modifier
            .fillMaxWidth()
            .padding(top = 110.dp, end = 20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Surface(
            onClick = onClick
        ) {
            Row {
                Text(text = "Lihat Semua Disini", color = Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                ), fontSize = 9.sp)
                Spacer(modifier = Modifier.size(3.dp))
                Image(painter = painterResource(id = R.drawable.journallanjutdua), contentDescription = null, modifier = Modifier.size(18.dp))
            }
        }
    }


}