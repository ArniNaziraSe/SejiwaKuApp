package com.msv.sejiwaku.akun.componentakun

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.LightTosca
import com.msv.sejiwaku.ui.theme.Tosca

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KontenPremium(
    text:String,
    jumlah: String,
    onClick:()->Unit,
    width:Int,
    height:Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
        ,

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            onClick = onClick,
            modifier = Modifier
                .width(width.dp)
                .height(height.dp)
            ,

            ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Tosca)

                ,

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.size(20.dp))
                    Imagecircle(painter = R.drawable.face_wink, size = 70, shape = CircleShape)
                    Column {
                        Text(
                            text = "Jadilah lebih dekat dengan",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = LightTosca,
                            modifier = Modifier.padding(
                                start = 20.dp,
                                top = 1.dp,

                                ),

                            )
                                    Text(
                                    text = "kami lewat akun premium.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                                        color = LightTosca,
                            modifier = Modifier.padding(
                                start = 20.dp,


                                )
                        )
                        Text(
                                text = "Pelajari selengkapnya dengan menekan ini.",
                            fontSize = 9.sp,
                            color = LightTosca,
                            modifier = Modifier.padding(start = 20.dp, top = 1.dp)
                        )
                    }



                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = jumlah.toString())
                    Spacer(modifier = Modifier.size(10.dp))
                    Image(painter = painterResource(id = R.drawable.expandleftakunputih), contentDescription = "iconnext")
                    Spacer(modifier = Modifier.size(5.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewKontenPremium() {
    KontenPremium(
        text = "Farras Syauqi",
        jumlah = "",
        onClick = {},
        width = 345,
        height = 92
    )
}