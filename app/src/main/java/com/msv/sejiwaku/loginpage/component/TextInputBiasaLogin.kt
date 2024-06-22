package com.msv.sejiwaku.loginpage.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun TeksInputBiasaLogin(
    judul:String,
    placeholder:String,
    value:String,
    onValueChange:(String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(text = judul,fontFamily = inter, fontWeight = FontWeight.Bold) },
            //maxLines = 2
            singleLine = true,
            modifier = Modifier.width(295.dp),
            placeholder = {
                Text(text = placeholder,fontFamily = inter,)
            },
        )
    }
}