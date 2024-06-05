package com.msv.sejiwaku.notifications

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.ui.theme.SejiwakuTheme

@Composable
fun notifikasi() {
    Surface {
        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Notifications",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(25.dp))
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.junery),
                            contentDescription = "daily riwayat"
                        )
                        Spacer(modifier = Modifier.width(40.dp))
                        Column {
                            Text(
                                text = "Apakah aku menjadi lebih baik",
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                    }
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.junery),
                            contentDescription = "daily riwayat"
                        )
                        Spacer(modifier = Modifier.width(40.dp))
                        Column {
                            Text(
                                text = "Apakah aku menjadi lebih baik",
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                    }
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.notif),
                            contentDescription = "daily riwayat"
                        )
                        Spacer(modifier = Modifier.width(40.dp))
                        Column {
                            Text(
                                text = "Apakah aku menjadi lebih baik",
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1,
                                modifier = Modifier.width(200.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(400.dp))
                Row(
                    modifier = Modifier.align(Alignment.Start)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ArrowBackIosNew, contentDescription = "kembali")
                    }
                    Text(text = "Kembali", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color(0xFF33B9AC),modifier = Modifier.padding(top = 15.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun notifikasiPreview() {
    SejiwakuTheme {
        notifikasi()
    }
}