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
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginPage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        var newTextValue by remember {
            mutableStateOf("")
        }
        var password by rememberSaveable {
            mutableStateOf("")
        }
        var passwordVisibility by remember {
            mutableStateOf(false)
        }
        var icon = if(passwordVisibility)
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
                .padding(top = 24.dp, start = 39.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Log In", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(26.dp))
            OutlinedTextField(
                value = newTextValue, onValueChange = {
                    newTextValue = it
                },
                label = { Text(text = "EMAIL", fontWeight = FontWeight.Bold) },
                //maxLines = 2
                singleLine = true,
                modifier = Modifier.width(295.dp),
                placeholder = {
                    Text(text = "test@email.com")
                },

                )
            Spacer(modifier = Modifier.size(26.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                placeholder = {
                    Text(text = "KATA SANDI", fontWeight = FontWeight.Bold)
                },
                modifier = Modifier.width(295.dp),
                label = {
                    Text(text = "KATA SANDI", fontWeight = FontWeight.Bold)
                },
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
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
                visualTransformation = if(passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation()
            )

        }
        Column(
            modifier = Modifier
                .padding(start = 197.dp)
                .fillMaxWidth()
        ) {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Forget Password ?", color = Color(
                    red = 0.2f,
                    green = 0.725f,
                    blue = 0.675f,
                    alpha = 1.0f
                ),
                )
            }
        }
        Column(
            modifier = Modifier.padding(top = 14.dp, start = 37.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier.size(height = 54.dp, width = 295.dp),
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Login")
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 70.dp)
        ) {
            Box(
                Modifier.padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                Divider(color = Color(red = 0.745f, green = 0.773f, blue = 0.824f, alpha = 1.0f), thickness = 1.dp)
                Text(text = "   Or", modifier = Modifier
                    .background(Color.White)
                    .size(width = 40.dp, height = 20.dp))
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
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
            OutlinedIconButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
            OutlinedIconButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            }
        }
        Row(
            Modifier.padding(start = 65.dp, top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Don’t have an account?")
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Register")
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
private fun PreviewLoginPage() {
    SejiwakuTheme {

        LoginPage()
    }
}