package com.msv.sejiwaku.payment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.payment.component.DetailPay
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.Tosca

@Composable
fun Payment() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pembayaran Berhasil",
            color = Tosca,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        DetailPay(
            tanggal = "Kamis, 2 Mei 2024",
            waktu = "20.00",
            metodePembayaran = "Transfer BCA",
            totalBiaya = "69.000"
        )
        Spacer(modifier = Modifier.weight(1f))  // This spacer will push the button to the bottom
        Button(
            onClick = { /* TODO: Handle button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(50.dp)  // Adjust the height to match the button in the image
                .clip(RoundedCornerShape(4.dp)),  // Adjust the rounded corners to match the image
            colors = ButtonDefaults.buttonColors(containerColor = Tosca)
        ) {
            Text(text = "Kembali", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun paymentPrev() {
    SejiwakuTheme {
        Payment()
    }
}