package com.msv.sejiwaku.loginpage

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.loginpage.component.ButtonRegister
import com.msv.sejiwaku.loginpage.component.TeksInputBiasaLogin
import com.msv.sejiwaku.loginpage.component.TeksInputPasswordLogin
import com.msv.sejiwaku.sda.logindata.SharedPreferencesManager
import com.msv.sejiwaku.sda.navigator.jalanpindah.BagianLoginDanTemannya
import com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.inter
import kotlinx.coroutines.launch

@Composable
fun RegisterPage(
    navController: NavController
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }

    val dataStore = DataStoreJourneyDua(context)
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        var namalengkapregister by remember {
            mutableStateOf("")
        }
        var emailregister by remember {
            mutableStateOf("")
        }
        var passwordregister1 by rememberSaveable {
            mutableStateOf("")
        }
        var passwordregister2 by rememberSaveable {
            mutableStateOf("")
        }



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(44.dp)
                .padding(start = 17.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.iconback),
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_saja),
                contentDescription = null,
                modifier = Modifier
                    .size(133.dp)
                    .padding(top = 10.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 6.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Register",fontFamily = inter, fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 39.dp))
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputBiasaLogin(judul = namalengkapregister, placeholder = "Samantha", value = "NAMA LENGKAP") {
                namalengkapregister = it
            }
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputBiasaLogin(judul = emailregister, placeholder = "smantha@mail.com", value = "EMAIL") {
                emailregister = it
            }
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputPasswordLogin(judul = "KATA SANDI", value = passwordregister1) {
                passwordregister1 = it
            }
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputPasswordLogin(judul = "KONFIRMASI KATA SANDI", value = passwordregister2) {
                passwordregister2 = it
            }
            ButtonRegister {
                if (namalengkapregister.isBlank()){
                    Toast.makeText(context, "Harus Diisi", Toast.LENGTH_SHORT).show()
                } else {
                    sharedPreferencesManager.namalengkapregister = namalengkapregister
                    coroutineScope.launch {
                        dataStore.saveStatus(true)
                    }
                    navController.navigate(BagianLoginDanTemannya.OnboardingPertama.route) {
                        popUpTo(BagianLoginDanTemannya.Register.route) {
                            inclusive = false
                        }
                    }
                }
                /*navController.navigate(LoginScreen.Login.route)*/
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.size(26.dp))
                Column(
                    Modifier.padding( top = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Don’t have an account?")
                    TextButton(onClick = { navController.navigate(BagianLoginDanTemannya.Login.route) }) {
                        Text(
                            text = "Login",
                            fontFamily = inter,
                            color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ),
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegisterPage() {
    SejiwakuTheme {
        RegisterPage(navController = rememberNavController())
    }
}