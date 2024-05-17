package com.msv.sejiwaku.bagianonboardingnya

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun OnboardingHasil() {
    val namafont =
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Hasil", fontSize = 18.sp)
            Image(painter = painterResource(id = R.drawable.bintang), contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewOn() {
    OnboardingHasil()
}