package com.example.motivation.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    //informacoes confidenciais, impossiveis de serem acessadas, como email e senha
    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, str: String) {
        security.edit().putString("key", str).apply()
    }

    fun getString(key: String): String {
        return security.getString(key, "")?:""
    }
}