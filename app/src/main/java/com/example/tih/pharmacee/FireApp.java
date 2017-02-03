package com.example.tih.pharmacee;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by TIH on 1/30/2017.
 */
public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
