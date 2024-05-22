package com.msv.sejiwaku.homepage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R

@Composable
fun JournalScreen() {
    Scaffold(
        topBar = {

        },
        bottomBar = {

        }
    ) {contentPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.size(69.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.padding(contentPadding),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        modifier = Modifier
                            .height(58.dp)
                            .width(317.dp),
                        border = BorderStroke(1.5.dp, Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Row {

                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.journallanjut),
                                    contentDescription = null,
                                    modifier = Modifier.size(27.dp)
                                )
                            }
                            Spacer(modifier = Modifier.size(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Lihat Riwayat Jurnal", fontSize = 9.sp)
                                Text(text = "Daftar jurnal yang telah selesai kamu tulis", fontSize = 7.sp)
                            }
                            Spacer(modifier = Modifier.size(58.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(painter = painterResource(id = R.drawable.journalwaktu), contentDescription = null, modifier = Modifier.size(23.dp))
                            }
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.size(15.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.padding(contentPadding),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        modifier = Modifier
                            .height(108.dp)
                            .width(317.dp),
                        border = BorderStroke(3.dp, Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Row {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp, bottom = 13.dp),
                                verticalArrangement = Arrangement.Bottom
                            ) {
                                Text(text = "My Daily Jurnal", fontSize = 12.sp)
                            }
                            Spacer(modifier = Modifier.size(57.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.journalgambar),
                                    contentDescription = null,
                                    modifier = Modifier.size(122.dp)
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(21.dp))
            Column(
                modifier = Modifier.padding(start = 35.dp)
            ) {
                Text(text = "Lanjutkan Jurnalmu", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = "Jangan lupakan jurnalmu ya, karena jurnal ini adalah curahan hatimu", fontSize = 9.sp)
            }
            Spacer(modifier = Modifier.size(12.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(start = 33.dp),

                ) {
                    Surface(
                        modifier = Modifier
                            .height(126.dp)
                            .width(148.dp),
                        border = BorderStroke(2.dp, Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Column {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 20.dp, bottom = 10.dp),
                            ) {
                                Image(painter = painterResource(id = R.drawable.journalgambardua), contentDescription = null, modifier = Modifier
                                    .size(89.dp)
                                    .padding())
                                Text(text = "Aku Bukanlah  Pecund....", fontSize = 12.sp)
                            }

                        }
                    }
                    Column(
                        modifier= Modifier
                            .fillMaxWidth()
                            .padding(top = 110.dp, end = 30.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.End
                    ) {
                        Row {
                            Text(text = "Lihat Semua Disini", color = Color(
                                red = 0.2f,
                                green = 0.725f,
                                blue = 0.675f,
                                alpha = 1.0f
                            ), fontSize = 9.sp)
                            Spacer(modifier = Modifier.size(3.dp))
                            Image(painter = painterResource(id = R.drawable.journallanjutdua), contentDescription = null, modifier = Modifier.size(18.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(9.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .background(
                        Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                    )
            ) {
            }
            Spacer(modifier = Modifier.size(30.dp))
            Column(
                modifier = Modifier.padding(start = 35.dp)
            ) {
                Text(text = "Topik Jurnal dari  SejiwaKu", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = "Pilih salah satu jurnal dan mulai menulis segala isi hatimu", fontSize = 9.sp)
            }
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.padding(contentPadding),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        modifier = Modifier
                            .height(58.dp)
                            .width(317.dp),
                        border = BorderStroke(1.5.dp, Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Row {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Kenali Dirimu Dengan Baik", fontSize = 9.sp)
                                Text(text = "Curahkan segala perasaan yang ada dalam dirimu", fontSize = 7.sp)
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.padding(contentPadding),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        modifier = Modifier
                            .height(58.dp)
                            .width(317.dp),
                        border = BorderStroke(1.5.dp, Color(
                            red = 0.2f,
                            green = 0.725f,
                            blue = 0.675f,
                            alpha = 1.0f
                        )
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Row {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 17.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Ketahui potensi dirimu", fontSize = 9.sp)
                                Text(text = "Akan selalu ada jalan untuk dirimu, jangan pernah takut untuk mengetahui potensimu", fontSize = 7.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewJournal() {
    JournalScreen()
}