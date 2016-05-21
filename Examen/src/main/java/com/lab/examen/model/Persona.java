package com.lab.examen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peggy on 21/05/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String pais;
    private Documento documento;
    private String organizacion;
    private List<String> emails=new ArrayList<String>();
    private List<Integer> telefonos=new ArrayList<Integer>();

    public Persona(String nombre, String apellido, String pais, Documento documento, String organizacion, List emails, List telefonos){
        this.nombre=nombre;
        this.apellido=apellido;
        this.pais=pais;
        this.documento=documento;
        this.organizacion=organizacion;
        this.emails=emails;
        this.telefonos=telefonos;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getPais(){ return pais; }

    public void setPais(String pais) { this.pais=pais; }

    public Documento getDocumento(){ return documento; }

    public void setDocumento(Documento documento) { this.documento=documento; }

    public String getOrganizacion(){ return organizacion; }

    public void setOrganizacion(String organizacion) { this.organizacion=organizacion; }

    public List getEmails(){
        return emails;
    }

    public void setEmails(List nombre){
        this.emails=emails;
    }

    public List getTelefonos(){
        return telefonos;
    }

    public void setTelefonos(List telefonos){
        this.telefonos=telefonos;
    }
}
