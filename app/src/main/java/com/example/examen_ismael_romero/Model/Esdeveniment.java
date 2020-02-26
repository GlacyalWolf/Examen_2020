package com.example.examen_ismael_romero.Model;

import java.sql.Date;

public class Esdeveniment {
    private Date fecha;
    private String localicacion;
    private String nombreEsdeveniment;

    public Esdeveniment(Date fecha, String localicacion, String nombreEsdeveniment) {
        this.fecha = fecha;
        this.localicacion = localicacion;
        this.nombreEsdeveniment = nombreEsdeveniment;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLocalicacion() {
        return localicacion;
    }

    public String getNombreEsdeveniment() {
        return nombreEsdeveniment;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setLocalicacion(String localicacion) {
        this.localicacion = localicacion;
    }

    public void setNombreEsdeveniment(String nombreEsdeveniment) {
        this.nombreEsdeveniment = nombreEsdeveniment;
    }
}
