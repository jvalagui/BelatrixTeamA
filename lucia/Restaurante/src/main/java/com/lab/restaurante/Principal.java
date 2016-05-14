package com.lab.restaurante;

import com.lab.restaurante.constantes.Estados;
import com.lab.restaurante.model.Cliente;
import com.lab.restaurante.model.Mesa;
import com.lab.restaurante.model.Mesero;

import javax.swing.*;

/**
 * Created by NIK on 5/9/2016.
 */
public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Bruce", "Whane", "1", Estados.EN_ESPERA);
        Cliente cliente2 = new Cliente("Clark", "Kent", "2", Estados.EN_ESPERA);
        Mesero mesero1 = new Mesero("Barrey", "Allen", "3", 1234567);
        Mesero mesero2 = new Mesero("Lex","Luthor","4",123);
        Mesero mesero3 = new Mesero("Tony", "Stark", "5",1234);
        Mesa mesa1= new Mesa(01,Estados.OCUPADA);
        Mesa mesa2= new Mesa(02,Estados.DESOCUPADA);
        /* String nombre = JOptionPane.showInputDialog("Ingrese nombre de cliente");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido de cliente");
        String id = JOptionPane.showInputDialog("Ingrese id");
        int estado = Estados.EN_ESPERA; */
        //Cliente cliente3 = new Cliente(nombre,apellido,id,estado);
        /*if(mesa.getEstado() == Estados.DESOCUPADA){
            cliente1.setEstado(Estados.EN_MESA);
            cliente3.setEstado(Estados.EN_MESA);
        }else if(mesa.getEstado()==Estados.OCUPADA){
            cliente1.setEstado(Estados.EN_ESPERA);
            cliente3.setEstado(Estados.EN_ESPERA);
        }*/
        System.out.println("cliente ingresado : "+"\n Nombre: "+cliente1.getNombre()+ "\n Apellido: "
                +cliente1.getApellido()+"\n Id: "+cliente1.getId()+"\n Estado: "+cliente1.getEstado()+"\n");

        System.out.println("cliente ingresado : "+"\n Nombre: "+cliente2.getNombre()+ "\n Apellido: "
                +cliente2.getApellido()+"\n Id: "+cliente2.getId()+"\n Estado: "+cliente2.getEstado()+"\n");

        System.out.println("mesero ingresado : "+"\n Nombre: "+mesero1.getNombre()+ "\n Apellido: "
                +mesero1.getApellido()+"\n Id: "+mesero1.getId()+"\n Dni: "+mesero1.getDni()+"\n");

        System.out.println("mesero ingresado : "+"\n Nombre: "+mesero2.getNombre()+ "\n Apellido: "
                +mesero2.getApellido()+"\n Id: "+mesero2.getId()+"\n Dni: "+mesero2.getDni()+"\n");

        System.out.println("mesa : "+"\n  Mesa Id: "+mesa1.getId()+ "\n Estados: " +mesa1.getEstado());
        System.out.println("mesa : "+"\n  Mesa Id: "+mesa2.getId()+ "\n Estados: " +mesa2.getEstado());




    }
}
