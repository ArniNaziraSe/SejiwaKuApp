package com.msv.sejiwaku.homepage.homescreen.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun aktivitasHomeItem(title: String, description: String, icon: ImageVector) {
    Row(
        modifier = Modifier
            .clip(RectangleShape)
            .border(2.dp, color = Color(0xFF33B9AC), RoundedCornerShape(10.dp))
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable { /* click */ }
        ) {
            Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text(text = description, fontSize = 12.sp, color = Color.Gray)
        }
        Icon(
            imageVector = Icons.Default.ArrowForwardIos,
            contentDescription = null,
            modifier = Modifier.padding(top = 26.dp, start = 28.dp, end = 10.dp).size(15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun aktivitasHomeItemPreview() {
    SejiwakuTheme {
        aktivitasHomeItem(title = "Lanjutkan Journey", description = "Meditasi Tidur", icon = Icons.Default.ArrowForwardIos)
    }
}