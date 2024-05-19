package com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar

import android.annotation.SuppressLint
import android.media.Image
import android.provider.MediaStore.Images
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Graph
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Halaman
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.HalamanBottonbar
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.bottombarscreen.shouldShowBottomBar
import com.msv.sejiwaku.ui.theme.inter

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
    val namafont = inter
    val navBackStack by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStack?.destination?.route
    Scaffold(
//        bagian ini gak ada appbarnya
//        buat topbar
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
                                Icon(tint = Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f),painter = painterResource(id = R.drawable.perpesanan), contentDescription = null, modifier = Modifier.size(23.dp))
                                Spacer(modifier = Modifier.size(14.dp))
                            }
                        }
                    }
                )
            }
        },
        // buat bottombar
        bottomBar = {
            // Ada diwaha fungsinya
            AnimatedVisibility(
                visible = currentRoute.shouldShowBottomBar()
            ) {
                ButtonBarSet(navController)
            }
        },
        // buat floating
//        floatingActionButton = {
//            FloatingActionButton(onClick = { /*TODO*/ }) {
//                Icon(imageVector = Icons.Default.Block, contentDescription = "gak ada")
//            }
//        }
        // dibawah tempat isinya
    ) {contentPadding ->
        HalamanBottonbar(
            navController = navController,
            modifier = modifier.padding(contentPadding)
        )
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
                icon = R.drawable.bottonbarhome,
                screen = Halaman.Home
            ),
            BottonBar(
                title = "Konseling",
                icon = R.drawable.bottonbarkonseling,
                screen = Halaman.Konseling
            ),
            BottonBar(
                title = "Journal",
                icon = R.drawable.bottonbarjurnal,
                screen = Halaman.Journal
            ),
            BottonBar(
                title = "Journey",
                icon = R.drawable.bottonbarjourney,
                screen = Halaman.Journey
            )
        )

        bottonbar.map { bottombar ->
            val select = currentRoute == bottombar.screen.route
            val klik = if (select){
                Color(red = 0.2f, green = 0.725f, blue = 0.675f, alpha = 1.0f)
            } else{
                Color(red = 0.0f, green = 0.31f, blue = 0.357f, alpha = 1.0f)
            }
//            Spacer(modifier = Modifier.size(1.dp))
            Column(

            ) {

            }
            Surface(
                onClick = {
                    navController.navigate(bottombar.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true

                    }
                },
                modifier = Modifier

                    .height(60.dp)
                    .width(70.dp)
                    .padding(start = 20.dp, top = 10.dp)
//                    .clickable {
//
//                    }
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ){

                    Image(
                        painter = painterResource(id = bottombar.icon),
                        contentDescription = "",
                        modifier = Modifier
                            .size(45.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        colorFilter = ColorFilter.tint(klik)
                    )
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