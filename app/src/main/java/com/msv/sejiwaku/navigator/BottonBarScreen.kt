package com.msv.sejiwaku.navigator

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.msv.sejiwaku.R

sealed class BottonBarScreen(
    val route:String,
    val gambar:Int
) {
    object Home :BottonBarScreen(
        route ="HOME",
        gambar = R.drawable.bottonbarhome
    )
    object Konseling :BottonBarScreen(
        route = "KONSELING",
        gambar = R.drawable.bottonbarkonseling
    )
    object DetailKonseling : BottonBarScreen(
        route = "DetailKonseling",
        1
    )
    object Journal : BottonBarScreen(
        route = "JOURNAL",
        gambar = R.drawable.bottonbarjurnal
    )
    object Journey :BottonBarScreen(
        route = "JOURNEY",
        gambar = R.drawable.bottonbarjourney
    )
    object Detail :BottonBarScreen(
        route = "DETAIL",
        gambar = 1
    )
    object DetailMenerimaDiript1 : BottonBarScreen(
        route = "DetailMenerimaDiript1",
        5
    )
    object DetailHirupNapasPerlahan : BottonBarScreen(
        route = "DetailHirupNapasPerlahan",
        1
    )
    object DetailMenerimaDiriScreenDua : BottonBarScreen(
        route = "DetailMenerimaDiriScreenDua",
        1
    )
    object DetailMenerimaDiriScreenTiga : BottonBarScreen(
        route = "DetailMenerimaDiriScreenTiga",
        1
    )

    object DetailDengarkanMusikTenang : BottonBarScreen(
        route = "DetailDengarkanMusikTenang",
        1
    )
    object DetailMusikSatu : BottonBarScreen(
        route = "DetailMusikSatu",
        1
    )
    object DetailKamuPastiBisaSatu : BottonBarScreen(
        route = "DetailKamuPastiBisaSatu",
        1
    )
    object DetailKamuPastiBisaDua : BottonBarScreen(
        route = "DetailKamuPastiBisaDu",
        1
    )
    object DetailKamuPastiBisaTiga : BottonBarScreen(
        route = "DetailKamuPastiBisaTiga",
        1
    )
    object DetailPereganganOtot : BottonBarScreen(
        route = "DetailPereganganOtot",
        1
    )
    object DetailCurhatPadaDiriSendiri : BottonBarScreen(
        route = "DetailCurhatPadaDiriSendiri",
        1
    )
    object DetailMusikDua : BottonBarScreen(
        route = "DetailMusikDua",
        1
    )
    object JournalScreen1 : BottonBarScreen(
        route = "JournalScreen1",
        1
    )
    object JournalScreen2 : BottonBarScreen(
        route = "JournalScreen2",
        1
    )
    object JournalScreen3 : BottonBarScreen(
        route = "JournalScreen3",
        1
    )
    object Screen4 : BottonBarScreen(
        route = "Screen4",
        1
    )
    object Screen5 : BottonBarScreen(
        route = "Screen5",
        1
    )
    object Screen6 : BottonBarScreen(
        route = "Screen6",
        1
    )

}

