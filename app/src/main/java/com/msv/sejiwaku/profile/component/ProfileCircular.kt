package com.msv.sejiwaku.profile.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.R

@Composable
fun ProfileCircular(

) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.profileellipse), contentDescription = "gambar ellipse", modifier = Modifier.size(180.dp).align(Alignment.Center))
            Image(painter = painterResource(id = R.drawable.gambarkamupastibisadepansatu), contentDescription = "gambarexample", modifier = Modifier
                .align(
                    Alignment.Center
                )
                .clip(shape = CircleShape)
                .size(150.dp), contentScale = ContentScale.Crop)
            Image(painter = painterResource(id = R.drawable.editprofilefoto), contentDescription = "Gambar edit foto", modifier = Modifier.size(35.dp).padding())

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewProfileCircular() {
    SejiwakuTheme {
        ProfileCircular()
    }
}