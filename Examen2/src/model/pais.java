package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Claudia on 21/05/2016.
 */
public class pais extends Persona{
    private String idcountry;
    private static List<pais> lista= new ArrayList<pais>();

    public pais(String nombre, String apellido, String id,String idcountry) {
        super(nombre, apellido, id);
       this.setIdcountry(idcountry);
    }

    public void crear(pais pais) {
        lista.add(pais);
    }

    public void read(int tele1) {
        pais paisencontrado = null;
        for (pais paisitem : lista) {
            if (paisitem.getIdcountry() == idcountry) {
                paisencontrado = paisitem;
                System.out.println("Pais encontrado");
                System.out.println("Nombre: " + paisencontrado.getNombre());
                System.out.println("Apellido: " + paisencontrado.getApellido());
                System.out.println("ID: " + paisencontrado.getId());
                System.out.println("Pais: " + paisencontrado.getIdcountry());
            } else {
                System.out.println("Pais no encontrado");
            }
        }
    }

    public void update(String idcountry) { this.idcountry=idcountry; }


    public void delete(pais pais){
        lista.remove(pais);
    }

    public pais buscar(String idcountry){
        pais paisencontrado=null;
        for(pais paisitem : lista){
            if(paisitem.getIdcountry()==idcountry){
                paisencontrado=paisitem;
            }
        }
        return paisencontrado;
    }


    public String idSt () {
        return tele1;
    }


    public String getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(String idcountry) {
        this.idcountry = idcountry;
    }
}
