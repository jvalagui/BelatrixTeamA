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

    public void crear(Cliente cl){
        lista.add(cl);
    }

    public static List<Cliente> indice(){
        return lista;
    }

    public Cliente read(String id){
        Cliente cliente=null;
        for(Cliente clienteItem : lista){
            if(clienteItem.getId()==id){
                cliente=clienteItem;
                System.out.println("Cliente encontrado");
            }
        }
        return cliente;
    }

    public void update(String id, int estado){
        for(Cliente clienteItem : lista){
            if(clienteItem.getId()==id){
                this.estado=estado;
            }
        }
        System.out.println("Estado actualizado");
    }


    public void delete(String id){
        for(Cliente cliente : lista){
            if(cliente.getId()==id){
                lista.remove(cliente);
            }
        }
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado=estado;
    }
}
