package com.example.examen_ismael_romero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.examen_ismael_romero.View.LlistaEsdevenimentsFragment;

public class LlistaEsdeveniments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llista_esdeveniments_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LlistaEsdevenimentsFragment.newInstance())
                    .commitNow();
        }
    }
}
