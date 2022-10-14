package modelo;

import java.util.*;

public class LIstaFelinos extends Felinos {

    // Se definen 4 instancias con el constructor de la clase Producto.
    Felinos g1 = new Felinos("pacha", "persa", "gris", 1, "si");
    Felinos g2 = new Felinos("borona", "siberiano", "blanco", 2, "si");
    Felinos g3 = new Felinos("minina", "siames", "naranja", 2, "no");
    Felinos g4 = new Felinos("pinina", "persa", "negro", 3, "no");
    // Definir un ArrayList llamado listaGato
    ArrayList listaGato = new ArrayList();
//metodo para agrgar datos a la array y que no se vea vacia

    public void listaG() {
        // Agregamos estas instancias al ArrayList con el método add
        listaGato.add(g1);
        listaGato.add(g2);
        listaGato.add(g3);
        listaGato.add(g4);
    }

    public void agregarPerro() {
        //Agregar nuevo perro a la arrayList
        listaGato.add(new Felinos(getNombre(), getRaza(), getColor(), getEdad(), getToxoplasmosis()));
    }

    public void adoptarPerro() {

    }
}
