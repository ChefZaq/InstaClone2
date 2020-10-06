package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fxtHpEnC6yfvia11BJQJHET4E8MLZxWOd7I5BKOh")
                .clientKey("t7XEGrkY9DprbNwiCi7xK1R2AklkiOK8qAaDEino")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
