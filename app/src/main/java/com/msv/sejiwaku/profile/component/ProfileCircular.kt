package com.msv.sejiwaku.profile.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.R

@Composable
fun ProfileCircular(
    profileurl:String,
    edit:Int = 0,
    onClickedit:()-> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            // garis pinggir
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.profileellipse), contentDescription = "gambar ellipse", modifier = Modifier
                    .size(222.dp)
                )
            }
            // iconnya
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Image(imageVector = Icons.Default.AccountCircle, contentDescription = "gambarexample", modifier = Modifier
//                    .clip(shape = CircleShape)
//                    .size(150.dp),
//                    contentScale = ContentScale.Crop)
//            }
            // profilnya
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(profileurl)
                        .crossfade(true)
                        .build(),
                    contentDescription = "profile",
                    placeholder = painterResource(id = R.drawable.cheklish),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(190.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewProfileCircular() {
    SejiwakuTheme {
        ProfileCircular(
            profileurl = "https://rahmad1111.github.io/filenya/logo.jpg",
            edit = R.drawable.editprofilefoto,
            onClickedit = {}

        )
    }
}