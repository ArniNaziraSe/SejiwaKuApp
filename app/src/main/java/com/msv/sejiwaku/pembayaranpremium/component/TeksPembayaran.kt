package com.msv.sejiwaku.pembayaranpremium.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun TeksPembayaran(
    text:String,
    painter:Int,
    tint: Color = LocalContentColor.current
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(28.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = text, fontFamily = inter, fontWeight = FontWeight.SemiBold, color = abu_abu)
            Spacer(modifier = Modifier.size(4.dp))
            Icon(painter = painterResource(id = painter), contentDescription = "Icon", tint = tint, modifier = Modifier.size(18.dp))
        }
    }
}

@Preview
@Composable
private fun PreviewTeksPembayaran() {
    SejiwakuTheme {
        TeksPembayaran(
            text = "Example",
            painter = R.drawable.bintang,
            tint = Color.Yellow
        )
    }
}