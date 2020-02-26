package com.example.examen_ismael_romero;

import android.content.Context;

import com.example.examen_ismael_romero.DAO.Connection;
import com.example.examen_ismael_romero.DAO.UsuarioDAO;
import com.example.examen_ismael_romero.Model.Usuari;

import java.util.List;

public class Room {

    static Usuari u1= new Usuari(0,"jose","fernandez","qweqweqwe",123321123,14);
    static Usuari u2= new Usuari(0,"fernando","fernandez","qweqweqwe",123321123,14);
    static Usuari u3= new Usuari(0,"pepe","fernandez","qweqweqwe",123321123,14);
    static Usuari u4= new Usuari(0,"alfonso","fernandez","qweqweqwe",123321123,19);
    static Usuari u5= new Usuari(0,"pepito","fernandez","qweqweqwe",123321123,14);

    public static void crearUsuarios( Context c){


        Connection con = Connection.getConnection(c);

        con.UsuatiosDAO().addUsuari(u1);
        con.UsuatiosDAO().addUsuari(u2);
        con.UsuatiosDAO().addUsuari(u3);
        con.UsuatiosDAO().addUsuari(u4);
        con.UsuatiosDAO().addUsuari(u5);


        con.destroyConnection();
        con.close();
    }

    public static void borrar(Context c){
        Connection con = Connection.getConnection(c);

        con.UsuatiosDAO().deleteUsers(u1);

        con.destroyConnection();
        con.close();
    }

    public static List<Usuari> recojer(Context c){
        List<Usuari> listaUsuaris;
        Connection con = Connection.getConnection(c);

        listaUsuaris=con.UsuatiosDAO().getAll();


        con.destroyConnection();
        con.close();
        return listaUsuaris;
    }

    public static List<Usuari> mayores(Context c){
        List<Usuari> listaUsuaris;
        Connection con = Connection.getConnection(c);

        listaUsuaris=con.UsuatiosDAO().mayoresDeEdad();


        con.destroyConnection();
        con.close();
        return listaUsuaris;
    }

    public static void modif(Context c){
        Connection con = Connection.getConnection(c);
        u2.setNombreUsuarios("fernando");
        con.UsuatiosDAO().updateUsers(u2);

        con.destroyConnection();
        con.close();

    }

    public static List<Usuari> consulta_con_variable(Context c,String apellido){
        List<Usuari> listaUsuaris;
        Connection con = Connection.getConnection(c);

        listaUsuaris=con.UsuatiosDAO().buscarapellido(apellido);


        con.destroyConnection();
        con.close();
        return listaUsuaris;
    }




}
