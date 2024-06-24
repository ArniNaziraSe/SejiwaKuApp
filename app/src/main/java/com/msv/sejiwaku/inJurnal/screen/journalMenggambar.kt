package com.msv.sejiwaku.inJurnal.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.inJurnal.screen.component.topbarJournal
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun journalMenggambar(navController: NavController) {
    var currentColor by remember { mutableStateOf(Color.Black) }
    var drawPaths by remember { mutableStateOf(listOf<Path>()) }
    var currentPath = remember { Path() }
    var isPaletteVisible by remember { mutableStateOf(false) }

    Column {
        topbarJournal(navController = navController, title = "Menggambar")
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
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.brush),
                    contentDescription = "Brush",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
            }
            IconButton(onClick = { isPaletteVisible = !isPaletteVisible }) {
                Icon(
                    painter = painterResource(id = R.drawable.pallete),
                    contentDescription = "Pallete",
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

        // Show Color Palette only if isPaletteVisible is true
        if (isPaletteVisible) {
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

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .pointerInput(Unit) {
                    detectDragGestures { change, _ ->
                        val newPoint = change.position
                        if (currentPath.isEmpty) {
                            currentPath.moveTo(newPoint.x, newPoint.y)
                        } else {
                            currentPath.lineTo(newPoint.x, newPoint.y)
                        }
                        drawPaths = drawPaths + currentPath
                    }
                }
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawPaths.forEach { path ->
                    drawPath(path = path, color = currentColor)
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
        journalMenggambar(navController = navController)
    }
}