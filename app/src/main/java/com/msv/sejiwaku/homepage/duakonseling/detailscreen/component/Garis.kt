package com.msv.sejiwaku.homepage.duakonseling.detailscreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.toska

@Composable
fun Garis(
    tinggi:Int,
    lebar:Int
) {
    Column(
        modifier = Modifier
            .background(toska)
            .height(tinggi.dp)
            .width(lebar.dp)
            .fillMaxWidth()
    ) {
    }
}