package com.msv.sejiwaku.chatPremium

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.msv.sejiwaku.R
import com.msv.sejiwaku.chatPremium.component.topbarChat
import com.msv.sejiwaku.chatPremium.component.tulisPesan
import com.msv.sejiwaku.chatPremium.data.ChatViewModel
import com.msv.sejiwaku.ui.theme.Hitam
import com.msv.sejiwaku.ui.theme.Tosca
import com.msv.sejiwaku.ui.theme.abu_abu

@Composable
fun Chat4() {
    val chatViewModel: ChatViewModel = viewModel()
    ChatRoomScreen(chatViewModel)
}

@Composable
fun ChatRoomScreen(chatViewModel: ChatViewModel) {
    val jumlahChat by chatViewModel.jumlahChat.collectAsState()
    val pesan by chatViewModel.pesan.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {
        // Background Image
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_saja),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(150.dp),
                contentScale = ContentScale.Crop,
                alpha = 0.1f
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            topbarChat()
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "${50 - jumlahChat}/50",
                color = Hitam,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.End)
            )
            Spacer(modifier = Modifier.weight(1f))
            pesan.forEach { pesanItem ->
                ChatBubble(pesanItem)
                Spacer(modifier = Modifier.height(8.dp))
            }
            Spacer(modifier = Modifier.height(8.dp))
            tulisPesan(chatViewModel::addPesan)
        }
    }
}

@Composable
fun ChatBubble(pesan: String) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        color = Tosca,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp)
    ) {
        Text(
            text = pesan,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChatRoomScreenPreview() {
    Chat4()
}
