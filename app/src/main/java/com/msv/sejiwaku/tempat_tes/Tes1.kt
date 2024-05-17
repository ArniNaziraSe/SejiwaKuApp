package com.msv.sejiwaku.tempat_tes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import com.msv.sejiwaku.R

@Composable
fun Tes1() {
    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    val fontName = GoogleFont("Lobster Two")

    val fontFamily = FontFamily(
        Font(googleFont = fontName, fontProvider = provider)
    )

    Text(text = "Tes", fontFamily = fontFamily)
}

@Preview(showBackground = true)
@Composable
private fun PreviewTes() {
    Tes1()
}