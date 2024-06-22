package com.msv.sejiwaku.loginpage.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun TeksInputPasswordLogin(
    judul:String,
    value:String,
    onValueChange:(String) -> Unit
) {
    var passwordVisibilitylogin by remember {
        mutableStateOf(false)
    }
    var icon = if(passwordVisibilitylogin)
        painterResource(id = R.drawable.on_eye)
    else
        painterResource(id = R.drawable.off_eye)
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.width(295.dp),
            label = {
                Text(text = judul, fontFamily = inter, fontWeight = FontWeight.Bold)
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibilitylogin = !passwordVisibilitylogin
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Logo mata on",
                        Modifier.size(30.dp)
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if(passwordVisibilitylogin) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }
}