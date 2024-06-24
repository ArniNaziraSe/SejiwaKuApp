package com.msv.sejiwaku.homepage.satuhomescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.homepage.satuhomescreen.component.aktivitasHomeItem
import com.msv.sejiwaku.homepage.satuhomescreen.component.emojiHomeItem
import com.msv.sejiwaku.homepage.satuhomescreen.component.journeyHomeItem
import com.msv.sejiwaku.homepage.satuhomescreen.component.journeys
import com.msv.sejiwaku.homepage.satuhomescreen.component.profilHomeItem
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.size(40.dp))
            profilHomeItem(
                name = "Farras",
                status = "Apa kabarmu hari ini?",
                onClick = {
                    navController.navigate(BottonBarScreen.Profil.route)
                }
            )
            Divider(
                color = Color(0xFF33B9AC),
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                thickness = 1.dp
            )
            emojiHomeItem()
            Divider(
                color = Color(0xFF33B9AC),
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
                thickness = 1.dp
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn {
                item {
                    SectionTitle(title = "Aktivitas Terakhirmu")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow {
                item {
                    aktivitasHomeItem(title = "Lanjutkan Journey", description = "Meditasi 5:00", icon = Icons.Default.ArrowForwardIos)
                    Spacer(modifier = Modifier.width(8.dp))
                    aktivitasHomeItem(title = "Lanjutkan Journal", description = "Hidup itu mudah", icon = Icons.Default.ArrowForwardIos)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                item {
                    SectionTitle(title = "New Journey")
                }
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(2)
            ) {
                items(journeys) { journey ->
                    journeyHomeItem(journey)
                }
            }
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 8.dp)
    )
}

@Preview
@Composable
private fun homepreview() {
    SejiwakuTheme {
        HomeScreen(navController = rememberNavController())
    }
}