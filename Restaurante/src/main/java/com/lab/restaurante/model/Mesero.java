package com.lab.restaurante.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIK on 5/13/2016.
 */
public class Mesero extends Persona {
    private long dni;
    private static List<Mesero> lista=new ArrayList<>();

    public Mesero(String nom, String apell, String id, long DNI){
        super(nom,apell,id);
        this.dni=DNI;
    }

    public void crear(Mesero ms){
        lista.add(ms);
    }

    public static List<Mesero> indice(){
        return lista;
    }

    public Mesero read(String id){
        Mesero m=null;
        for(Mesero p : indice()){
            if(p.getId()==id){
                m=p;
                System.out.println("Mesero encontrado");
            }
        }
        return m;
    }

    public void update(String id){
        Mesero m=null;
        for(Mesero p : indice()){
            if(p.getId()==id){
                m=p;
            }
        }
        m.setDni(DNI);
        System.out.println("Mesero actualizado");
    }

    public void delete(String id){
        for(Mesero p : indice()){
            if(p.getId()==id){
                indice().remove(p);
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
