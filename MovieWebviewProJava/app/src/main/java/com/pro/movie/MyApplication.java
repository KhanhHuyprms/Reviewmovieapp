package com.pro.movie;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pro.movie.prefs.DataStoreManager;

public class MyApplication extends Application {

    private static final String FIREBASE_URL = "https://phimnew-default-rtdb.firebaseio.com/";
    private FirebaseDatabase mFirebaseDatabase;

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        mFirebaseDatabase = FirebaseDatabase.getInstance(FIREBASE_URL);
        DataStoreManager.init(getApplicationContext());
    }

    public DatabaseReference getMovieDatabaseReference() {
        return mFirebaseDatabase.getReference("movie");
    }

    public DatabaseReference getMovieDetailDatabaseReference(int id) {
        return mFirebaseDatabase.getReference("movie/" + id);
    }
}
