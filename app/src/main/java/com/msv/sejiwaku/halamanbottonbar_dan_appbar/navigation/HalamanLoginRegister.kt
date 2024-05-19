package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navigation
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding1
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding2
import com.msv.sejiwaku.bagianonboardingnya.HalamanOnboarding3
import com.msv.sejiwaku.bagianonboardingnya.OnboardingHasil
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.AppbardanBottonbar
import com.msv.sejiwaku.loginpage.LoginPage
import com.msv.sejiwaku.loginpage.LupaPassword
import com.msv.sejiwaku.loginpage.RegisterPage


fun NavGraphBuilder.halamanlogin(navController: NavHostController) {
    navigation(
        startDestination = LoginScreen.Login.route,
        route = Graph.LOGINREGISTER
    ){
        composable(route = LoginScreen.Login.route){
            LoginPage(navController)
        }
        composable(route = LoginScreen.Register.route){
            RegisterPage(navController)
        }
        composable(route = LoginScreen.LupaPassword.route){
            LupaPassword(navController)
        }
        composable(route = LoginScreen.Onbording1.route){
            HalamanOnboarding1(navController)
        }
        composable(route = LoginScreen.Onbording2.route){
            HalamanOnboarding2(navController)
        }
        composable(route = LoginScreen.Onbording3.route){
            HalamanOnboarding3(navController)
        }
        composable(route = LoginScreen.HasilOnboarding.route){
            OnboardingHasil(navController)
        }
    }
}
sealed class LoginScreen(val route:String){
    object Login : LoginScreen(route = "LOGIN")
    object Register : LoginScreen(route = "REGISTER")
    object LupaPassword : LoginScreen(route = "LUPAPASSWORD")
    object Onbording1 : LoginScreen(route = "ONBORDING1")
    object Onbording2 : LoginScreen(route = "ONBORDING2")
    object Onbording3 : LoginScreen(route = "ONBORDING3")
    object HasilOnboarding : LoginScreen(route = "HASILONBOARDING")
}
