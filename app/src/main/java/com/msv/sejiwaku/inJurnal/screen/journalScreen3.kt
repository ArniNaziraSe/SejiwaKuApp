package com.msv.sejiwaku.inJurnal.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun journalScreen3() {
    Scaffold(
        topBar = {},
        content = {paddingValues ->
            JournalContent3(modifier = Modifier.padding(paddingValues),navController = rememberNavController())
        }
    )
}

@Composable
fun JournalContent3(modifier: Modifier = Modifier,navController: NavController) {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Apa yang kamu ketahui tentang dirimu sendiri?",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            LinedTextArea3(
                textState = textState,
                onTextChanged = { textState = it }
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Finish", fontWeight = FontWeight.Medium, color = Color(0xFF33B9AC),modifier = Modifier.padding(top = 12.dp))
            IconButton(onClick = { navController.navigate(BottonBarScreen.Screen4.route) }) {
                Icon(imageVector = Icons.Default.ArrowForwardIos, contentDescription = "finish")
            }
        }
    }
}

@Composable
fun LinedTextArea3(textState: TextFieldValue, onTextChanged: (TextFieldValue) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .border(1.dp, Color(0xFF33B9AC), shape = RoundedCornerShape(10.dp))
    ) {
        val lines = 15 // Number of lines
        Column {
            repeat(lines) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .border(0.5.dp, Color(0xFF33B9AC), RoundedCornerShape(10.dp))
                )
            }
        }
        BasicTextField(
            value = textState,
            onValueChange = onTextChanged,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 4.dp)
                .background(Color.Transparent)
        )
    }
}

@Preview
@Composable
private fun Screen3() {
    SejiwakuTheme {
        journalScreen3()
    }
}