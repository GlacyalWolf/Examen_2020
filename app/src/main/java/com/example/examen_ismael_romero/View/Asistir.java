package com.example.examen_ismael_romero.View;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.examen_ismael_romero.ViewModel.AsistirViewModel;
import com.example.examen_ismael_romero.R;

public class Asistir extends Fragment {

    private AsistirViewModel mViewModel;

    public static Asistir newInstance() {
        return new Asistir();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.asistir_fragment, container, false);
    }


}
