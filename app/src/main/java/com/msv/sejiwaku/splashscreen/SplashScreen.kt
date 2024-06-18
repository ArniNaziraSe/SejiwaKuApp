package com.msv.sejiwaku.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.msv.sejiwaku.sda.navigator.BagianLoginDanTemannya
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.msv.sejiwaku.R
import com.msv.sejiwaku.sda.logindata.DataStoreLogin
import com.msv.sejiwaku.sda.navigator.BottonBarScreen
import com.msv.sejiwaku.sda.navigator.Urutan

@Composable
fun SplashScreen(
    navController: NavController
) {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val dataStoreUI = DataStoreLogin(context)
    val statusUiKey = dataStoreUI.getStatusUiLogin.collectAsState(initial = false)
    LaunchedEffect(Unit) {
        coroutineScope.launch {
            delay(2000L)
            if (statusUiKey.value){
                navController.navigate(Urutan.HOMEBAR){
                    popUpTo(BagianLoginDanTemannya.SplashScreen.route){
                        inclusive = true
                    }
                }
            } else {
                navController.navigate(BagianLoginDanTemannya.Login.route){
                    popUpTo(BagianLoginDanTemannya.SplashScreen.route){
                        inclusive = true
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.logo_dan_nama2), contentDescription = "logo dan naam")
    }
}