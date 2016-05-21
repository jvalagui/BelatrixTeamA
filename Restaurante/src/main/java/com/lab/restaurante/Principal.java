package com.lab.restaurante;

import com.lab.restaurante.constantes.Estados;
import com.lab.restaurante.model.Cliente;
import com.lab.restaurante.model.Mesa;
import com.lab.restaurante.model.Mesero;
import com.lab.restaurante.transactional.Operaciones;

import java.util.Scanner;

/**
 * Created by NIK on 5/9/2016.
 */
public class Principal {
    public static Scanner in = new Scanner(System.in);
    public static String opcion1;
    public static String opcion2;
    public static Mesero meseroReferencia=new Mesero("","","",0);
    public static Cliente clienteReferencia=new Cliente("","","",0);

    public static void main(String[] args){
        //
        Cliente cliente1 = new Cliente("Bruce", "Whane", "1", Estados.EN_ESPERA); cliente1.crear(cliente1);
        Cliente cliente2 = new Cliente("Clark", "Kent", "2", Estados.EN_ESPERA); cliente2.crear(cliente2);
        Mesero mesero1 = new Mesero("Barrey", "Allen", "3", 1234567); mesero1.crear(mesero1);
        Mesero mesero2 = new Mesero("Lex", "Luthor", "4", 123); mesero2.crear(mesero2);
        Mesero mesero3 = new Mesero("Tony", "Stark", "5", 1234); mesero3.crear(mesero3);

        do{
            do{
                System.out.println("Bienvenido");
                System.out.println("Elija una opción");
                System.out.println("a.- Mesero");
                System.out.println("b.- Cliente");
                System.out.println("c.- Salir");
                opcion1=in.next();
                if(!Operaciones.validarPrimeraOpcion(opcion1)){
                    System.out.println("Ingrese una opción correcta\n");
                }
            }while(!Operaciones.validarPrimeraOpcion(opcion1));
            if(opcion1.equalsIgnoreCase("c"))break;

            do{
                System.out.println("¿Qué desea hacer?");
                System.out.println("a.- Crear");
                System.out.println("b.- Leer");
                System.out.println("c.- Actualizar");
                System.out.println("d.- Borrar");
                System.out.println("Ingrese una opcion --> ");
                opcion2=in.next();
                if(!Operaciones.validarPrimeraOpcion(opcion2)){
                    System.out.println("Ingrese una opción correcta\n");
                }
            }while(!Operaciones.validarPrimeraOpcion(opcion1));


            if(opcion1.equalsIgnoreCase("a")){
                switch(opcion2){
                    case "a":
                        System.out.println("Ingrese el nombre -->");
                        String nombre=in.next();
                        System.out.println("Ingrese el apellido ->");
                        String apellido=in.next();
                        System.out.println("Ingrese el id -->");
                        String id=in.next();
                        System.out.println("Ingrese el dni");
                        String dniString=in.next();
                        long dni=Long.parseLong(dniString);
                        Mesero mesero = new Mesero (nombre,apellido,id,dni);
                        mesero.crear(mesero);
                        System.out.println("Mesero agregado\nPresione cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "b":
                        System.out.println("Ingrese ID de mesero a buscar--> ");
                        String idDeMesero=in.next();
                        meseroReferencia.read(idDeMesero);
                        System.out.println("Presione cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "c":
                        System.out.println("Ingrese ID de mesero a actualizar--> ");
                        String idMeseroActualizar=in.next();
                        Mesero meseroActualizar=meseroReferencia.buscar(idMeseroActualizar);
                        if(meseroActualizar!= null){
                            System.out.println("Ingrese nuevo DNI --> ");
                            String nuevoDniString=in.next();
                            long nuevoDni=Long.parseLong(nuevoDniString);
                            meseroActualizar.update(nuevoDni);
                            System.out.println("Mesero actualizado");
                        }
                        else{
                            System.out.println("Mesero no encontrado");
                        }
                        System.out.println("Presione cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "d":
                        System.out.println("Ingrese ID de mesero a borrar-->");
                        String idMeseroBorrar=in.next();
                        Mesero meseroABorrar=meseroReferencia.buscar(idMeseroBorrar);
                        if(meseroABorrar!=null){
                            meseroABorrar.delete(meseroABorrar);
                            System.out.println("Registro de mesero borrado");
                        }
                        else{
                            System.out.println("Mesero no encontrado");
                        }
                        System.out.println("Presione cualquier tecla para continuar\n\n");
                        in.next();break;
                }
            }else{
                switch(opcion2){
                    case "a":
                        System.out.println("Ingrese el nombre -->");
                        String nombre=in.next();
                        System.out.println("Ingrese el apellido ->");
                        String apellido=in.next();
                        System.out.println("Ingrese el id -->");
                        String id=in.next();
                        System.out.println("Ingrese el Ingrese el estado (0=En recepción, 1=En espera, 2=En mesa) -->");
                        String estadoString=in.next();
                        int estado=Integer.parseInt(estadoString);
                        Cliente cliente=new Cliente (nombre,apellido,id,estado);
                        cliente.crear(cliente);
                        System.out.println("Cliente agregado\nPresione cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "b":
                        System.out.println("Ingrese ID de cliente a buscar--> ");
                        String idDeCliente=in.next();
                        clienteReferencia.read(idDeCliente);
                        System.out.println("Presiona cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "c":
                        System.out.println("Ingrese ID de cliente a actualizar--> ");
                        String idClienteActualizar=in.next();
                        Cliente clienteActualizar=clienteReferencia.buscar(idClienteActualizar);
                        if(clienteActualizar!= null){
                            System.out.println("Ingrese nuevo estado (0=En recepción, 1=En espera, 2=En mesa) --> ");
                            String nuevoEstadoString=in.next();
                            int nuevoEstado=Integer.parseInt(nuevoEstadoString);
                            clienteActualizar.update(nuevoEstado);
                            System.out.println("Cliente actualizado");
                        }
                        else{
                            System.out.println("Cliente no encontrado");
                        }
                        System.out.println("Presione cualquier tecla para continuar\n\n");
                        in.next();break;

                    case "d":
                        System.out.println("Ingrese ID de cliente a borrar-->");
                        String idClienteBorrar=in.next();
                        Cliente clienteABorrar=clienteReferencia.buscar(idClienteBorrar);
                        if(clienteABorrar!=null){
                            clienteABorrar.delete(clienteABorrar);
                            System.out.println("Registro de cliente borrado");
                        }
                        else{
                            System.out.println("Cliente no encontrado");
                        }
                        System.out.println("Presione cualquier tecla para continuar\n\n");
                        in.next();break;
                }
            }
        }while (!opcion1.equalsIgnoreCase("c"));
        System.out.println("Proceso finalizado");
    }
}
