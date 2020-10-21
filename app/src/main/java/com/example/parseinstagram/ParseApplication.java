package com.example.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // register your parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("lD4Zst2pZNJUiMOm3t861HxMEK8sjKrvcaLNbfuA")
                .clientKey("JIQaFiwIu0zf5w8okwEq0v8UNIz3VJrHS6yVz5ha")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
