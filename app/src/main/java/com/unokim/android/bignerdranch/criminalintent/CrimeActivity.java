package com.unokim.android.bignerdranch.criminalintent;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends Activity {

    private static final String TAG = Constant.TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "CrimeActivity.onCreate()");
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "CrimeActivity.onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "CrimeActivity.onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "CrimeActivity.onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "CrimeActivity.onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "CrimeActivity.onStop()");
    }
}
