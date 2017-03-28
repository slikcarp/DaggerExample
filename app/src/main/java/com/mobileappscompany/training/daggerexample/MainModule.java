package com.mobileappscompany.training.daggerexample;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 3/9/2017.
 */

@Module
public class MainModule {

    private Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    public PreferencesMagic providePreferencesMagic() {
        return new PreferencesMagic(context);
    }
}
