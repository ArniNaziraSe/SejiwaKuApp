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
import com.msv.sejiwaku.homepage.journey.kamupastibisa.KamuPastiBisaScreenDua
import com.msv.sejiwaku.homepage.journey.kamupastibisa.KamuPastiBisaScreenSatu
import com.msv.sejiwaku.homepage.journey.kamupastibisa.KamuPastiBisaScreenTiga
import com.msv.sejiwaku.homepage.journey.kamupastibisa.curhatpadadirisendiri.CurhatPadaDiriSendiri
import com.msv.sejiwaku.homepage.journey.kamupastibisa.curhatpadadirisendiri.musik.MusikDua
import com.msv.sejiwaku.homepage.journey.kamupastibisa.perengganganotot.PerengganganOtot
import com.msv.sejiwaku.homepage.journey.menerimadiri.MenerimaDiriScreen
import com.msv.sejiwaku.homepage.journey.menerimadiri.MenerimaDiriScreenDua
import com.msv.sejiwaku.homepage.journey.menerimadiri.MenerimaDiriScreenTiga
import com.msv.sejiwaku.homepage.journey.menerimadiri.dengarkanmusiktenang.DengarkanMusikTenang
import com.msv.sejiwaku.homepage.journey.menerimadiri.dengarkanmusiktenang.musik.MusikStatu
import com.msv.sejiwaku.homepage.journey.menerimadiri.hirupnapasperlahan.HirupNafasPerlahan
import com.msv.sejiwaku.homepage.konseling.detailscreen.DetailScreenKonseling

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
                onClik = {navController.navigate(BottonBarScreen.DetailKonseling.route)}
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
        composable(route = BottonBarScreen.DetailKonseling.route){
            DetailScreenKonseling(navController)
        }
        composable(route = BottonBarScreen.Detail.route){
            MenerimaDiriScreen(navController)
        }
        composable(route = BottonBarScreen.DetailMenerimaDiript1.route){
            MenerimaDiriScreen(navController = navController)
        }
        composable(route = BottonBarScreen.DetailHirupNapasPerlahan.route){
            HirupNafasPerlahan(navController = navController)
        }
        composable(route = BottonBarScreen.DetailMenerimaDiriScreenDua.route){
            MenerimaDiriScreenDua(navController = navController)
        }
        composable(route = BottonBarScreen.DetailMenerimaDiriScreenTiga.route){
            MenerimaDiriScreenTiga(navController = navController)
        }
        composable(route = BottonBarScreen.DetailDengarkanMusikTenang.route){
            DengarkanMusikTenang(navController = navController)
        }
        composable(route = BottonBarScreen.DetailMusikSatu.route){
            MusikStatu(navController = navController)
        }


        composable(route = BottonBarScreen.DetailKamuPastiBisaSatu.route){
            KamuPastiBisaScreenSatu(navController = navController)
        }
        composable(route = BottonBarScreen.DetailKamuPastiBisaDua.route){
            KamuPastiBisaScreenDua(navController = navController)
        }
        composable(route = BottonBarScreen.DetailKamuPastiBisaTiga.route){
            KamuPastiBisaScreenTiga(navController = navController)
        }
        composable(route = BottonBarScreen.DetailPereganganOtot.route){
            PerengganganOtot(navController = navController)
        }
        composable(route = BottonBarScreen.DetailCurhatPadaDiriSendiri.route){
            CurhatPadaDiriSendiri(navController = navController)
        }
        composable(route = BottonBarScreen.DetailMusikDua.route){
            MusikDua(navController = navController)
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
