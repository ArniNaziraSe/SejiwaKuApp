package com.msv.sejiwaku.profile.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.ui.theme.abu_abu_muda
import com.msv.sejiwaku.ui.theme.inter
import com.msv.sejiwaku.ui.theme.toska

@Composable
fun PerpindahanProfilSatu(
    onClicksatu:()->Unit,
    onClickdua: () -> Unit,
    colorsatu: Color,
    colordua: Color
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .height(37.dp)
                .width(300.dp)
                .background(abu_abu_muda, shape = RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.Start,
        ) {
            Row {
                Column(
                    modifier = Modifier
                        .padding(3.dp)
                        .height(30.dp)
                        .width(140.dp)
                        .clickable { onClicksatu() }
                        .background(colorsatu, shape = RoundedCornerShape(20.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Profil", fontSize = 14.sp, fontFamily = inter, fontWeight = FontWeight.ExtraBold, color = toska)
                }
                Spacer(modifier = Modifier.size(9.dp))
                Column(
                    modifier = Modifier
                        .padding(3.dp)
                        .height(30.dp)
                        .width(140.dp)
                        .clickable { onClickdua() }
                        .background(colordua, shape = RoundedCornerShape(20.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Ubah Profile", fontSize = 14.sp, fontFamily = inter, fontWeight = FontWeight.ExtraBold, color = toska)
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewPerpindahanProfil() {
    PerpindahanProfilSatu(
        onClicksatu = { /*TODO*/ },
        onClickdua = { /*TODO*/ },
        colorsatu = abu_abu_muda,
        colordua = Color.White
    )
}