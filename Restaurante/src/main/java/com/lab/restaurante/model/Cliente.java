package com.lab.restaurante.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIK on 5/13/2016.
 */
public class Cliente extends Persona{
    private int estado;
    private static List<Cliente> lista=new ArrayList<Cliente>();

    public Cliente(String nombre, String apellido, String id, int estado){
        super(nombre,apellido,id);
        this.estado=estado;
    }

    public void crear(Cliente cliente){
        lista.add(cliente);
    }

    public static List<Cliente> indice(){
        return lista;
    }

    public void read(String id){
        Cliente clienteEncontrado=null;
        for(Cliente clienteItem : lista){
            if(clienteItem.getId()==id){
                clienteEncontrado=clienteItem;
                System.out.println("Mesero encontrado");
                System.out.println("Nombre: "+clienteEncontrado.getNombre());
                System.out.println("Apellido: "+clienteEncontrado.getApellido());
                System.out.println("ID: "+clienteEncontrado.getId());
                System.out.println("Estado: "+clienteEncontrado.getEstado());
            }
            else{
                System.out.println("Cliente no encontrado");
            }
        }
    }

    public void update(int estado) { this.estado=estado; }


    public void delete(Cliente cliente){
        lista.remove(cliente);
        }

    public Cliente buscar(String id){
        Cliente clienteEncontrado=null;
        for(Cliente clienteItem : lista){
            if(clienteItem.getId()==id){
                clienteEncontrado=clienteItem;
            }
        }
        return clienteEncontrado;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado=estado;
    }
}
