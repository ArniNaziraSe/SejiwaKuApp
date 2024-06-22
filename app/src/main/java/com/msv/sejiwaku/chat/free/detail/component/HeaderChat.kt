package com.msv.sejiwaku.chat.free.detail.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun HeaderChat(
    onClick:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .background(Tosca)
    ) {
        Column(
            modifier = Modifier.width(60.dp).fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.backchat), contentDescription = "iconkembail", modifier = Modifier.size(20.dp).clickable { onClick() })
        }
    }
}

@Preview
@Composable
private fun PreviewHeaderChat() {
    SejiwakuTheme {
        HeaderChat(
            onClick = {}
        )
    }
}