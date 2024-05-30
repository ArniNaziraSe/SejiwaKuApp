package com.msv.sejiwaku.homepage.homescreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun emojiHomeItem(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        listOf(
            "Sangat Buruk" to R.drawable.on1,
            "Buruk" to R.drawable.on2,
            "Netral" to R.drawable.on3,
            "Baik" to R.drawable.on4,
            "Sangat Baik" to R.drawable.on5
        ).forEach { (label, icon) ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.clickable {  }
            ) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = label,
                    modifier = Modifier.size(28.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = label,
                    fontSize = 8.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(30.dp)
                )
            }
        }
    }
}