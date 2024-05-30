package com.msv.sejiwaku.homepage.konseling.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun Bintang(
    rating:Double
) {
    val namafont = inter
    val ukuran = 97.dp
    val isHalfStar = (rating % 1) != 0.0
    val star = 5
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (index in 1..star){
            Icon(
                modifier = Modifier
                    .clickable { index.toDouble() }
                    .size(11.dp),
                contentDescription = null,
                tint = Color(
                    red = 1.0f,
                    green = 0.663f,
                    blue = 0.008f,
                    alpha = 1.0f
                ),
                imageVector = if (index <= rating){
                    Icons.Rounded.Star
                }else{
                    if (isHalfStar){
                        Icons.Rounded.StarHalf
                    } else {
                        Icons.Rounded.StarOutline
                    }
                }
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = rating.toString(), fontSize = 11.sp, fontFamily = inter)
    }
}