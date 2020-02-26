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
import com.example.examen_ismael_romero.ViewModel.LlistaEsdevenimentsViewModel;

public class LlistaEsdevenimentsFragment extends Fragment {

    private LlistaEsdevenimentsViewModel mViewModel;

    public static LlistaEsdevenimentsFragment newInstance() {
        return new LlistaEsdevenimentsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.llista_esdeveniments_fragment, container, false);
    }



}
