package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

sealed class Halaman(val route: String) {
    data object Home : Halaman("awal")
    data object  Konseling : Halaman("konseling")
    data object  Journal : Halaman("journal")
    data object Journey : Halaman("journey")
}