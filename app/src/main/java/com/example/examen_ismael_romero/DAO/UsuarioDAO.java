package com.example.examen_ismael_romero.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.examen_ismael_romero.Model.Usuari;

import java.util.List;

@Dao
public interface UsuarioDAO {

    @Query("SELECT * FROM usuaris_app")
    List<Usuari> getAll();

    @Query("SELECT * FROM usuaris_app where edad>18")
    List<Usuari> mayoresDeEdad();


    @Query("SELECT * FROM usuaris_app WHERE apellido LIKE :buscar ")
    public List<Usuari> buscarapellido(String buscar);

    @Insert
    void addUsuari(Usuari usuari);

    @Update
    public void updateUsers(Usuari usuari);

    @Delete
    public  void deleteUsers(Usuari usuari);




}
