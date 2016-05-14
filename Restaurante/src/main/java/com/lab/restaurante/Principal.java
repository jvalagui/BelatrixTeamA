package com.lab.restaurante;

import com.lab.restaurante.constantes.Estados;
import com.lab.restaurante.model.Cliente;
import com.lab.restaurante.model.Mesa;
import com.lab.restaurante.model.Mesero;

import java.util.Scanner;

/**
 * Created by NIK on 5/9/2016.
 */
public class Principal {
    public static Scanner in = new Scanner(System.in);
    public static int opcion1;
    public static String opcion2;
    public static Mesero mesero=new Mesero("","","",0);
    public static Cliente cliente=new Cliente("","","",0);

    public static void main(String[] args){
        /*Cliente cliente1 = new Cliente("Bruce", "Whane", "1", Estados.EN_ESPERA);
        Cliente cliente2 = new Cliente("Clark", "Kent", "2", Estados.EN_ESPERA);
        Mesero mesero = new Mesero("Barrey", "Allen", "3", 1234567);
        Mesa mesa = new Mesa(01,Estados.DESOCUPADA);*/

        do{
            System.out.println("Bienvenido");
            System.out.println("Elija una opción");
            System.out.println("1.- Mesero");
            System.out.println("2.- Cliente");
            System.out.println("3.- Salir");
            String opcion1String=in.next();
            opcion1=Integer.parseInt(opcion1String);

            System.out.println("¿Qué desea hacer?");
            System.out.println("a.- Crear");
            System.out.println("b.- Leer");
            System.out.println("c.- Actualizar");
            System.out.println("d.- Borrar");
            System.out.println("Ingrese una opcion --> ");
            opcion2=in.next();
        }while(opcion1!=3 || opcion1>=3);

        if(opcion1==1){
            switch(opcion2){
                case "a":
                    break;

                case "b":
                    break;

                case "c":
                    System.out.println("Ingrese ID --> ");
                    String id=in.next();
                    System.out.println("Ingrese nuevo DNI --> ");
                    String nuevoDniString=in.next();
                    long nuevoDni=Long.parseLong(nuevoDniString);
                    mesero.update("3",nuevoDni);break;

                case "d":
                    break;

            }
        }else{
            switch(opcion2){
                case "a":
                    break;

                case "b":
                    break;

                case "c":
                    System.out.println("Ingrese ID --> ");
                    String id=in.next();
                    System.out.println("Ingrese nuevo estado --> ");
                    String nuevoEstadoString=in.next();
                    int nuevoEstado=Integer.parseInt(nuevoEstadoString);
                    cliente.update("3",nuevoEstado);break;

                case "d":
                    break;
            }

        }
    }
}
