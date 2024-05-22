package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.bottombarscreen

import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Halaman
//import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi


fun String?.shouldShowBottomBar():Boolean{
    return this in setOf(
        Halaman.Home.route,
        Halaman.Konseling.route,
        Halaman.Journal.route,
        Halaman.Journey.route
    )
}