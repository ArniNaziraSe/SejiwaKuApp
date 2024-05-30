package com.msv.sejiwaku.bagianonboardingnya

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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.msv.sejiwaku.R
import com.msv.sejiwaku.navigator.BagianLoginDanTemannya
import com.msv.sejiwaku.navigator.Urutan
import com.msv.sejiwaku.ui.theme.inter

@Composable
fun OnboardingHasil(
    navController: NavController
) {
    val namafont = inter
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, top = 28.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hasil", fontFamily = namafont, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.size(5.dp))
            Image(
                painter = painterResource(id = R.drawable.bintang),
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
        }
        Spacer(modifier = Modifier.size(24.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.gambarhasilonboarding),
                contentDescription ="gambar onboarding",
                modifier = Modifier.size(width = 216.dp, height = 224.dp)
            )
        }
        Spacer(modifier = Modifier.size(17.dp))
        Column(
            modifier = Modifier.padding(start = 41.dp, end = 36.dp),
        ) {
            Text(text = "Kamu sepertinya membutuhkan sedikit", fontSize = 12.sp, fontFamily = namafont)
            Text(text = "semangat pagi. YUK! Keluar rumah dan.", fontSize = 12.sp, fontFamily = namafont)
            Text(text = "berjemur selama 5 menit agar kamu selalu", fontSize = 12.sp, fontFamily = namafont)
            Text(text = "semangat menjalani hari.", fontSize = 12.sp, fontFamily = namafont)
        }
        Spacer(modifier = Modifier.size(237.dp))
        Column(
            modifier = Modifier
                .padding(top = 14.dp,)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier.size(height = 54.dp, width = 295.dp),
                onClick = {
                    navController.navigate(Urutan.HOMEBAR) {
                    popUpTo(BagianLoginDanTemannya.HasilOnboarding.route) {
                        inclusive = false
                    }
                }
                          /*navController.navigate(Graph.ISI)*/
                          },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        red = 0.2f,
                        green = 0.725f,
                        blue = 0.675f,
                        alpha = 1.0f
                    ),
                )
            ) {
                Text(
                    text = "Finish",
                    fontFamily = namafont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        }
    }
}

//@Preview(showBackground = true)
@Composable
private fun PreviewOn() {
    OnboardingHasil(navController = rememberNavController())
}