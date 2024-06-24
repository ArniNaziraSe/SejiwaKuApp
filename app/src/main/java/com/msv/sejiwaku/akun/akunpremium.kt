package com.msv.sejiwaku.akun

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.akun.componentakun.KontenAkun
import com.msv.sejiwaku.akun.componentakun.KontenPremium
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun AkunPremium(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {}

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 17.dp, end = 17.dp, top = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.kembali),
                contentDescription = "kembali",
                modifier = Modifier.size(width = 23.dp, height = 50.dp)
            )


        }
        Row {
            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = "Akun",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                color = Tosca
            )
        }
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_saja),
                contentDescription = "logo_saja",
                modifier = Modifier.size(60.dp)
            )


        }
    }


    Column(
        modifier = Modifier.padding(top = 100.dp)
    ) {
        KontenAkun(
            text = "Farras Syauqi",
            jumlah = "",
            onClick = {},
            width = 355,
            height = 65
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewAkunPremium(){

    AkunPremium(rememberNavController())
}