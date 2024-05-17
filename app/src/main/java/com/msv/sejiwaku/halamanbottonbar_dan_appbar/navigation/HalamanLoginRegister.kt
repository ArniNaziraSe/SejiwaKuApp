package com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navigation
import com.msv.sejiwaku.loginpage.LoginPage
import com.msv.sejiwaku.loginpage.LupaPassword
import com.msv.sejiwaku.loginpage.RegisterPage


fun NavGraphBuilder.halamannavigation(navController: NavHostController) {
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
    }
}

sealed class LoginScreen(val route:String){
    object Login : LoginScreen(route = "LOGIN")
    object Register : LoginScreen(route = "REGISTER")
    object LupaPassword : LoginScreen(route = "LUPAPASSWORD")
}