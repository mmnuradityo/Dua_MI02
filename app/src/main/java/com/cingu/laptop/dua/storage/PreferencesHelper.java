package com.cingu.laptop.dua.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {
    private SharedPreferences sharedPreferences;

    public PreferencesHelper(Context context) {
        sharedPreferences=context.getSharedPreferences("user", Context.MODE_PRIVATE);
    }

    public void setLogin(String login){
        sharedPreferences.edit()
                .putString("login",login)
                .apply();
    }

    public void setNama(String nama){
        sharedPreferences.edit()
                .putString("nama",nama)
                .apply();
    }

    public String getLogin(){
        return sharedPreferences.getString("login","false");
    }

}
