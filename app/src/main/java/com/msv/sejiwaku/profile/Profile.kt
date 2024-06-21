package com.msv.sejiwaku.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.profile.component.ProfileCircular
import com.msv.sejiwaku.profile.component.TeksOutput
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun Profile() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(100.dp))
        ProfileCircular(
            profileurl = "",
            edit = R.drawable.editprofilefoto,
            onClickedit = {}
        )
        Spacer(modifier = Modifier.size(38.dp))
        TeksOutput(judul = "Nama", value = "")
        Spacer(modifier = Modifier.size(18.dp))
        TeksOutput(judul = "Tempat Tanggal Lahir", value = "")
        Spacer(modifier = Modifier.size(18.dp))
        TeksOutput(judul = "No. Handphone", value = "")
        Spacer(modifier = Modifier.size(18.dp))
        TeksOutput(judul = "Email", value = "")
        Spacer(modifier = Modifier.size(18.dp))
        TeksOutput(judul = "Kata Sandi", value = "***************")
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewProfile() {
    SejiwakuTheme {
        Profile()
    }
}