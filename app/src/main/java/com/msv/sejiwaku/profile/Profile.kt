package com.msv.sejiwaku.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.msv.sejiwaku.R
import com.msv.sejiwaku.profile.component.ProfileCircularEdit

@Composable
fun Profile() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(100.dp))
        ProfileCircularEdit(
            profileurl = "",
            edit = R.drawable.editprofilefoto,
            onClickedit = {}
        )
    }
}