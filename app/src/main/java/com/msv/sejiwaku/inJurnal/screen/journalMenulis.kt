package com.msv.sejiwaku.inJurnal.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.inJurnal.screen.component.topbarJournal
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun journalMenulis(navController: NavController) {
    var currentColor by remember { mutableStateOf(Color.Black) }
    var isPenVisible by remember { mutableStateOf(false) }
    var titleText by remember { mutableStateOf("") }
    var bodyText by remember { mutableStateOf("") }

    Column {
        topbarJournal(navController = navController, title = "Menulis")
        Divider(
            modifier = Modifier
                .fillMaxWidth(),
            color = Tosca
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(onClick = { isPenVisible = !isPenVisible }) {
                Icon(
                    painter = painterResource(id = R.drawable.pen),
                    contentDescription = "Pen",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.eraser),
                    contentDescription = "Hapus",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
            }
        }

        // Show Color Palette only if isPenVisible is true
        if (isPenVisible) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                for (i in 0..3) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        listOf(
                            Color.White,
                            Color.Black,
                            Color.Red,
                            Color.Cyan,
                            Color.DarkGray,
                            Color.Magenta,
                            Color.Blue,
                            Color.Green,
                            Color.Yellow,
                            Color(0xFFB6E0FE),  // Light Blue
                            Color(0xFFFFA8A8),  // Light Red
                            Color(0xFFFFA8D8),  // Light Pink
                            Color(0xFF00FF00),  // Bright Green
                            Color(0xFFFF00FF),  // Bright Magenta
                            Color(0xFFFF1493),  // Deep Pink
                            Color(0xFF00BFFF)   // Deep Sky Blue
                        ).chunked(4)[i].forEach { color ->
                            Surface(
                                modifier = Modifier
                                    .size(40.dp)
                                    .background(color)
                                    .clickable { currentColor = color },
                                shape = CircleShape,
                                color = color
                            ) {}
                        }
                    }
                }
            }
        }

        // Journal Entry Box
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFF0F0F0), RoundedCornerShape(10.dp))
                .padding(16.dp)
        ) {
            Column {
                BasicTextField(
                    value = titleText,
                    onValueChange = { titleText = it },
                    textStyle = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
                Divider(
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(1.dp)
                        .padding(bottom = 20.dp)
                )
                repeat(10) {
                    BasicTextField(
                        value = bodyText,
                        onValueChange = { bodyText = it },
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    )
                    Divider(
                        color = Color.Gray,
                        modifier = Modifier
                            .fillMaxWidth()
                            .width(1.dp)
                            .padding(vertical = 20.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun journalDrawPrev() {
    val navController = rememberNavController()
    SejiwakuTheme {
        journalMenulis(navController = navController)
    }
}
