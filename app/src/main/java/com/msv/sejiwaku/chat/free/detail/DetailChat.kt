package com.msv.sejiwaku.chat.free.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.chat.free.detail.component.FooterChat
import com.msv.sejiwaku.chat.free.detail.component.HeaderChat
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun DetailChat(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            topBar = {
                HeaderChat {
                    navController.navigate(BottonBarScreen.GaleriChat.route)
                }
                     },
            bottomBar = {
                FooterChat(
                    value = "",
                    onValueChange = {},
                    colortext = Color.Black,
                    conten = "",
                    onClickKirim = { /*TODO*/ }) {

                }
            }
        ) {paddingvalue->
            Column(
                modifier = Modifier.padding(paddingvalue)
            ) {

            }
        }


    }
}

@Preview
@Composable
private fun PreviewDetailChat() {
    SejiwakuTheme {
        DetailChat(navController = rememberNavController())
    }
}