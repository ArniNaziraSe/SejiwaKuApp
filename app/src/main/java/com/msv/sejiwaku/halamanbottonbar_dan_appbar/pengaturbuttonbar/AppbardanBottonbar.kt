package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar

import android.annotation.SuppressLint
import android.media.Image
import android.provider.MediaStore.Images
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example1
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example2
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example3
import com.msv.sejiwaku.bagianhalamandibuttonbar.Example4
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Halaman

data class BottonBar(
    val title: String,
    val icon: Int,
    val screen: Halaman
)

@SuppressLint("SIP")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppbardanBottonbar(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
//        bagian ini gak ada appbarnya
//        buat topbar
//        topBar = {
//            TopAppBar(title = { Text(text = "oke") })
//        },
        // buat bottombar
        bottomBar = {
            // Ada diwaha fungsinya
            ButtonBarSet(navController)
        },
        // buat floating
//        floatingActionButton = {
//            FloatingActionButton(onClick = { /*TODO*/ }) {
//                Icon(imageVector = Icons.Default.Block, contentDescription = "gak ada")
//            }
//        }
        // dibawah tempat isinya
    ) {contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Halaman.Home.route,
            modifier = Modifier.padding(contentPadding)
        ) {
            composable(Halaman.Home.route) {
                Example1()
            }
            composable(Halaman.Konseling.route) {
                Example2()
            }
            composable(Halaman.Journal.route) {
                Example3()
            }
            composable(Halaman.Journey.route) {
                Example4()
            }
        }
    }
}

@Composable
fun ButtonBarSet(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val bottonbar = listOf(
            BottonBar(
                title = "Home",
                icon = R.drawable.off_eye,
                screen = Halaman.Home
            ),
            BottonBar(
                title = "Konseling",
                icon = R.drawable.off_eye,
                screen = Halaman.Konseling
            ),
            BottonBar(
                title = "Journal",
                icon = R.drawable.off_eye,
                screen = Halaman.Journal
            ),
            BottonBar(
                title = "Journey",
                icon = R.drawable.off_eye,
                screen = Halaman.Journey
            )
        )
        bottonbar.map { bottombar ->
            NavigationBarItem(
                selected = currentRoute == bottombar.screen.route,
                onClick = {
                          navController.navigate(bottombar.screen.route){
                              popUpTo(navController.graph.findStartDestination().id){
                                  saveState = true
                              }
                              restoreState = true
                              launchSingleTop = true
                          }
                          },
                icon = {
                    Column {

                    }
                    Icon(
                        painter = painterResource(id = bottombar.icon),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                        )
                    Text(text = bottombar.title)
                })
        }
    }
}

@Preview
@Composable
private fun PreviewAppbar() {
    AppbardanBottonbar()
}