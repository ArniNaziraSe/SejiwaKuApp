package com.msv.sejiwaku.sda.navigator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.msv.sejiwaku.homepage.satuhomescreen.HomeScreen
import com.msv.sejiwaku.homepage.tigajournalscreen.JournalScreen
import com.msv.sejiwaku.homepage.empatjourney.JourneyScreen
import com.msv.sejiwaku.homepage.duakonseling.KonselingScreen
import com.msv.sejiwaku.homepage.detailyangbelumjadi.Pt1tes
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.KamuPastiBisaScreenDua
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.KamuPastiBisaScreenSatu
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.KamuPastiBisaScreenTiga
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.curhatpadadirisendiri.CurhatPadaDiriSendiri
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.curhatpadadirisendiri.musik.MusikDua
import com.msv.sejiwaku.homepage.empatjourney.kamupastibisa.perengganganotot.PerengganganOtot
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.MenerimaDiriScreen
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.MenerimaDiriScreenDua
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.MenerimaDiriScreenTiga
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.dengarkanmusiktenang.DengarkanMusikTenang
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.dengarkanmusiktenang.musik.MusikStatu
import com.msv.sejiwaku.homepage.empatjourney.menerimadiri.hirupnapasperlahan.HirupNafasPerlahan
import com.msv.sejiwaku.homepage.duakonseling.detailscreen.DetailScreenKonseling
import com.msv.sejiwaku.inJurnal.screen.Screen4
import com.msv.sejiwaku.inJurnal.screen.Screen5
import com.msv.sejiwaku.inJurnal.screen.Screen6
import com.msv.sejiwaku.inJurnal.screen.journalScreen1
import com.msv.sejiwaku.inJurnal.screen.journalScreen2
import com.msv.sejiwaku.inJurnal.screen.journalScreen3

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
        composable(route = BottonBarScreen.JournalScreen1.route){
            journalScreen1()
        }
        composable(route = BottonBarScreen.JournalScreen2.route){
            journalScreen2()
        }
        composable(route = BottonBarScreen.JournalScreen3.route){
            journalScreen3()
        }
        composable(route = BottonBarScreen.Screen4.route){
            Screen4()
        }
        composable(route = BottonBarScreen.Screen5.route){
            Screen5()
        }
        composable(route = BottonBarScreen.Screen6.route){
            Screen6()
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
