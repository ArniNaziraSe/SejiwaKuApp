package com.msv.sejiwaku.chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun BottonKembaliCircular(
    onClick:()->Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(start = 15.dp, top = 10.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.konselingdetailtombolback), contentDescription = "kembali", modifier = Modifier.size(25.dp).clickable { onClick() })
    }
}

@Preview
@Composable
private fun PreviewBottonKembaliCircular() {
    SejiwakuTheme {
        BottonKembaliCircular(
            onClick = {}
        )
    }
}