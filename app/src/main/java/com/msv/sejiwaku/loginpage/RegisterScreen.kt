package com.msv.sejiwaku.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.Graph
import com.msv.sejiwaku.halamanbottonbar_dan_appbar.navigation.LoginScreen
import com.msv.sejiwaku.ui.theme.SejiwakuTheme
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun RegisterPage(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        //variabel font
        val namafont = inter
        // pemanggil fontFamily = namafont,
        //variabel untuk TextField
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
        var passwordVisibilitylogin by remember {
            mutableStateOf(false)
        }
        var icon = if(passwordVisibilitylogin)
            painterResource(id = R.drawable.on_eye)
        else
            painterResource(id = R.drawable.off_eye)



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
            Text(text = "Register",fontFamily = namafont, fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 39.dp))
            Spacer(modifier = Modifier.size(26.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = namalengkapregister, onValueChange = {
                        namalengkapregister = it
                    },
                    label = { Text(text = "NAMA LENGKAP", fontFamily = namafont, fontWeight = FontWeight.Bold) },
                    //maxLines = 2
                    singleLine = true,
                    modifier = Modifier.width(295.dp),
                    placeholder = {
                        Text(text = "Samantha", fontFamily = namafont)
                    },

                    )
                Spacer(modifier = Modifier.size(26.dp))
                OutlinedTextField(
                    value = emailregister, onValueChange = {
                        emailregister = it
                    },
                    label = { Text(text = "EMAIL",fontFamily = namafont, fontWeight = FontWeight.Bold) },
                    //maxLines = 2
                    singleLine = true,
                    modifier = Modifier.width(295.dp),
                    placeholder = {
                        Text(text = "smantha@mail.com",fontFamily = namafont)
                    },

                    )
                Spacer(modifier = Modifier.size(26.dp))
                OutlinedTextField(
                    value = passwordregister1,
                    onValueChange = {
                        passwordregister1 = it
                    },
                    modifier = Modifier.width(295.dp),
                    label = {
                        Text(text = "KATA SANDI", fontFamily = namafont, fontWeight = FontWeight.Bold)
                    },
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibilitylogin = !passwordVisibilitylogin
                        }) {
                            Icon(
                                painter = icon,
                                contentDescription = "Logo mata on",
                                Modifier.size(30.dp)
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    visualTransformation = if(passwordVisibilitylogin) VisualTransformation.None
                    else PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.size(26.dp))
                OutlinedTextField(
                    value = passwordregister2,
                    onValueChange = {
                        passwordregister2 = it
                    },
                    modifier = Modifier.width(295.dp),
                    label = {
                        Text(text = "KONFIRMASI KATA SANDI", fontFamily = namafont, fontWeight = FontWeight.Bold)
                    },
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibilitylogin = !passwordVisibilitylogin
                        }) {
                            Icon(
                                painter = icon,
                                contentDescription = "Logo mata on",
                                Modifier.size(30.dp)
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    visualTransformation = if(passwordVisibilitylogin) VisualTransformation.None
                    else PasswordVisualTransformation()
                )
                Column(
                    modifier = Modifier
                        .padding(top = 44.dp,)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier.size(height = 54.dp, width = 295.dp),
                        onClick = { navController.navigate(Graph.ISI) },
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
                        Text(text = "Register", fontFamily = namafont,)
                    }
                }
                Column(
                    Modifier.padding( top = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Don’t have an account?")
                    TextButton(onClick = { navController.navigate(LoginScreen.Login.route) }) {
                        Text(
                            text = "Login",
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
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegisterPage() {
    SejiwakuTheme {
        RegisterPage(navController = rememberNavController())
    }
}