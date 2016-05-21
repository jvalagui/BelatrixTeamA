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

    public void crear(Mesero mesero){
        lista.add(mesero);
    }

    public void read(String id){
        Mesero meseroEncontrado=null;
        for(Mesero meseroItem : lista){
            if(meseroItem.getId()==id){
                meseroEncontrado=meseroItem;
                System.out.println("Mesero encontrado");
                System.out.println("Nombre: "+meseroEncontrado.getNombre());
                System.out.println("Apellido: "+meseroEncontrado.getApellido());
                System.out.println("ID: "+meseroEncontrado.getId());
                System.out.println("DNI: "+meseroEncontrado.getDni());
            }
            else{
                System.out.println("Mesero no encontrado");
            }
        }
    }

    public void update(long dni) { this.dni=dni; }


    public void delete(Mesero mesero){
        lista.remove(mesero);
    }

    public Mesero buscar(String id){
        Mesero meseroEncontrado=null;
        for(Mesero meseroItem : lista){
            if(meseroItem.getId()==id){
                meseroEncontrado=meseroItem;
            }
        }
        return meseroEncontrado;
    }

    public long getDni(){
        return dni;
    }

    public void setDni(long dni){
        this.dni=dni;
    }

}
