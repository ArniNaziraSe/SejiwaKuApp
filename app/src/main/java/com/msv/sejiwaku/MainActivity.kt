package com.msv.sejiwaku

import LinkLazyRow
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.homepage.journey.JourneyScreen
import com.msv.sejiwaku.homepage.journey.menerimadiri.hirupnapasperlahan.HirupNafasPerlahan
import com.msv.sejiwaku.homepage.journey.menerimadiri.MenerimaDiriScreen
import com.msv.sejiwaku.homepage.konseling.detailscreen.DetailScreenKonseling
import com.msv.sejiwaku.inJurnal.screen.journalScreen1
import com.msv.sejiwaku.inJurnal.screen.journalScreen2
import com.msv.sejiwaku.inJurnal.screen.journalScreen3
import com.msv.sejiwaku.navigator.OtakNavigasi
import com.msv.sejiwaku.ui.theme.SejiwakuTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Sejiwaku)
        setContent {
            SejiwakuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //HalamanNavigasiAwal(navController = rememberNavController())
                    //AppbardanBottonbar()
                    //LoginPage(navController = rememberNavController())
                    //BottonBarNavigation()
                    OtakNavigasi(navController = rememberNavController())
                    //JournalScreen(navController = rememberNavController())
                    //JourneyScreen(navController = rememberNavController()){}
                    //DetailScreenKonseling(navController = rememberNavController())
                    //LinkLazyRow(urls = sampleUrls)
                    //MenerimaDiriScreen()
                    //HirupNafasPerlahan()
                    journalScreen1()
                    journalScreen2()
                    journalScreen3()
                }
            }
        }
    }
}


