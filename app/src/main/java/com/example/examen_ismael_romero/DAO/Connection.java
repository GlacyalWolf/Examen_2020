package com.example.examen_ismael_romero.DAO;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.examen_ismael_romero.Model.Usuari;

@Database(entities = {Usuari.class},version = 1,exportSchema = false)
public abstract class Connection extends RoomDatabase {
    private static Connection INSTANCE;
    public abstract UsuarioDAO UsuatiosDAO();

    public static Connection getConnection(Context c){
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(c,Connection.class,"user.db").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
    public static void destroyConnection(){
        INSTANCE = null;
    }



}
