package com.msv.sejiwaku.sda.logindata

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.msv.sejiwaku.sda.logindata.PreferencesKey.STATUS_UI_KEY_FREEDANLOGIN
import com.msv.sejiwaku.sda.logindata.PreferencesKey.STATUS_UI_KEY_JOURNEYDUA
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DataStoreAkunFreedanPremium(private val context: Context) {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("StatusUIakunfreedanpremium")
    }
    val getStatusUifreedanpremium: Flow<Boolean> = context.dataStore.data.map { preferences ->
        preferences[STATUS_UI_KEY_FREEDANLOGIN] ?: false
    }


    suspend fun saveStatus(isLogin: Boolean) = context.dataStore.edit { preferences ->
        preferences[STATUS_UI_KEY_FREEDANLOGIN] = isLogin
    }

    suspend fun clearStatus() = context.dataStore.edit { preferences ->
        preferences.remove(STATUS_UI_KEY_FREEDANLOGIN)
    }
}