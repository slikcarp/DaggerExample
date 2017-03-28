package com.mobileappscompany.training.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

import static com.mobileappscompany.training.daggerexample.R.id.editText;

public class MainActivity extends AppCompatActivity {

    @Inject
    PreferencesMagic preferencesMagic;
    private EditText editTextEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEd = (EditText) findViewById(editText);

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

    }

    public void saveMagic(View view) {
        preferencesMagic.saveMagic(editTextEd.getText().toString());
    }

    public void loadMagic(View view) {
        editTextEd.setText(preferencesMagic.loadMagic());
    }
}
