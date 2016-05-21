package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Claudia on 21/05/2016.
 */
public class Telefono extends Persona {

    private int tele1;
    private static List<Telefono> lista= new ArrayList<Telefono>();

    public Telefono(String nombre, String apellido, String id, int tele1) {
        super(nombre, apellido, id);
        this.tele1=tele1;
    }

    public void crear(Telefono telefono) {
        lista.add(telefono);
    }

    public void read(int tele1) {
        Telefono telefonoencontrado = null;
        for (Telefono telefonoitem : lista) {
            if (telefonoitem.getTele1() == tele1) {
                telefonoencontrado = telefonoitem;
                System.out.println("Telefono encontrado");
                System.out.println("Nombre: " + telefonoencontrado.getNombre());
                System.out.println("Apellido: " + telefonoencontrado.getApellido());
                System.out.println("ID: " + telefonoencontrado.getId());
                System.out.println("Telefono: " + telefonoencontrado.getTele1());
            } else {
                System.out.println("Telefono no encontrado");
            }
        }
    }

    public void update(int tele1) { this.tele1=tele1; }


    public void delete(Telefono telefono){
        lista.remove(telefono);
    }

    public Telefono buscar(int tele1){
        Telefono telefonoencontrado=null;
        for(Telefono telefonoitem : lista){
            if(telefonoitem.getTele1()==tele1){
                telefonoencontrado=telefonoitem;
            }
        }
        return telefonoencontrado;
    }


    public int getTele1() {
        return tele1;
    }

    public void setTele1(int tele1) {
        this.tele1 = tele1;
    }
}

