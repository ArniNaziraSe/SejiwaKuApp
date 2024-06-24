package com.msv.sejiwaku.sda.logindata

import androidx.datastore.preferences.core.booleanPreferencesKey

object PreferencesKey {
    const val NAME_PREF = "login_preferences"
    const val NAME_KEY = "name"
    const val PASSWORD_KEY = "password"
    const val NAMA_LENGKAP = "namalengkap"

    val STATUS_UI_KEY_JOURNEYDUA = booleanPreferencesKey("status_journey_dua")
    val STATUS_UI_KEY_JOURNEYSATU = booleanPreferencesKey("status_journey_dua")
    val STATUS_UI_KEY_LOGIN = booleanPreferencesKey("status_login")
    val STATUS_UI_KEY_FREEDANLOGIN = booleanPreferencesKey("status_freedanlogin")
}