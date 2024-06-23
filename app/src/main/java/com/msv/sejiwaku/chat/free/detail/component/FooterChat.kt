package com.msv.sejiwaku.chat.free.detail.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.msv.sejiwaku.ui.theme.Grey
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FooterChat(
    value:String,
    onValueChange:(String)->Unit,
    colortext:Color,
    conten:String,
    onClickKirim:()->Unit,
    onClickKamera:()->Unit
) {
    Column(
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.size(18.dp))
            Column(
                modifier = Modifier.width(283.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .height(40.dp)
                            .width(295.dp)
                            .background(
                                Color.White,
                                RoundedCornerShape(10.dp)
                            )
                            .border(
                                1.dp, Tosca,
                                RoundedCornerShape(10.dp)
                            )
                    ) {

                    }
                    TextField(
                        modifier = Modifier.width(240.dp),
                        value = value,
                        onValueChange = onValueChange,
                        placeholder = {
                            Text(text = conten, fontSize = 12.sp, color = colortext
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
                    Column(
                        modifier = Modifier.width(295.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Image(painter = painterResource(id = R.drawable.sendchat), contentDescription = "sendchat", modifier = Modifier
                            .size(40.dp)
                            .clickable { onClickKirim() })
                    }
                }
            }
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(painter = painterResource(id = R.drawable.camerachat), contentDescription = "camerachat", modifier = Modifier
                    .size(40.dp)
                    .clickable { onClickKamera() })
            }
        }
    }
}

@Preview
@Composable
private fun PreviewFooterChat() {
    SejiwakuTheme {
        FooterChat(
            value = "value",
            onValueChange = {  },
            colortext = Color.Red,
            conten = "conten",
            onClickKirim = {},
            onClickKamera = {}
        )
    }
}