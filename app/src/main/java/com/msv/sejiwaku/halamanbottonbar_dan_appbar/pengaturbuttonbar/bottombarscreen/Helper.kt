package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.bottombarscreen

import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanIsi


fun String?.shouldShowBottomBar():Boolean{
    return this in setOf(
        HalamanIsi.Home.route,
        HalamanIsi.Konseling.route,
        HalamanIsi.Journal.route,
        HalamanIsi.Journey.route
    )
}