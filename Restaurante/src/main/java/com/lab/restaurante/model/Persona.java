package com.lab.restaurante.model;

/**
 * Created by NIK on 5/9/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String id;

    public Persona(){}

    public Persona(String nom, String apell, String ID){
        this.nombre=nom;
        this.apellido=apell;
        this.id=ID;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nom){
        this.nombre=nom;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apell){
        this.apellido=apell;
    }

    public String getId(){
        return id;
    }

    public void setId(String ID){
        this.id=ID;
    }
}
