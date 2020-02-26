package com.example.examen_ismael_romero.ViewModel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_ismael_romero.Model.Esdeveniment;
import com.example.examen_ismael_romero.R;

import java.util.List;

public class LlistaEsdevenimentsViewModel extends RecyclerView.Adapter<LlistaEsdevenimentsViewModel.AdapterLlistaEsdevenimentsViewModel> {
    static List<Esdeveniment> esdeveniment;

    public LlistaEsdevenimentsViewModel(List esdeveniment){
        this.esdeveniment=esdeveniment;
    }


    public static class AdapterLlistaEsdevenimentsViewModel extends RecyclerView.ViewHolder{
        TextView nom,fecha,localizacion;
        public AdapterLlistaEsdevenimentsViewModel(@NonNull View itemView) {
            super(itemView);
            nom= itemView.findViewById(R.id.nombreEvento);
            fecha = itemView.findViewById(R.id.fecha);
            localizacion = itemView.findViewById(R.id.lugar);
        }
    }

    @NonNull
    @Override
    public AdapterLlistaEsdevenimentsViewModel onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.llista_esdeveniments_card,parent,false);
        AdapterLlistaEsdevenimentsViewModel apr = new AdapterLlistaEsdevenimentsViewModel(v);
        return apr;

    }

    @NonNull


    @Override
    public void onBindViewHolder(@NonNull AdapterLlistaEsdevenimentsViewModel holder, int position) {
        holder.localizacion.setText(esdeveniment.get(position).getLocalicacion());
        holder.fecha.setText(esdeveniment.get(position).getFecha().toString());
        holder.nom.setText(esdeveniment.get(position).getNombreEsdeveniment());


    }


    @Override
    public int getItemCount() {
        return esdeveniment.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView rv){
        super.onAttachedToRecyclerView(rv);
    }



}
