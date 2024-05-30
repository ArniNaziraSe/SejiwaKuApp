package com.msv.sejiwaku.navigator

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.msv.sejiwaku.R

sealed class BottonBarScreen(
    val route:String,
    val gambar:Int
) {
    object Home :BottonBarScreen(
        route ="HOME",
        gambar = R.drawable.bottonbarhome
    )
    object Konseling :BottonBarScreen(
        route = "KONSELING",
        gambar = R.drawable.bottonbarkonseling
    )
    object Journal : BottonBarScreen(
        route = "JOURNAL",
        gambar = R.drawable.bottonbarjurnal
    )
    object Journey :BottonBarScreen(
        route = "JOURNEY",
        gambar = R.drawable.bottonbarjourney
    )
    object Detail :BottonBarScreen(
        route = "DETAIL",
        gambar = 1
    )

}

