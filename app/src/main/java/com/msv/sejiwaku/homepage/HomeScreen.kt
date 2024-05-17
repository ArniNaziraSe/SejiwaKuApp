package com.msv.sejiwaku.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(
                    text = "SejiwaKu",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF33B9AC)
                )
            )
        },
        modifier = modifier
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            // Profile Screen
            var userName by remember {
                mutableStateOf("Hai, Farras")
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(start = 40.dp, end = 40.dp, top = 40.dp, bottom = 20.dp)
                    .fillMaxWidth()
                    .clickable {}
            ) {
                Image(
                    painter = painterResource(id = R.drawable.albert),
                    contentDescription = "foto profil",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(50.dp)
                        .border(3.dp, Color(0xFF33B9AC), CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier.padding(top = 3.dp)
                ) {
                    Text(text = userName, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text = "Apa kabarmu hari ini?", fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.width(40.dp))
                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = "icon",
                    modifier = Modifier.padding(top = 10.dp, start = 25.dp)
                )
            }
            Divider(
                color = Color(0xFF33B9AC),
                modifier = Modifier
                    .padding(start = 40.dp, end = 40.dp, bottom = 10.dp),
                thickness = 1.dp
            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                listOf(
                    "Sangat Buruk" to R.drawable.sangat_buruk,
                    "Buruk" to R.drawable.buruk,
                    "Netral" to R.drawable.netral,
                    "Baik" to R.drawable.baik,
                    "Sangat Baik" to R.drawable.sangat_baik
                ).forEach { (label, icon) ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable {  }
                    ) {
                        Image(
                            painter = painterResource(id = icon),
                            contentDescription = label,
                            modifier = Modifier.size(40.dp)
                        )
                        Text(text = label, fontSize = 14.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Divider(
                color = Color(0xFF33B9AC),
                modifier = Modifier
                    .padding(start = 40.dp, end = 40.dp, bottom = 20.dp),
                thickness = 1.dp
            )
            // Last Activity Section
            Text(text = "Aktivitas Terakhirmu", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.height(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(160.dp, 80.dp)
                        .clickable {  }
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Lanjutkan Journey\nMeditasi Tidur",
                        textAlign = TextAlign.Center
                    )
                }
                Box(
                    modifier = Modifier
                        .size(160.dp, 80.dp)
                        .clickable {  }
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Lanjutkan Journal\nHidup itu mudah",
                        textAlign = TextAlign.Center
                    )
                }
            }
            Spacer(modifier = Modifier.padding(16.dp))
            // New Journey Section
            Text(
                text = "New Journey",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Column {
                repeat(2) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        repeat(2) {
                            Box(
                                modifier = Modifier
                                    .size(160.dp, 80.dp)
                                    .clickable {  }
                                    .padding(8.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(text = "Journey", textAlign = TextAlign.Center)
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@Composable
fun EmojiItem(
    emojiRes: Int,
    description: String,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(30))
            .padding(5.dp)
            .clickable { onSelect() }
    ) {
        Image(
            painter = painterResource(id = emojiRes),
            contentDescription = description,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = description,
            fontSize = 10.sp
        )
    }
}

@Preview
@Composable
private fun homepreview() {
    SejiwakuTheme {
        HomeScreen()
    }
}