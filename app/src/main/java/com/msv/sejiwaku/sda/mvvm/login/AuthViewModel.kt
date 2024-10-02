package com.msv.sejiwaku.sda.mvvm.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel : ViewModel() {
    private val auth : FirebaseAuth = FirebaseAuth.getInstance()
    private val _authState = MutableLiveData<AuthState>()
    val authState : LiveData<AuthState> = _authState

    init {
        checkAuthStatus()
    }

    fun checkAuthStatus(){
        if (auth.currentUser==null){
            _authState.value = AuthState.Unauthenticated
        } else {
            _authState.value = AuthState.Authenticated
        }
    }
    fun login(email:String,password:String){

        if (email.isEmpty() || password.isEmpty()){
            _authState.value = AuthState.Error("Email dan password masih kosong")
            return
        }

        _authState.value = AuthState.Loading
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener{taks ->
                if (taks.isSuccessful){
                    _authState.value = AuthState.Authenticated
                }else{
                    _authState.value = AuthState.Error(taks.exception?.message?:"Sepertinya ada yang kosong")
                }
            }
    }

    fun signup(email:String,password:String){

        if (email.isEmpty() || password.isEmpty()){
            _authState.value = AuthState.Error("Email dan password masih kosong")
            return
        }

        _authState.value = AuthState.Loading
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener{taks ->
                if (taks.isSuccessful){
                    _authState.value = AuthState.Authenticated
                }else{
                    _authState.value = AuthState.Error(taks.exception?.message?:"Sepertinya ada yang kosong")
                }
            }
    }

}

sealed class AuthState{
    object Authenticated : AuthState()
    object Unauthenticated : AuthState()
    object Loading : AuthState()
    data class Error(val messenger: String) : AuthState()
}