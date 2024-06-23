package com.msv.sejiwaku.chat.free

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.chat.component.BottonKembaliCircular
import com.msv.sejiwaku.chat.component.KomponenIsi
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.abu_abu_muda
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun GaleriChat(
    navController: NavController
) {
    Scaffold(
        floatingActionButton = {
            Image(painter = painterResource(id = R.drawable.floatingchat), contentDescription = "floatingchat", modifier = Modifier
                .size(50.dp)
                .clickable { })
        }
    ) {valuepadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(valuepadding)
        ) {
            BottonKembaliCircular {

            }
            Text(text = "Chat dengan Dokter Andalanmu", fontSize = 16.sp, fontWeight = FontWeight.Bold, fontFamily = inter, color = Tosca, modifier = Modifier.padding(start = 22.dp, top = 10.dp, bottom = 10.dp))
            KomponenIsi(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewGaleriChat() {
    SejiwakuTheme {
        GaleriChat(
            navController = rememberNavController()
        )
    }
}