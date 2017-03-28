package com.mobileappscompany.training.daggerexample;

import dagger.Component;

/**
 * Created by User on 3/9/2017.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
