package com.msv.sejiwaku.profile.preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.profile.component.PerpindahanProfilSatu
import com.msv.sejiwaku.profile.component.ProfileCircularEdit
import com.msv.sejiwaku.profile.component.TeksInput
import com.msv.sejiwaku.profile.component.TeksInputVisibility
import com.msv.sejiwaku.ui.theme.abu_abu_muda
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen


@Composable
fun EditProfile(
    navController: NavController
) {
    // ext
    // var nama by remember {mustableStateOf("")}
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box {
            Column {
                Spacer(modifier = Modifier.size(20.dp))
                PerpindahanProfilSatu(
                    onClicksatu = {
                        navController.navigate(BottonBarScreen.Profil.route) {
                            popUpTo(BottonBarScreen.ProfilEdit.route) {
                                inclusive = true
                            }
                        }

                                  },
                    onClickdua = { /*TODO*/ },
                    colorsatu = abu_abu_muda,
                    colordua = Color.White
                )
                Spacer(modifier = Modifier.size(30.dp))
                ProfileCircularEdit(
                    profileurl = "https://rahmad1111.github.io/filenya/logo.jpg",
                    onClickedit = {},
                    edit = R.drawable.editprofilefoto
                )
                Spacer(modifier = Modifier.size(38.dp))
                TeksInput(judul = "Nama", value = "Farras", variableinput = "") {

                }
                Spacer(modifier = Modifier.size(18.dp))
                TeksInput(judul = "Tempat tanggal lahir", value = "12-01-2003", variableinput = "") {

                }
                Spacer(modifier = Modifier.size(18.dp))
                TeksInput(judul = "No. Handphone", value = "089874823334", variableinput = "") {

                }
                Spacer(modifier = Modifier.size(18.dp))
                TeksInput(judul = "Email", value = "Farras@gmail.com", variableinput = "") {

                }
                Spacer(modifier = Modifier.size(18.dp))
                TeksInputVisibility(judul = "Kata Sandi", value = "Farras12_", variableinput = "") {

                }
                Spacer(modifier = Modifier.size(18.dp))
                TeksInputVisibility(judul = "Konfirmasi kata sandi", value = "Farras12_", variableinput = "") {

                }
            }
            Image(painter = painterResource(id = R.drawable.savebuttonprofile), contentDescription = "tombol save", modifier = Modifier
                .padding(top = 80.dp, start = 250.dp)
                .size(width = 71.dp, height = 40.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewEditProfile() {
    EditProfile(navController = rememberNavController())
}