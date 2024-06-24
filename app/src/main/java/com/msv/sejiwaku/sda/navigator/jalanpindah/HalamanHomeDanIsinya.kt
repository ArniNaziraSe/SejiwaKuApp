package com.msv.sejiwaku.sda.navigator.jalanpindah

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.msv.sejiwaku.akun.AkunPremium
import com.msv.sejiwaku.akun.Akunfree
import com.msv.sejiwaku.chat.free.GaleriChat
import com.msv.sejiwaku.chat.free.detail.DetailChat
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
import com.msv.sejiwaku.inJurnal.screen.journalMenggambar
import com.msv.sejiwaku.inJurnal.screen.journalMenulis
import com.msv.sejiwaku.inJurnal.screen.journalScreen1
import com.msv.sejiwaku.inJurnal.screen.journalScreen2
import com.msv.sejiwaku.inJurnal.screen.journalScreen3
import com.msv.sejiwaku.notifications.notifikasi
import com.msv.sejiwaku.payment.Payment
import com.msv.sejiwaku.pembayaranpremium.detailpembayaran.DetailPembayaran
import com.msv.sejiwaku.pembayaranpremium.free.FreePembayaran
import com.msv.sejiwaku.pembayaranpremium.premium.PremiumPembayaran
import com.msv.sejiwaku.profile.preview.EditProfile
import com.msv.sejiwaku.profile.preview.Profile
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
import com.msv.sejiwaku.sda.logindata.DataStoreJourneySatu

@Composable
fun HomeNavigasi(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController = navController,
        route = Urutan.HOMEBAR,
        startDestination = BottonBarScreen.Home.route
    ) {
        composable(route = BottonBarScreen.Home.route){
            HomeScreen(navController)
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
            val context = LocalContext.current
            val dataStore = DataStoreJourneyDua(context)
            val dataStoreDua = DataStoreJourneySatu(context)
            val statusUiKey = dataStore.getStatusUi.collectAsState(initial = false)
            val statusUiKeydua = dataStoreDua.getStatusUijourneysatu.collectAsState(initial = false)
            JourneyScreen(
                navController = navController,
                onClick = {navController.navigate(Urutan.DETAILHOMESATU)},
                onClickJourneySatu = {
                    if (statusUiKeydua.value){
                        navController.navigate(BottonBarScreen.DetailMenerimaDiriScreenTiga.route){
                            popUpTo(BottonBarScreen.Journey.route){
                                inclusive = true
                            }
                        }
                    } else {
                        navController.navigate(BottonBarScreen.DetailMenerimaDiript1.route){
                            popUpTo(BottonBarScreen.Journey.route){
                                inclusive = true
                            }
                        }
                    }
                },
                onClickJourneyDua = {
                    if (statusUiKey.value){
                        navController.navigate(BottonBarScreen.DetailKamuPastiBisaTiga.route){
                            popUpTo(BottonBarScreen.Journey.route){
                                inclusive = true
                            }
                        }
                    } else {
                        navController.navigate(BottonBarScreen.DetailKamuPastiBisaSatu.route){
                            popUpTo(BottonBarScreen.Journey.route){
                                inclusive = true
                            }
                        }
                    }
                }
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

        // bagian profil
        composable(route = BottonBarScreen.Profil.route){
            Profile(navController)
        }
        composable(route = BottonBarScreen.ProfilEdit.route){
            EditProfile(navController)
        }
        
        // bagian chat
        composable(route = BottonBarScreen.GaleriChat.route){
            GaleriChat(navController)
        }
        composable(route = BottonBarScreen.DetailChat.route){
            DetailChat(navController)
        }
        
        // bagian akun
        composable(route = BottonBarScreen.AkunFree.route){
            Akunfree(navController = navController)
        }
        composable(route = BottonBarScreen.AkunPremium.route){
            AkunPremium(navController = navController)
        }

        // bagian pembayaran
        composable(route = BottonBarScreen.PembayaranFree.route){
            FreePembayaran(navController)
        }
        composable(route = BottonBarScreen.PembayaranPremium.route){
            PremiumPembayaran(navController)
        }
        composable(route = BottonBarScreen.DetailPembayaranPremium.route){
            DetailPembayaran(navController)
        }
        composable(route = BottonBarScreen.Payment.route){
            Payment(navController)
        }


        // bagian journey
        composable(route = BottonBarScreen.JournalScreen1.route){
            journalScreen1(navController)
        }
        composable(route = BottonBarScreen.JournalScreen2.route){
            journalScreen2(navController)
        }
        composable(route = BottonBarScreen.JournalScreen3.route){
            journalScreen3(navController)
        }
        composable(route = BottonBarScreen.Screen4.route){
            Screen4(navController)
        }
        composable(route = BottonBarScreen.Screen5.route){
            Screen5()
        }
        composable(route = BottonBarScreen.Screen6.route){
            Screen6(navController)
        }
        composable(route = BottonBarScreen.JournalMenulis.route){
            journalMenulis(navController)
        }
        composable(route = BottonBarScreen.JournalMenggambar.route){
            journalMenggambar(navController)
        }

        // appbar
        composable(route = BottonBarScreen.Nontifikasi.route){
            notifikasi()
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
