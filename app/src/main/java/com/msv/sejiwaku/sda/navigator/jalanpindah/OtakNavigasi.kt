package com.msv.sejiwaku.sda.navigator.jalanpindah

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.msv.sejiwaku.sda.navigator.topbardanbottonbarhomebar.BottonBarNavigation

@Composable
fun OtakNavigasi(navController: NavController){
    NavHost(
        navController = navController as NavHostController,
        route = Urutan.OTAK,
        startDestination = Urutan.BAGIANLOGINDANTEMANNYA
    ) {
        bagianlogindantemannya(navController = navController)
        composable(route = Urutan.HOMEBAR){
            BottonBarNavigation()
        }
    }
}

object Urutan{
    const val OTAK = "otaknya"
    const val BAGIANLOGINDANTEMANNYA = "bagian_login_dan_temannya"
    const val HOMEBAR = "homebar"
    const val DETAILHOMESATU = "detail_home_satu"
}