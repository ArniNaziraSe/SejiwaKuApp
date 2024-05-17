package com.msv.sejiwaku.bagianonboardingnya

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun Onboardingke3() {
    val judul3 = arrayOf(
        "Diri Sendiri",
        "Keluarga",
        "Teman",
        "Lingkungan",
        "Pekerjaan"
    )
    val isi3 = arrayOf(
        "Perasaanku sangat buruk kali ini...:(",
        "Perasaanku buruk kali ini.....:(",
        "Perasaanku biasa aja.....:|",
        "Perasaanku baik aja....:(",
        "Perasaanku sangat baik kali ini.....:)",
    )
    val gambar3 = arrayOf(
        R.drawable.on11,
        R.drawable.on12,
        R.drawable.on13,
        R.drawable.on14,
        R.drawable.on15,
    )

    val ukuran = 97.dp

    val perpindahan = ""

    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    )
                )
                .height(67.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Sejiwaku", fontSize = 28.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        //////////============///////////===========
        Text(text = "Apa yang membuat kamu merasa seperti itu?", modifier = Modifier.padding(start = 20.dp, top = 16.dp, bottom = 16.dp))
        //////////============///////////===========
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Box {
                Surface(
                    modifier = Modifier
                        .clickable {  }
                        .height(ukuran)
                        .fillMaxWidth(),
                    color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .clickable { perpindahan }
                        .height(94.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(13.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(painter = painterResource(id = gambar3[0]), contentDescription = "")
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = judul3[0], fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Text(text = isi3[0], fontSize = 9.sp)
                        }
                    }
                }
            }
            //////-------------------////////////////----
            Spacer(modifier = Modifier.size(9.dp))
            Box {
                Surface(
                    modifier = Modifier
                        .clickable { }
                        .height(ukuran)
                        .fillMaxWidth(),
                    color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .clickable { perpindahan }
                        .height(94.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(13.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(painter = painterResource(id = gambar3[1]), contentDescription = "")
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = judul3[1], fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Text(text = isi3[1], fontSize = 9.sp)
                        }
                    }
                }
            }
            //////-------------------////////////////----
            Spacer(modifier = Modifier.size(9.dp))
            Box {
                Surface(
                    modifier = Modifier
                        .clickable { }
                        .height(ukuran)
                        .fillMaxWidth(),
                    color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .clickable { perpindahan }
                        .height(94.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(13.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(painter = painterResource(id = gambar3[2]), contentDescription = "")
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = judul3[2], fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Text(text = isi3[2], fontSize = 9.sp)
                        }
                    }
                }
            }
            //////-------------------////////////////----
            Spacer(modifier = Modifier.size(9.dp))
            Box {
                Surface(
                    modifier = Modifier
                        .clickable { }
                        .height(ukuran)
                        .fillMaxWidth(),
                    color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .clickable { perpindahan }
                        .height(94.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(13.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(painter = painterResource(id = gambar3[3]), contentDescription = "")
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = judul3[3], fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Text(text = isi3[3], fontSize = 9.sp)
                        }
                    }
                }
            }
            //////-------------------////////////////----
            Spacer(modifier = Modifier.size(9.dp))
            Box {
                Surface(
                    modifier = Modifier
                        .clickable { }
                        .height(ukuran)
                        .fillMaxWidth(),
                    color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                }
                Surface(
                    modifier = Modifier
                        .clickable { perpindahan }
                        .height(94.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, color = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(13.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(painter = painterResource(id = gambar3[4]), contentDescription = "")
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = judul3[4], fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Text(text = isi3[4], fontSize = 9.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    Onboardingke3()
}