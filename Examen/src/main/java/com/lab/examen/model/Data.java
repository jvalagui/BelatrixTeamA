package com.lab.examen.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peggy on 21/05/2016.
 */
public class Data {
    public static void CreacionDeData(){

        //Creacion de emails
        //***********Para la primera persona
        List<String> emails1=new ArrayList<String>();
        String email1="dsf@ajdfh.com";
        String email2="iuh@sdfij.com";
        emails1.add(email1);
        emails1.add(email2);

        //***********Para la segunda persona
        List<String> emails2=new ArrayList<String>();
        String email3="isuhdf@af.com";
        String email4="iygef@auhdf.com";
        emails2.add(email3);
        emails2.add(email4);

        //***********Para la tercera persona
        List<String> emails3=new ArrayList<String>();
        String email5="iuehfe@er.com";
        String email6="iuweyr@tuiydf.com";
        String email7="iuhiuh@ytuf.com";
        emails3.add(email5);
        emails3.add(email6);
        emails3.add(email7);

        //***********Para la cuarta persona
        List<String> emails4=new ArrayList<String>();
        String email8="sudhf@aoisd.com";
        String email9="qo8eyr@.com";
        emails4.add(email8);
        emails4.add(email9);

        //***********Para la quinta persona
        List<String> emails5=new ArrayList<String>();
        String email10="jhdsaf@sudhf.com";
        String email11="sdfadf@asf.com";
        emails5.add(email10);
        emails5.add(email11);

        //***********Para la sexta persona
        List<String> emails6=new ArrayList<String>();
        String email12="asd@gsdf.com";
        String email13="dhs@fghdfsg.com";
        emails5.add(email12);
        emails5.add(email13);



        //Creacion de telefonos
        //***********Para la primera persona
        List<Integer> telefonos1=new ArrayList<Integer>();
        int telefono1a=5234567;
        int telefono1b=6548975;
        int telefono1c=4852147;
        telefonos1.add(telefono1a);
        telefonos1.add(telefono1b);
        telefonos1.add(telefono1c);

        //***********Para la segunda persona
        List<Integer> telefonos2=new ArrayList<Integer>();
        int telefono2a=5942157;
        int telefono2b=6548712;
        telefonos2.add(telefono2a);
        telefonos2.add(telefono2b);

        //***********Para la tercera persona
        List<Integer> telefonos3=new ArrayList<Integer>();
        int telefono3a=5541245;
        int telefono3b=5469215;
        int telefono3c=4548754;
        telefonos3.add(telefono3a);
        telefonos3.add(telefono3b);
        telefonos3.add(telefono3c);

        //***********Para la cuarta persona
        List<Integer> telefonos4=new ArrayList<Integer>();
        int telefono4a=6547851;
        telefonos4.add(telefono4a);

        //***********Para la quinta persona
        List<Integer> telefonos5=new ArrayList<Integer>();
        int telefono5a=6854512;
        telefonos5.add(telefono5a);

        //***********Para la sexta persona
        List<Integer> telefonos6=new ArrayList<Integer>();
        int telefono6a=4548745;
        int telefono6b=4368468;
        telefonos6.add(telefono6a);
        telefonos6.add(telefono6b);


        //Creacion de Operadores
        List<Operador> operadores1=new ArrayList<Operador>();
        List<Integer> telefonosA=new ArrayList<Integer>();
        telefonosA.add(telefono1a);telefonosA.add(telefono2a);telefonosA.add(telefono3a);telefonosA.add(telefono3b);
        Operador operador1=new Operador("A001","Belmax",telefonosA);

        List<Operador> operadores2=new ArrayList<Operador>();
        List<Integer> telefonosB=new ArrayList<Integer>();
        telefonosA.add(telefono1b);telefonosA.add(telefono2b);telefonosA.add(telefono4a);telefonosA.add(telefono5a);
        Operador operador2=new Operador("A001","Belmax",telefonosA);

        List<Operador> operadores3=new ArrayList<Operador>();
        List<Integer> telefonosC=new ArrayList<Integer>();
        telefonosA.add(telefono1c);telefonosA.add(telefono3c);telefonosA.add(telefono6a);telefonosA.add(telefono6b);
        Operador operador3=new Operador("A001","Belmax",telefonosA);


        //Creacion de documentos
        Documento documento1=new Documento("dni", 4859521);
        Documento documento2=new Documento("dni", 4958745);
        Documento documento3=new Documento("pasaporte", 515598701);
        Documento documento4=new Documento("pasaporte", 698740130);
        Documento documento5=new Documento("carnet", 548740498);
        Documento documento6=new Documento("carnet", 168463518);


        //Creacion de Personas
        Persona persona1=new Persona("Pablo","Contreras","Peru",documento1,"Colpac", emails1, telefonos1);
        Persona persona2=new Persona("Marco","Rojas","Colombia",documento2,"Colpac", emails2, telefonos2);
        List<Persona> personas1=new ArrayList<Persona>();
        personas1.add(persona1);
        personas1.add(persona2);

        Persona persona3=new Persona("Monica","Torres","Ecuador",documento3,"Zoyerz", emails3, telefonos3);
        Persona persona4=new Persona("Jorge","Ochoa","Argentina",documento4,"Zoyerz", emails4, telefonos4);
        List<Persona> personas2=new ArrayList<Persona>();
        personas2.add(persona3);
        personas2.add(persona4);

        Persona persona5=new Persona("Sofia","Gutierrez","Brasil",documento5,"Zamtrix", emails5, telefonos5);
        Persona persona6=new Persona("Ana","Beltran","Uruguay",documento6,"Zamtrix", emails6, telefonos6);
        List<Persona> personas3=new ArrayList<Persona>();
        personas3.add(persona5);
        personas3.add(persona6);

        //Creacion de organizaciones
        Organizacion organizacion1=new Organizacion("Colpac","001",personas1,operadores1);
        Organizacion organizacion2=new Organizacion("Zoyerz","002",personas2,operadores2);
        Organizacion organizacion3=new Organizacion("Zamtrix","003",personas3,operadores3);


        //LISTADOS
        System.out.println("Listado de Organizaciones");
        System.out.println("ID: "+organizacion1.getId());
        System.out.println("Nombre: "+organizacion1.getNombre()+"\n");
        System.out.println("ID: "+organizacion2.getId());
        System.out.println("Nombre: "+organizacion2.getNombre()+"\n");
        System.out.println("ID: "+organizacion3.getId());
        System.out.println("Nombre: "+organizacion3.getNombre()+"\n");

        System.out.println("Listado de Personas");
        System.out.println(persona1.getNombre()+" "+persona1.getApellido()+" ");
        System.out.println("País: "+persona1.getPais());
        System.out.println("Documento "+documento1.getTipo()+"="+documento1.getValor());
        System.out.println("Organizacion: "+persona1.getOrganizacion()+"\n");

        System.out.println(persona2.getNombre()+" "+persona2.getApellido()+" ");
        System.out.println("País: "+persona2.getPais());
        System.out.println("Documento "+documento2.getTipo()+"="+documento1.getValor());
        System.out.println("Organizacion: "+persona2.getOrganizacion()+"\n");

        System.out.println(persona3.getNombre()+" "+persona3.getApellido()+" ");
        System.out.println("País: "+persona3.getPais());
        System.out.println("Documento "+documento3.getTipo()+"="+documento3.getValor());
        System.out.println("Organizacion: "+persona3.getOrganizacion()+"\n");

        System.out.println(persona4.getNombre()+" "+persona4.getApellido()+" ");
        System.out.println("País: "+persona4.getPais());
        System.out.println("Documento "+documento4.getTipo()+"="+documento4.getValor());
        System.out.println("Organizacion: "+persona4.getOrganizacion()+"\n");

        System.out.println(persona5.getNombre()+" "+persona5.getApellido()+" ");
        System.out.println("País: "+persona5.getPais());
        System.out.println("Documento "+documento5.getTipo()+"="+documento5.getValor());
        System.out.println("Organizacion: "+persona5.getOrganizacion()+"\n");

        System.out.println(persona6.getNombre()+" "+persona6.getApellido()+" ");
        System.out.println("País: "+persona6.getPais());
        System.out.println("Documento "+documento6.getTipo()+"="+documento6.getValor());
        System.out.println("Organizacion: "+persona6.getOrganizacion()+"\n");



    }

}
