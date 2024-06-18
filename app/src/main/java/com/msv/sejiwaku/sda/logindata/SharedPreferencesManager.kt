package com.msv.sejiwaku.sda.logindata

import android.content.Context
import com.msv.sejiwaku.sda.logindata.PreferencesKey.NAMA_LENGKAP
import com.msv.sejiwaku.sda.logindata.PreferencesKey.NAME_KEY
import com.msv.sejiwaku.sda.logindata.PreferencesKey.NAME_PREF
import com.msv.sejiwaku.sda.logindata.PreferencesKey.PASSWORD_KEY

class SharedPreferencesManager(context: Context) {
    private val preferences = context.getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE)
    private val editor = preferences.edit()

    var emaillogin
        get() = preferences.getString(NAME_KEY, "")
        set(value) {
            editor.putString(NAME_KEY, value)
            editor.commit()
        }

    var passwordlogin
        get() = preferences.getString(PASSWORD_KEY, "")
        set(value) {
            editor.putString(PASSWORD_KEY, value)
            editor.commit()
        }

    var namalengkapregister
        get() = preferences.getString(NAMA_LENGKAP, "")
        set(value) {
            editor.putString(NAMA_LENGKAP, value)
            editor.commit()
        }

    fun clear() {
        editor.clear()
        editor.commit()
    }
}