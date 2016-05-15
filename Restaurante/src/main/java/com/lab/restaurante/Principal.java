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
            System.out.println("1.- Mesero");
            System.out.println("2.- Cliente");
            System.out.println("3.- Salir");
            String opcion1String=in.next();
            opcion1=Integer.parseInt(opcion1String);
            }while(opcion1>3);
            if(opcion1==3)break;

            System.out.println("¿Qué desea hacer?");
            System.out.println("a.- Crear");
            System.out.println("b.- Leer");
            System.out.println("c.- Actualizar");
            System.out.println("d.- Borrar");
            System.out.println("Ingrese una opcion --> ");
            opcion2=in.next();

        if(opcion1==1){
            switch(opcion2){
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
                    System.out.println("Ingrese ID de msesero a buscar--> ");
                    String idDeMesero=in.next();
                    Mesero meseroEncontrado=mesero.read(idDeMesero);
                    System.out.println("Nombre: "+meseroEncontrado.getNombre());
                    System.out.println("Apellido: "+meseroEncontrado.getApellido());
                    System.out.println("ID: "+meseroEncontrado.getId());
                    System.out.println("DNI: "+meseroEncontrado.getDni());
                    System.out.println("Presiona cualquier tecla para continuar");
                    in.next();
                    break;

                case "c":
                    System.out.println("Ingrese ID de mesero a actualizar--> ");
                    String idMeseroActualizar=in.next();
                    System.out.println("Ingrese nuevo DNI --> ");
                    String nuevoDniString=in.next();
                    long nuevoDni=Long.parseLong(nuevoDniString);
                    mesero.update(idMeseroActualizar,nuevoDni);break;

                case "d":
                    System.out.println("Ingrese ID de mesero a borrar-->");
                    String idABorrar=in.next();
                    mesero.delete(idABorrar);
                    System.out.println("Registro de mesero borrado");
                    break;

            }
        }else {
            switch(opcion2){
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
                    System.out.println("Ingrese ID de cliente a buscar--> ");
                    String idDeCliente=in.next();
                    Cliente clienteEncontrado=cliente.read(idDeCliente);
                    System.out.println("Nombre: "+clienteEncontrado.getNombre());
                    System.out.println("Apellido: "+clienteEncontrado.getApellido());
                    System.out.println("ID: "+clienteEncontrado.getId());
                    System.out.println("Estado: "+clienteEncontrado.getEstado());
                    System.out.println("Presiona cualquier tecla para continuar");
                    in.next();
                    break;

                case "c":
                    System.out.println("Ingrese ID de cliente a actualizar--> ");
                    String idClienteActualizar=in.next();
                    System.out.println("Ingrese nuevo estado --> ");
                    String nuevoEstadoString=in.next();
                    int nuevoEstado=Integer.parseInt(nuevoEstadoString);
                    cliente.update(idClienteActualizar,nuevoEstado);break;

                case "d":
                    System.out.println("Ingrese ID de cliente a borrar-->");
                    String idABorrar=in.next();
                    cliente.delete(idABorrar);
                    System.out.println("Registro de cliente borrado");
                    break;
                }
            }
        }while (opcion1 != 3);
        System.out.println("Proceso finalizado");
    }
}
