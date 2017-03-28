package com.mobileappscompany.training.daggerexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

/**
 * Created by User on 3/9/2017.
 */

public class PreferencesMagic {
    private static final String MY_SHARED_KEY = "MY_SHARED_KEY";
    private static final String MY_DEFAULT_VALUE = "MY_DEFAULT_VALUE";
    private Context context;

    public PreferencesMagic(Context context) {
        this.context = context;
    }

    public void saveMagic(String data) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(MY_SHARED_KEY, data);
        editor.apply();
    }

    public String loadMagic() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(MY_SHARED_KEY, MY_DEFAULT_VALUE);
    }
}
