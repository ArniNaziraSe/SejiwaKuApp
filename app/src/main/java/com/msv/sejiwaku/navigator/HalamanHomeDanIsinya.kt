package com.msv.sejiwaku.navigator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.msv.sejiwaku.homepage.homescreen.HomeScreen
import com.msv.sejiwaku.homepage.journalscreen.JournalScreen
import com.msv.sejiwaku.homepage.journey.JourneyScreen
import com.msv.sejiwaku.homepage.konseling.KonselingScreen
import com.msv.sejiwaku.homepage.detailyangbelumjadi.Pt1tes

@Composable
fun HomeNavigasi(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController = navController,
        route = Urutan.HOMEBAR,
        startDestination = BottonBarScreen.Home.route
    ) {
        composable(route = BottonBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottonBarScreen.Konseling.route){
            KonselingScreen(
                navController = navController,
                onClik = {navController.navigate(Urutan.DETAILHOMESATU)}
            )
        }
        composable(route = BottonBarScreen.Journal.route){
            JournalScreen(navController)
        }
        composable(route = BottonBarScreen.Journey.route){
            JourneyScreen(
                navController = navController,
                onClick = {navController.navigate(Urutan.DETAILHOMESATU)}
            )
        }
        composable(route = BottonBarScreen.Detail.route){
            //Tes1()
        }
        detailpertama(navController = navController)
    }
}

fun NavGraphBuilder.detailpertama(navController: NavHostController){
    navigation(
        route = Urutan.DETAILHOMESATU,
        startDestination = DetailScreenPertama.DetailPertama.route
    ){
        composable(route = DetailScreenPertama.DetailPertama.route){
            Pt1tes()
        }
    }
}

sealed class DetailScreenPertama(val route:String){
    object DetailPertama : DetailScreenPertama(route = "DETAILPERTAMA")
}