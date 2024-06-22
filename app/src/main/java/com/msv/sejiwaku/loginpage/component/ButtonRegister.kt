package com.msv.sejiwaku.loginpage.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun ButtonRegister(
    onClick:()->Unit
) {
    Column(
        modifier = Modifier
            .padding(top = 44.dp,)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.size(height = 54.dp, width = 295.dp),
            onClick = onClick,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                ),
            )
        ) {
            Text(text = "Register", fontFamily = inter)
        }
    }
}