package com.lab.restaurante.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIK on 5/13/2016.
 */
public class Cliente extends Persona{
    private int estado;
    private static List<Cliente> lista=new ArrayList<>();

    public Cliente(String nom, String apell, String id, int est){
        super(nom,apell,id);
        this.estado=est;
    }

    public void crear(Cliente cl){
        lista.add(cl);
    }

    public static List<Cliente> indice(){
        return lista;
    }

    public Cliente read(String id){
        Cliente c=null;
        for(Cliente d : indice()){
            if(d.getId()==id){
                c=d;
                System.out.println("Cliente encontrado");
            }
        }
        return c;
    }

    public void update(String id){

    }

    public void delete(String id){
        for(Cliente d : indice()){
            if(d.getId()==id){
                indice().remove(d);
            }
        }
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int est){
        this.estado=est;
    }
}
