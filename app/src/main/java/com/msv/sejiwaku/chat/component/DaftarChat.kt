package com.msv.sejiwaku.chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.abu_abu
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun DaftarChat(
    profileurl:String,
    nama:String,
    waktu:String,
    onClickChat:()->Unit
) {
    Divider(thickness = 1.dp, color = Tosca)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(69.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(profileurl)
                        .crossfade(true)
                        .build(),
                    contentDescription = "profile",
                    placeholder = painterResource(id = R.drawable.cheklish),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .border(1.dp, Tosca, CircleShape)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(160.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = nama, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, fontFamily = inter, color = Tosca)
            Text(text = waktu, fontSize = 9.sp, fontFamily = inter, color = abu_abu)
        }
        Column(
            modifier = Modifier
                .fillMaxHeight().fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .width(46.dp)
                    .height(19.dp)
                    .background(Tosca, RoundedCornerShape(6.dp))
                    .clickable { onClickChat() },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Chat", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, fontFamily = inter, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDaftarChat() {
    SejiwakuTheme {
        DaftarChat(
            profileurl = "",
            nama = "Rudmi Rayan, M.Psi",
            waktu = "Chat diterima",
            onClickChat = {}
        )
    }
}