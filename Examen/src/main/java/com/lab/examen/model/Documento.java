package com.lab.examen.model;

/**
 * Created by Peggy on 21/05/2016.
 */
public class Documento {
    private String tipo;
    private long valor;

    public Documento(String tipo, long valor){
        this.tipo=tipo;
        this.valor=valor;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public Long getValor(){
        return valor;
    }


}
