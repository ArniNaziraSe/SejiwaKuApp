@file:Suppress("UNUSED_EXPRESSION")

package com.msv.sejiwaku.loginpage

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.msv.sejiwaku.R
import com.msv.sejiwaku.loginpage.component.TeksInputBiasaLogin
import com.msv.sejiwaku.loginpage.component.TeksInputPasswordLogin
import com.msv.sejiwaku.sda.logindata.SharedPreferencesManager
import com.msv.sejiwaku.sda.mvvm.alert.MainViewModel
import com.msv.sejiwaku.sda.mvvm.login.AuthViewModel
import com.msv.sejiwaku.sda.navigator.jalanpindah.BagianLoginDanTemannya
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.inter

object FirebaseAuthManager {
    @Composable
    fun provideFirebaseAuth(): FirebaseAuth {
        return remember {
            Firebase.auth
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginPage(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        // ini untuk datastore
        val viewModel: AuthViewModel = viewModel()
        val authState = viewModel.authState.observeAsState()
        val context = LocalContext.current
        val coroutineScope = rememberCoroutineScope()
        val sharedPreferencesManager = remember {
            SharedPreferencesManager(context)
        }
        val dataStore = com.msv.sejiwaku.sda.logindata.DataStoreJourneyDua(context)

        val namafont = inter
        var email by remember {
            mutableStateOf("")
        }
        var password by rememberSaveable {
            mutableStateOf("")
        }


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_saja),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 23.dp)
                    .size(184.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Log In", fontSize = 24.sp, fontFamily = namafont, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 39.dp))
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputBiasaLogin(judul = "EMAIL", placeholder = "", value = email) {
                email = it
            }
            Spacer(modifier = Modifier.size(26.dp))
            TeksInputPasswordLogin(judul = "KATA SANDI", value = password) {
                password = it
            }
        }
        Column(
            modifier = Modifier
                .padding(start = 197.dp)
                .fillMaxWidth()
        ) {
            TextButton(onClick = { navController.navigate(BagianLoginDanTemannya.LupaPassword.route) }) {
                Text(text = "Forget Password ?",fontFamily = namafont, color = Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                ),
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 14.dp,)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier.size(height = 54.dp, width = 295.dp),
                onClick = {
                    if (email.isBlank() || password.isBlank()){
                        Toast.makeText(context, "Email dan Password Harus Diisi", Toast.LENGTH_SHORT).show()
                    } else {
                        viewModel.login(email, password)
                        sharedPreferencesManager.emaillogin = email
                        sharedPreferencesManager.passwordlogin = password
                        navController.navigate(BagianLoginDanTemannya.OnboardingPertama.route) {
                            popUpTo(BagianLoginDanTemannya.Login.route) {
                                inclusive = true
                            }
                        }
                    }
                          /*navController.navigate(LoginScreen.Onbording1.route)*/
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                )
            ) {
                Text(text = "Login",fontFamily = namafont,)
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Row(
                Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(color = Color(red = 0.745f, green = 0.773f, blue = 0.824f, alpha = 1.0f), thickness = 1.dp, modifier = Modifier.size(width = 150.dp, height = 1.dp))
                Spacer(modifier = Modifier.size(2.dp))
                Text(text = "  Or",fontFamily = namafont, modifier = Modifier
                    .size(width = 40.dp, height = 20.dp)
                )
                Spacer(modifier = Modifier.size(2.dp))
                Divider(color = Color(red = 0.745f, green = 0.773f, blue = 0.824f, alpha = 1.0f), thickness = 1.dp, modifier = Modifier.size(width = 150.dp, height = 1.dp))
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            OutlinedIconButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.facebook), contentDescription = null, modifier = Modifier.size(24.dp))
            }
            OutlinedIconButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.google), contentDescription = null, modifier = Modifier.size(24.dp))
            }
            OutlinedIconButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(painter = painterResource(id = R.drawable.instagram), contentDescription = null, modifier = Modifier.size(24.dp))
            }
        }
        Row(
            Modifier.padding(start = 65.dp, top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Don’t have an account?",fontFamily = namafont)
            TextButton(onClick = { navController.navigate(BagianLoginDanTemannya.Register.route) }) {
                Text(
                    text = "Register",
                    fontFamily = namafont,
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

@Preview(showBackground = true)
@Composable
private fun PreviewLoginPage() {
    SejiwakuTheme {
        LoginPage(navController = rememberNavController())
    }
}