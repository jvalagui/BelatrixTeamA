package com.lab.restaurante.model;

/**
 * Created by NIK on 5/9/2016.
 */
public class Mesa {
    private int id;
    private int estado;

    public Mesa(){}

    public Mesa(int id, int estado){
        this.id=id;
        this.estado=estado;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado=estado;
    }
}
