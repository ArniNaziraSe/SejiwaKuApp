package com.msv.sejiwaku.chatPremium.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.abu_abu

@Composable
fun tulisPesan(onSendMessage: (String) -> Unit) {
    var text by remember { mutableStateOf("") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp)
        ) {
            TextField(
                value = text,
                onValueChange = { text = it },
                placeholder = {
                    Text(text = "Tulis pesan ....", color = abu_abu)
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .padding(end = 56.dp) // give space for the send icon
            )
            IconButton(
                onClick = {
                    if (text.isNotEmpty()) {
                        onSendMessage(text)
                        text = ""
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 8.dp)
                    .size(24.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.send),
                    contentDescription = "kirim",
                    tint = Tosca
                )
            }
        }
        IconButton(
            onClick = { /*TODO: Add camera functionality*/ }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera",
                tint = Tosca
            )
        }
    }
}

@Preview
@Composable
private fun tulisPesanPreview() {
    SejiwakuTheme {
        tulisPesan {
            "Permisi dapatkah saya melakukan konseling online"
        }
    }
}
