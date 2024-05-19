package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.msv.sejiwaku.R
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Halaman

//sealed class BottomBarScreen(
//    val title : String,
//    val icon: Int,
//    val screen: Halaman,
//    val route: String
//) {
//    object Home : BottomBarScreen(
//        title = "Home",
//        icon = R.drawable.bottonbarhome,
//        screen = Halaman.Home,
//        route = "home"
//    )
//    object Konseling : BottomBarScreen(
//        title = "Konseling",
//        icon = R.drawable.bottonbarkonseling,
//        screen = Halaman.Konseling,
//        route = "konseling"
//
//    )
//    object Journal : BottomBarScreen(
//        title = "Journal",
//        icon = R.drawable.bottonbarjurnal,
//        screen = Halaman.Journal,
//        route = "journal"
//    )
//    object Journey : BottomBarScreen(
//        title = "Journey",
//        icon = R.drawable.bottonbarjourney,
//        screen = Halaman.Journey,
//        route = "journey"
//    )
//    object Lanjut : BottomBarScreen(
//        title = "Journey",
//        icon = R.drawable.bottonbarjourney,
//        screen = Halaman.Lanjut,
//        route = "journey"
//    )
//}

//@Composable
//fun TEsms() {
//    BottonBar(
//        title = "Home",
//        icon = R.drawable.bottonbarhome,
//        screen = Halaman.Home
//    ),
//    BottonBar(
//        title = "Konseling",
//        icon = R.drawable.bottonbarkonseling,
//        screen = Halaman.Konseling
//    ),
//    BottonBar(
//        title = "Journal",
//        icon = R.drawable.bottonbarjurnal,
//        screen = Halaman.Journal
//    ),
//    BottonBar(
//        title = "Journey",
//        icon = R.drawable.bottonbarjourney,
//        screen = Halaman.Journey
//    )
//}