package com.msv.sejiwaku.loginpage.logindata

import androidx.datastore.preferences.core.booleanPreferencesKey

object PreferencesKey {
    const val NAME_PREF = "login_preferences"
    const val NAME_KEY = "name"
    const val PASSWORD_KEY = "password"
    const val NAMA_LENGKAP = "namalengkap"

    val STATUS_LOGIN_KEY = booleanPreferencesKey("status_login")
}