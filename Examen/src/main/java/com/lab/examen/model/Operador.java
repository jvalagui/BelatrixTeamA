package com.lab.examen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peggy on 21/05/2016.
 */
public class Operador {
    private String id;
    private String nombre;
    private List<Integer> listaTelefonos=new ArrayList<Integer>();

    public Operador(String id, String nombre, List listaTelefonos){
        this.id=id;
        this.nombre=nombre;
        this.listaTelefonos=listaTelefonos;
    }

    public boolean validarTelefono(int telefono){
        String cifras=Integer.toString(telefono);
        if(cifras.length()==7){
            return true;
        }
        else return false;
    }

    public int buscarTelefono(int telefono){
        int indice=0;
        int telefonoEncontrado=0000000;
        if(validarTelefono(telefono)){
            for(Integer telefonoItem : listaTelefonos){
                if(telefonoItem==listaTelefonos.get(indice)){
                    telefonoEncontrado=telefonoItem;
                }
                else indice++;
            }
        }else System.out.println("Telefono inválido o no encontrado");
        return telefonoEncontrado;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getNombre(){ return nombre; }

    public void setNombre(String nombre) { this.nombre=nombre; }

    public List getListaTelefonos(){
        return listaTelefonos;
    }

    public void setlistaTelefonos(List listaTelefonos){
        this.listaTelefonos=listaTelefonos;
    }



}
