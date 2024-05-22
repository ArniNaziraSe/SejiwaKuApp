package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.msv.sejiwaku.homepage.HomeScreen
import com.msv.sejiwaku.homepage.JournalScreen
import com.msv.sejiwaku.homepage.JourneyScreen
import com.msv.sejiwaku.homepage.KonselingScreen
import com.msv.sejiwaku.homepage.detailyangbelumjadi.Pt1tes

@Composable
fun HalamanBottonbar(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController = navController,
        route = Graph.ISI,
        startDestination = Halaman.Home.route
    ) {
        composable(Halaman.Home.route){
            HomeScreen()
            //JourneyScreen(navController)
            //KonselingScreen(navController)
            //JournalScreen()
        }
        composable(Halaman.Konseling.route){
            KonselingScreen(navController)
        }
        composable(Halaman.Journal.route){
            JournalScreen()
        }
        composable(Halaman.Journey.route){
            JourneyScreen(navController)
        }
        composable(Halaman.Ptsatu.route){
            Pt1tes()
        }
    }
}

sealed class Halaman(val route: String) {
    data object Home : Halaman("awal")
    data object  Konseling : Halaman("konseling")
    data object  Journal : Halaman("journal")
    data object Journey : Halaman("journey")
    data object Ptsatu : Halaman("Ptsatu")
}
