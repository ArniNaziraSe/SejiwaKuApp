package com.msv.sejiwaku.profile.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.profile.component.PerpindahanProfilSatu
import com.msv.sejiwaku.profile.component.ProfileCircular
import com.msv.sejiwaku.profile.component.TeksOutput
import com.msv.sejiwaku.sda.navigator.jalanpindah.BagianLoginDanTemannya
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.abu_abu_muda
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen

@Composable
fun Profile(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        PerpindahanProfilSatu(
            onClicksatu = { /*TODO*/ },
            onClickdua = {
                navController.navigate(BottonBarScreen.ProfilEdit.route) {
                    popUpTo(BottonBarScreen.Profil.route) {
                        inclusive = true
                    }
                }
                         },
            colorsatu = Color.White,
            colordua = abu_abu_muda
        )
        Spacer(modifier = Modifier.size(70.dp))
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
        Profile(navController = rememberNavController())
    }
}