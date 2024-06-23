package com.msv.sejiwaku.chatPremium

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

data class Doctor(
    val name: String,
    val status: String,
    val imageRes: Int
)

@Composable
fun GaleriChat(navController: NavHostController) {
    var doctors by remember {
        mutableStateOf(
            listOf(
                Doctor("Rudmi Rayan, M.Psi", "Chat diterima", R.drawable.drrr),
                Doctor("Dr. Rocky Sur", "Chat 2 bulan yang lalu", R.drawable.drrs)
            )
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            TopBar()

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color(0xFFF5F5F5), shape = RoundedCornerShape(8.dp))
                    .padding(8.dp)
            ) {
                Column {
                    SearchBar()

                    Spacer(modifier = Modifier.height(8.dp))

                    LazyColumn {
                        items(doctors) { doctor ->
                            Divider(color = Color(0xFF33B9AC), thickness = 1.dp, modifier = Modifier.padding(top = 8.dp))
                            DoctorChatItem(
                                name = doctor.name,
                                status = doctor.status,
                                imageRes = doctor.imageRes
                            )
                        }
                    }
                }
            }
        }

        FloatingActionButton(
            onClick = {
                // Handle add button click
                doctors = doctors + Doctor(
                    name = "New Doctor",
                    status = "New chat",
                    imageRes = R.drawable.addbuttongalerichat // Default profile image
                )
            },
            backgroundColor = Color(0xFF009688),
            contentColor = Color.White,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.addbuttongalerichat), contentDescription = null)
        }
    }
}

@Composable
fun TopBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp)
    ) {
        IconButton(onClick = { /* Handle back button press */ }) {
            Icon(painter = painterResource(id = R.drawable.konselingdetailtombolback), contentDescription = null)
        }

        Text(
            text = "Chat dengan Dokter Andalanmu",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF009688),
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
fun SearchBar() {
    OutlinedTextField(
        value = "",
        onValueChange = { /* Handle search query */ },
        placeholder = { Text("Cari..", modifier = Modifier.fillMaxSize()) },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFFF5F5F5), shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(24.dp),
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = Color.Transparent,
            focusedBorderColor = Color(0xFFA0A0A0),
            unfocusedBorderColor = Color(0xFFA0A0A0)
        ),
        leadingIcon = {
            Icon(painter = painterResource(id = R.drawable.pencarian), contentDescription = null)
        }
    )
}

@Composable
fun DoctorChatItem(name: String, status: String, imageRes: Int) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF5F5F5))
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = status,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }

            Button(
                onClick = { /* Handle chat button click */ },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF009688))
            ) {
                Text(
                    text = "Chat",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun previewgcp() {
    val navController = rememberNavController()
    SejiwakuTheme {
        GaleriChat(navController = navController)
    }
}
