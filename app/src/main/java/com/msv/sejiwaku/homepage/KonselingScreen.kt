package com.msv.sejiwaku.homepage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KonselingScreen() {
    Scaffold(
        topBar = {

        },
        bottomBar = {
            BottomAppBar {
                Column {
                    Icon(imageVector = Icons.Default.Image, contentDescription = null)
                }
            }
        }
    ) {contentPadding ->
        Column(
            modifier = Modifier.padding(contentPadding)
        ) {

        }
    }
    Column {
        Column {

        }
    }
}