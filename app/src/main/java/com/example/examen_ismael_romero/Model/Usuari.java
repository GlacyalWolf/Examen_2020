package com.example.examen_ismael_romero.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuaris_app")
public class Usuari {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "nombre")
    public String nombreUsuarios;

    @ColumnInfo(name = "apellido")
    public String apellidoUsuario;

    @ColumnInfo(name = "email")
    public String emailUsiario;

    @ColumnInfo(name = "telefono")
    public int telefonoUsuario;

    @ColumnInfo(name = "edad")
    public int edadUsuario;

    public Usuari(int id, String nombreUsuarios, String apellidoUsuario, String emailUsiario, int telefonoUsuario, int edadUsuario) {
        this.id = id;
        this.nombreUsuarios = nombreUsuarios;
        this.apellidoUsuario = apellidoUsuario;
        this.emailUsiario = emailUsiario;
        this.telefonoUsuario = telefonoUsuario;
        this.edadUsuario = edadUsuario;
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuarios() {
        return nombreUsuarios;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getEmailUsiario() {
        return emailUsiario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setNombreUsuarios(String nombreUsuarios) {
        this.nombreUsuarios = nombreUsuarios;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setEmailUsiario(String emailUsiario) {
        this.emailUsiario = emailUsiario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }
}
