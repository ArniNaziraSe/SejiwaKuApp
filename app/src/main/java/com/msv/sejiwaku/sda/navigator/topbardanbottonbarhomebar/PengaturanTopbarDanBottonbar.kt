package com.msv.sejiwaku.sda.navigator.topbardanbottonbarhomebar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import com.msv.sejiwaku.sda.navigator.jalanpindah.HomeNavigasi
import com.msv.sejiwaku.sda.navigator.topbardanbottonbarhomebar.visibilitytopbardanbottonbar.shouldShowBottomBar
import com.msv.sejiwaku.ui.theme.inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottonBarNavigation(navController: NavHostController = rememberNavController()) {
    val namafont = inter

    // Fungsi untuk menghilangkan topbar dan buttonbar diambil dari file Helper
    val navBackStack by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
//
//    AnimatedVisibility(
//        visible = currentRoute.shouldShowBottomBar(),
//    ) {
//
//    }


    Scaffold(
        topBar = {
            AnimatedVisibility(
                visible = currentRoute.shouldShowBottomBar(),
            ) {
                TopAppBar(
                    title = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(tint = Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f), painter = painterResource(id = R.drawable.userprofile), contentDescription = null, modifier = Modifier.size(23.dp))
                            Text(text = "Sejiwaku", fontFamily = namafont, fontSize = 21.sp, fontWeight = FontWeight.Bold, color = Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f))
                            Row {
                                Icon(tint = Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f),painter = painterResource(id = R.drawable.nontifikasi), contentDescription = null, modifier = Modifier.size(23.dp))
                                Spacer(modifier = Modifier.size(9.dp))
                                Icon(tint = Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f),painter = painterResource(id = R.drawable.perpesanan), contentDescription = null, modifier = Modifier.size(23.dp).clickable { navController.navigate(BottonBarScreen.GaleriChat.route) })
                                Spacer(modifier = Modifier.size(14.dp))
                            }
                        }
                    }
                )
            }

        },
        bottomBar = { BottomBar(navController = navController) }
    ) {contentPadding ->
        HomeNavigasi(navController = navController, modifier = Modifier.padding(contentPadding))
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screen = listOf(
        BottonBarScreen.Home,
        BottonBarScreen.Konseling,
        BottonBarScreen.Journal,
        BottonBarScreen.Journey
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDestination = screen.any { it.route == currentDestination?.route }
    if (bottomBarDestination){
        BottomNavigation(
            backgroundColor = Color.White
        ) {
            screen.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottonBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val select = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } == true
    val klik = if (select){
        Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f)
    } else{
        Color(red = 0.0f, green = 0.31f, blue = 0.357f, alpha = 1.0f)
    }
    BottomNavigationItem(
        selected = currentDestination?.hierarchy?.any {
                                                      it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
                  navController.navigate(screen.route){
                      popUpTo(navController.graph.findStartDestination().id)
                      launchSingleTop = true
                  }
        },
        icon = {
            Icon(
                painter = painterResource(id = screen.gambar), 
                contentDescription = "Iconnya",
                modifier = Modifier
                    .size(45.dp)
                    .padding(start = 10.dp, top = 5.dp),
                tint = klik
            )
        }
    )
}