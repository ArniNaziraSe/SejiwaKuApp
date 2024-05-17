package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.AppbardanBottonbar

@Composable
fun HalamanNavigasiAwal(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.AWAL,
        startDestination = Graph.LOGINREGISTER
    ) {
        halamannavigation(navController = navController)
        composable(route = Graph.ISI){
            AppbardanBottonbar()
        }
    }
}

object Graph{
    const val AWAL = "awal_graph"
    const val LOGINREGISTER = "loginregister"
    const val ISI = "isi_graph"
}