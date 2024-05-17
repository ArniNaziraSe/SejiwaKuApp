package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar

import android.annotation.SuppressLint
import android.media.Image
import android.provider.MediaStore.Images
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

/*NavHost(
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
}*/

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
        modifier = modifier.background(Color.White)
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
            val select = currentRoute == bottombar.screen.route
            val klik = if (select){
                Color.Red
            } else{
                Color.White
            }
            Spacer(modifier = Modifier.size(7.dp))
            Surface(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier

                    .height(60.dp)
                    .width(70.dp)
                    .padding(start = 20.dp, top = 10.dp)
                    .clickable {
                        navController.navigate(bottombar.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true

                        }
                    }
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(3.dp)
                    ) {
                        Spacer(modifier = Modifier.size(10.dp))
                        Image(
                            painter = painterResource(id = bottombar.icon),
                            contentDescription = "",
                            modifier = Modifier
                                .size(25.dp),
                            colorFilter = ColorFilter.tint(klik)
                        )
                    }
                    
                    Text(text = bottombar.title, fontSize = 10.sp, modifier = Modifier.padding(top = 4.dp, start = 10.dp))

                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewAppbar() {
    AppbardanBottonbar()
}