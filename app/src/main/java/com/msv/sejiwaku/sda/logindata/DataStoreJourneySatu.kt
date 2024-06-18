package com.msv.sejiwaku.sda.logindata

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.msv.sejiwaku.sda.logindata.PreferencesKey.STATUS_UI_KEY_JOURNEYSATU
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DataStoreJourneySatu(private val context: Context) {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("StatusUIJourneysatu")
    }
    val getStatusUijourneysatu: Flow<Boolean> = context.dataStore.data.map { preferences ->
        preferences[STATUS_UI_KEY_JOURNEYSATU] ?: false
    }


    suspend fun saveStatus(isLogin: Boolean) = context.dataStore.edit { preferences ->
        preferences[STATUS_UI_KEY_JOURNEYSATU] = isLogin
    }

    suspend fun clearStatus() = context.dataStore.edit { preferences ->
        preferences.remove(STATUS_UI_KEY_JOURNEYSATU)
    }
}