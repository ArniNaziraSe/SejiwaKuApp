package com.msv.sejiwaku.homepage.satuhomescreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

data class journey(val title: String, val description: String, val imageRes: Int, val icon: ImageVector)

val journeys = listOf(
    journey("Tidur Nyenyak", "Meditasi 3 sesi", R.drawable.hsjourney1, Icons.Default.ArrowForwardIos),
    journey("Tenang dalam malam", "Meditasi 5 menit", R.drawable.hsjourney2, Icons.Default.ArrowForwardIos),
    journey("Nikmati hari libur", "Meditasi 3 menit", R.drawable.hsjourney3, Icons.Default.ArrowForwardIos),
    journey("Suasana Pantai", "Meditasi 3 menit", R.drawable.hsjourney4, Icons.Default.ArrowForwardIos),
    journey("Suasana Pantai", "Meditasi 3 menit", R.drawable.hsjourney4, Icons.Default.ArrowForwardIos),
    journey("Suasana Pantai", "Meditasi 3 menit", R.drawable.hsjourney4, Icons.Default.ArrowForwardIos),
)

@Composable
fun journeyHomeItem(journey: journey) {
    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .padding(10.dp)
            .clickable { /* klik kemana */ }
            .border(2.dp, color = Color(0xFF33B9AC), RoundedCornerShape(10.dp))
    ) {
        Column(modifier = Modifier) {
            Image(
                painter = painterResource(id = journey.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp),
                contentScale = ContentScale.FillWidth
            )
            Row(
                modifier = Modifier.padding(5.dp, bottom = 10.dp)
            ) {
                Column {
                    Text(text = journey.title, fontSize = 10.sp, fontWeight = FontWeight.Bold, overflow = TextOverflow.Ellipsis, maxLines = 1, modifier = Modifier.width(100.dp).padding(horizontal = 8.dp))
                    Text(text = journey.description, fontSize = 8.sp, color = Color.Gray, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp))
                }
                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 8.dp, start = 30.dp, end = 10.dp, bottom = 8.dp)
                        .size(15.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun journeyhomePrev() {
    SejiwakuTheme {
        journeyHomeItem(journey = journey("Tenang dalam malam", "Meditasi 5 menit", R.drawable.hsjourney2, Icons.Default.ArrowForwardIos))
    }
}