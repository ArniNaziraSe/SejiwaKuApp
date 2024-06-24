package com.msv.sejiwaku.pembayaranpremium.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.Mulish
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun SelectPembayaran() {
    var opsiTerpilih by remember { mutableStateOf("Opsi 1") }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GrupRadio(
            opsi = listOf(
                Pair("BCA", R.drawable.bca),
                Pair("BNI", R.drawable.bni),
                Pair("Mandiri", R.drawable.mandiri),
                Pair("OVO", R.drawable.ovo),
                Pair("DANA", R.drawable.dana),
                Pair("GOPAY", R.drawable.gopay),
                Pair("LINKAJA", R.drawable.linkaja)
            ),
            opsiTerpilih = opsiTerpilih,
            onOpsiSelected = { opsi ->
                opsiTerpilih = opsi
            }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text("Opsi yang terpilih: $opsiTerpilih")
    }
}

@Composable
fun GrupRadio(
    opsi: List<Pair<String, Int>>,
    opsiTerpilih: String,
    onOpsiSelected: (String) -> Unit
) {
    opsi.forEach { (label, gambarResId) ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.width(70.dp)
            ) {
                Image(
                    painter = painterResource(gambarResId),
                    contentDescription = null,
                    modifier = Modifier.size(54.dp)
                )
            }
            Column(
                modifier = Modifier.width(190.dp)
            ) {
                Text(text = label, fontSize = 16.sp, fontFamily = Mulish)
            }
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = (label == opsiTerpilih),
                    onClick = { onOpsiSelected(label) }
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewSelectPembayaran() {
    SejiwakuTheme {
        SelectPembayaran()
    }
}