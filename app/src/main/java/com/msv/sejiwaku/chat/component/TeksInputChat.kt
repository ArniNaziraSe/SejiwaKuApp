package com.msv.sejiwaku.chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.Biru
import com.msv.sejiwaku.ui.theme.Grey
import com.msv.sejiwaku.ui.theme.Putih

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeksInputChat(
    conten:String,
    colortext:Color,
    value:String,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Column(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            Putih, RoundedCornerShape(12.dp)
                        )
                        .padding(start = 10.dp, top = 7.dp, end = 10.dp)
                        .height(26.dp)
                        .width(270.dp)
                ) {

                }
            }
            TextField(
                value = value,
                onValueChange = onValueChange,
                placeholder = {
                    Text(text = conten, fontSize = 12.sp, color = colortext
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.pencarian),
                        contentDescription = "logo pencarian",
                        modifier = Modifier.size(15.dp),
                        colorFilter = ColorFilter.tint(Grey)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color.Black,
                    focusedTextColor = Color.Black,
                    focusedTrailingIconColor = Color.Red,
                    unfocusedTrailingIconColor = Color.Red,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    containerColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
private fun PreviewTextFieldHome() {
//    var pencarian by remember {
//        mutableStateOf("")
//    }
    TeksInputChat(
        conten = "pencarian",
        value = "Cari..",
        onValueChange = {},
        colortext = Biru
    )
}