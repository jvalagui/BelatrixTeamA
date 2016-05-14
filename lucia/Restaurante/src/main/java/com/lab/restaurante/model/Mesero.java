package com.lab.restaurante.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIK on 5/13/2016.
 */
public class Mesero extends Persona {
    private long dni;
    private static List<Mesero> lista=new ArrayList<Mesero>();// se agrega Mesero en ArrayList

    public Mesero(String nombre, String apellido, String id, long dni){//se cambia DNI por dni, nombre, apellido
        super(nombre,apellido,id);
        this.dni=dni;
    }

    public void crear(Mesero ms){
        lista.add(ms);
    }

    public static List<Mesero> indice(){
        return lista;
    }

    public Mesero read(String id){
        Mesero mesero=null;
        for(Mesero meseroItem : lista){
            if(meseroItem.getId()==id){
                mesero=meseroItem;
                System.out.println("Mesero encontrado");
            }
        }
        return mesero;
    }

    public void update(String id, long dni){
        for(Mesero meseroItem : lista){
            if(meseroItem.getId()==id){
                this.dni=dni;
            }
        }
        System.out.println("Mesero actualizado");
    }

    public void delete(String id){
        for(Mesero mesero : lista){
            if(mesero.getId()==id){
                lista.remove(mesero);
            }
        }
    }

    public long getDni(){
        return dni;
    }

    public void setDni(long DNI){
        this.dni=DNI;
    }

}
