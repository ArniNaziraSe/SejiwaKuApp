package com.msv.sejiwaku.akun.componentakun

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun Imagecircle(
    painter:Int,
    size:Int,
    shape: Shape
) {


    Column(
    ) {
        Image(
            painter = painterResource(id = painter),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(size.dp)
                .clip(shape = shape),
        )
    }
}

@Preview
@Composable
private fun PreviewImagecircle() {
    Imagecircle(painter = R.drawable.ellipse_1, size = 170, shape = CircleShape)
}