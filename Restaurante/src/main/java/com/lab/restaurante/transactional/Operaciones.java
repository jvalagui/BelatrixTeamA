package com.lab.restaurante.transactional;

/**
 * Created by NIK on 5/16/2016.
 */
public class Operaciones {
    public static boolean validacion;

    public static boolean validarPrimeraOpcion(String opcion1){
        switch(opcion1){
          case "a":
              validacion = true;break;
          case "b":
              validacion = true;break;
          case "c":
              validacion = true;break;
          default:
              validacion = false; break;
      }
        return validacion;
    }

    public static boolean validarSegundaOpcion(String opcion2){
        switch(opcion2){
            case "a":
                validacion = true;break;
            case "b":
                validacion = true;break;
            case "c":
                validacion = true;break;
            case "d":
                validacion = true;break;
            default:
                validacion = false; break;
        }
        return validacion;
    }
}
