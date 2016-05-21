package com.lab.examen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peggy on 21/05/2016.
 */
public class Organizacion {
    private String nombre;
    private String id;
    private List<Persona> listaPersonas=new ArrayList<Persona>();
    private List<Operador> listaOperadores=new ArrayList<Operador>();

    public Organizacion(String nombre, String id, List listaPersonas, List listaOperadores){
        this.nombre=nombre;
        this.id=id;
        this.listaOperadores=listaOperadores;
        this.listaPersonas=listaPersonas;
    }

    public Operador buscarOperador(int telefono){
        Operador operadorEncontrado=null;
        for(Operador operadorItem : listaOperadores){
            if(operadorItem.getId()==id){
                operadorEncontrado=operadorItem;
            }
        }
        return operadorEncontrado;
    }

    /*public Persona buscarPersona(Documento documento){

    }*/

    public String getNombre(){ return nombre; }

    public void setNombre(String nombre) { this.nombre=nombre; }

    public String getId(){ return id; }

    public void setId(String id) { this.id=id; }

    public List getListaPersonas(){
        return listaPersonas;
    }

    public void setListaPersonas(List listaPersonas){
        this.listaPersonas=listaPersonas;
    }

    public List getListOperadores(){
        return listaOperadores;
    }

    public void setListaOperadores(List listaOperadores){
        this.listaOperadores=listaOperadores;
    }

}
