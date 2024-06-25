package com.msv.sejiwaku.akun

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.akun.componentakun.KontenAkun
import com.msv.sejiwaku.akun.componentakun.KontenPremium
import com.msv.sejiwaku.sda.logindata.DataStoreAkunFreedanPremium
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
import com.msv.sejiwaku.sda.logindata.DataStoreJourneySatu
import com.msv.sejiwaku.sda.logindata.DataStoreLogin
import com.msv.sejiwaku.sda.mvvm.alert.MainViewModel
import com.msv.sejiwaku.sda.mvvm.login.AuthViewModel
import com.msv.sejiwaku.sda.navigator.jalanpindah.BottonBarScreen
import com.msv.sejiwaku.sda.navigator.jalanpindah.Urutan
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.inter
import kotlinx.coroutines.launch

@Composable
fun Akunfree(navController: NavController) {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val dataStore = DataStoreLogin(context)
    val viewModel: MainViewModel = viewModel()
    val viewModellogin: AuthViewModel = viewModel()
    val dataStorejournye = DataStoreJourneySatu(context)
    val dataStorejournyee = DataStoreJourneyDua(context)
    val dataStorefreedanpremium = DataStoreAkunFreedanPremium(context)
    Column(
        modifier = Modifier.fillMaxSize()
    ){}

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 17.dp, end = 17.dp, top = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.kembali),
                contentDescription = "kembali",
                modifier = Modifier
                    .size(width = 23.dp, height = 50.dp)
                    .clickable { navController.navigate(BottonBarScreen.Home.route) }
            )


        }
        Row {
            Text(modifier = Modifier.padding(start = 15.dp), text = "Akun", fontWeight = FontWeight.ExtraBold, fontSize = 25.sp, color = Tosca)
        }
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_saja),
                contentDescription = "logo_saja",
                modifier = Modifier.size(60.dp)
            )


        }
    }

    Column(
        modifier = Modifier.padding(top = 90.dp)
    )
    {
        KontenPremium(
            text = "Farras Syauqi",
            jumlah = "",
            onClick = {
                navController.navigate(BottonBarScreen.PembayaranFree.route){
                    popUpTo(BottonBarScreen.AkunFree.route){
                        inclusive = true
                    }
                }
            },
            width = 355,
            height = 92
        )

        Column(
            modifier = Modifier.padding(top = 10.dp)
        ){}
        KontenAkun(
        text = "Farras Syauqi",
        jumlah = "",
        onClick = {
            navController.navigate(BottonBarScreen.Profil.route)
        },
        width = 355,
        height = 65
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 19.dp, top = 3.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "Log Out",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                fontFamily = inter,
                color = Tosca,
                modifier = Modifier
                    .clickable {
                        viewModel.showAlert()
                        coroutineScope.launch {
                            dataStore.clearStatus()
                        }
                        coroutineScope.launch {
                            dataStorejournye.clearStatus()
                        }
                        coroutineScope.launch {
                            dataStorejournyee.clearStatus()
                        }
                        coroutineScope.launch {
                            dataStorefreedanpremium.clearStatus()
                        }

                    }
            )
        }
        if (viewModel.showDialog.value) {
            AlertDialog(
                onDismissRequest = { viewModel.dismissAlert() },
                title = {
                    Text(text = "Peringatan")
                },
                text = {
                    Text(text = "Aplikasi akan ditutup saat menekan 'OK'")
                },
                confirmButton = {
                    Button(
                        colors = ButtonDefaults.buttonColors(containerColor = Tosca),
                        onClick = {
                            viewModellogin
                            viewModel.dismissAlert()
                            navController.navigate(Urutan.BAGIANLOGINDANTEMANNYA) {
                                popUpTo(BottonBarScreen.AkunPremium.route) {
                                    inclusive = true
                                }
                            }
                        }
                    ) {
                        Text("OK")
                    }
                }
            )
        }
    }
}



    @Preview(showBackground = true)
    @Composable
    private fun PreviewAkunfree(){

        Akunfree(rememberNavController())
    }