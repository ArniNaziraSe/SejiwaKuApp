package com.msv.sejiwaku.profile.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.Hitam
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu
import com.msv.sejiwaku.ui.theme.black
import com.msv.sejiwaku.ui.theme.inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeksInputVisibility(
    judul:String,
    value:String,
    variableinput:String,
    onvaluechange:(String)-> Unit
) {
    var passwordVisibilitylogin by remember {
        mutableStateOf(false)
    }
    var icon = if(passwordVisibilitylogin)
        painterResource(id = R.drawable.on_eye_profile)
    else
        painterResource(id = R.drawable.off_eye_profile)
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = judul, color = abu_abu, modifier = Modifier.padding(start = 25.dp), fontSize = 12.sp, fontFamily = inter)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 9.dp)
            ) {
                TextField(
                    modifier = Modifier.width(330.dp),
                    value = variableinput,
                    onValueChange = onvaluechange,
                    placeholder = { Text(text = value, color = Color.Black, fontSize = 12.sp, fontFamily = inter)},
                    maxLines = 1,
                    singleLine = true,
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color.Black,
                        focusedTextColor = Color.Black,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent
                    ),
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
            Column(
                modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Divider(color = Hitam, thickness = 1.dp, modifier = Modifier.size(height = 2.dp, width = 307.dp))
            }
        }
    }
}

@Preview
@Composable
private fun PreviewTextInputVisibility() {
    SejiwakuTheme {
        var nama by remember {
            mutableStateOf("")
        }
        val namanya = "Tesss"
        TeksInputVisibility(
            judul = "Namaaa",
            value = namanya,
            variableinput = nama,
            onvaluechange = {nama = it}
        )
    }
}