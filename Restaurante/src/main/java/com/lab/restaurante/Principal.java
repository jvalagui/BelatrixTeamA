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
    public static Mesero mesero = new Mesero("", "", "", 0);
    public static Cliente cliente = new Cliente("", "", "", 0);

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruce", "Whane", "1", Estados.EN_ESPERA);
        Cliente cliente2 = new Cliente("Clark", "Kent", "2", Estados.EN_ESPERA);
        Mesero mesero1 = new Mesero("Barrey", "Allen", "3", 1234567);
        Mesero mesero2 = new Mesero("Lex", "Luthor", "4", 123);
        Mesero mesero3 = new Mesero("Tony", "Stark", "5", 1234);


        do {
            System.out.println("Bienvenido");
            System.out.println("Elija una opción");
            System.out.println("1.- Mesero");
            System.out.println("2.- Cliente");
            System.out.println("3.- Salir");
            String opcion1String = in.next();
            opcion1 = Integer.parseInt(opcion1String);

            System.out.println("¿Qué desea hacer?");
            System.out.println("a");
            System.out.println("b Leer");
            System.out.println("c Actualizar");
            System.out.println("d  Borrar");
            System.out.println("Ingrese una opcion --> ");
            opcion2 = in.next();

            if (opcion1 == 1) {
                switch (opcion2) {

                    case "a":
                        System.out.println("Ingrese el nombre -->");
                        String nombre=in.next();
                        System.out.println("Ingrese el apellido ->");
                        String apellido=in.next();
                        System.out.println("Ingrese el id -->");
                        String id=in.next();
                        System.out.println("Ingrese el estado -->");
                        String estadoString=in.next();
                        int estado=Integer.parseInt(estadoString);
                        Cliente cliente=new Cliente (nombre,apellido,id,estado);
                        cliente.crear(cliente);
                        System.out.println("Cliente agregado");
                        break;

                    case "b":
                        break;

                    case "c":
                        System.out.println("Ingrese ID --> ");
                        String id1 = in.next();
                        System.out.println("Ingrese nuevo DNI --> ");
                        String nuevoDniString = in.next();
                        long nuevoDni = Long.parseLong(nuevoDniString);
                        mesero.update("3", nuevoDni);
                        break;

                    case "d":
                        break;

                }
            } else {
                switch (opcion2) {
                    case "a":
                        System.out.println("Ingrese el nombre -->");
                        String nombre=in.next();
                        System.out.println("Ingrese el apellido ->");
                        String apellido=in.next();
                        System.out.println("Ingrese el id -->");
                        String id=in.next();
                        System.out.println("Ingrese el dni -->");
                        String dni=in.next();
                        long dni1 = Long.parseLong(dni);
                        Mesero mesero=new Mesero (nombre,apellido,id,dni1);
                        mesero.crear(mesero);
                        System.out.println("Mesero agregado");
                        break;

                    case "b":
                        break;

                    case "c":
                        System.out.println("Ingrese ID --> ");
                        String id1 = in.next();
                        System.out.println("Ingrese nuevo estado --> ");
                        String nuevoEstadoString = in.next();
                        int nuevoEstado = Integer.parseInt(nuevoEstadoString);
                        cliente.update("3", nuevoEstado);
                        break;

                    case "d":
                        break;
                }

            }
        } while (opcion1 != 3 || opcion1 >= 3);
    }
}
