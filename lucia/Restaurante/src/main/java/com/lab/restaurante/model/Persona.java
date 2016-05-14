package com.lab.restaurante.model;

/**
 * Created by NIK on 5/9/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String id;

    public Persona(){}

    public Persona(String nombre, String apellido, String id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }
}
