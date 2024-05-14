package com.msv.sejiwaku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.pengaturbuttonbar.AppbardanBottonbar
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
                    AppbardanBottonbar()
                }
            }
        }
    }
}


