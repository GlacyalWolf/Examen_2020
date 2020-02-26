package com.example.examen_ismael_romero.View;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.examen_ismael_romero.R;
import com.example.examen_ismael_romero.ViewModel.DetallLlistaEsdevenimentsViewModel;

public class DetallLlistaEsdeveniments extends Fragment {

    private DetallLlistaEsdevenimentsViewModel mViewModel;

    public static DetallLlistaEsdeveniments newInstance() {
        return new DetallLlistaEsdeveniments();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detall_llista_esdeveniments_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DetallLlistaEsdevenimentsViewModel.class);
        // TODO: Use the ViewModel
    }

}
