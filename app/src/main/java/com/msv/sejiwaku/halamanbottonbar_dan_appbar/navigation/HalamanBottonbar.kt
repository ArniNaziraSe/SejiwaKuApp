package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example1
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example2
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example3
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example4

@Composable
fun HalamanBottonbar(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController = navController,
        route = Graph.ISI,
        startDestination = HalamanIsi.Home.route
    ) {
        composable(HalamanIsi.Home.route){
            Example1()
        }
        composable(HalamanIsi.Konseling.route){
            Example2()
        }
        composable(HalamanIsi.Journal.route){
            Example3()
        }
        composable(HalamanIsi.Journey.route){
            Example4()
        }
    }
}

sealed class HalamanIsi(val route: String) {
    data object Home : Halaman("awal")
    data object  Konseling : Halaman("konseling")
    data object  Journal : Halaman("journal")
    data object Journey : Halaman("journey")
}