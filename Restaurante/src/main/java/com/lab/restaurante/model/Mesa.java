package com.lab.restaurante.model;

/**
 * Created by NIK on 5/9/2016.
 */
public class Mesa {
    private int id;
    private int estado;

    public Mesa(){}

    public Mesa(int ID, int est){
        this.id=ID;
        this.estado=est;
    }

    public int getId(){
        return id;
    }

    public void setId(int ID){
        this.id=ID;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int est){
        this.estado=est;
    }
}
