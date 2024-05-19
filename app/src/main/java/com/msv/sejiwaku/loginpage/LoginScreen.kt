@file:Suppress("UNUSED_EXPRESSION")

package com.msv.sejiwaku.loginpage

import android.graphics.ColorSpace
import android.graphics.ColorSpace.Rgb
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
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

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginPage(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        val namafont = inter
        var emaillogin by remember {
            mutableStateOf("")
        }
        var passwordlogin by rememberSaveable {
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
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = emaillogin, onValueChange = {
                        emaillogin = it
                    },
                    label = { Text(text = "EMAIL",fontFamily = namafont, fontWeight = FontWeight.Bold) },
                    //maxLines = 2
                    singleLine = true,
                    modifier = Modifier.width(295.dp),
                    placeholder = {
                        Text(text = "smantha@mail.com",fontFamily = namafont,)
                    },

                    )
                Spacer(modifier = Modifier.size(26.dp))
                OutlinedTextField(
                    value = passwordlogin,
                    onValueChange = {
                        passwordlogin = it
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
            }

        }
        Column(
            modifier = Modifier
                .padding(start = 197.dp)
                .fillMaxWidth()
        ) {
            TextButton(onClick = { navController.navigate(LoginScreen.LupaPassword.route) }) {
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
                onClick = { navController.navigate(LoginScreen.Onbording1.route) },
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
            TextButton(onClick = { navController.navigate(LoginScreen.Register.route) }) {
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