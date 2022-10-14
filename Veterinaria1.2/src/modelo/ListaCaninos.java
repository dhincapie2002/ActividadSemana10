package modelo;

import java.util.*;
import javax.swing.JOptionPane;

public class ListaCaninos extends Caninos {

    // Se definen 4 instancias con el constructor de la clase Caninos.
    Caninos p1 = new Caninos("shes", "schnauzer", "cafe", 5, 2);
    Caninos p2 = new Caninos("zeus", "terrier", "blanco", 4, 10);
    Caninos p3 = new Caninos("catiusca", "golden", "blanco", 2, 5);
    Caninos p4 = new Caninos("felipe", "labrador", "dorado", 2, 6);
    // Definir un ArrayList llamada listaPerro
    ArrayList listaPerro = new ArrayList();
// definir una array para la edad
    ArrayList promPerro = new ArrayList();

    public void EdadCaninos() {
        promPerro.add(5);
        promPerro.add(4);
        promPerro.add(2);
        promPerro.add(2);
        double promedio, suma = 0;
        for (int i = 0; i < promPerro.size(); i++) {
            suma += Double.parseDouble(promPerro.get(i).toString());
        }
        promedio = suma / promPerro.size();
        JOptionPane.showMessageDialog(null, "Edad promedio de los Perro: "+promedio);
    }

    //metodo para agrgar datos a la array y que no se vea vacia
    public void listaP() {
        // Agregamos estas instancias al ArrayList con el método add
        listaPerro.add(p1);
        listaPerro.add(p2);
        listaPerro.add(p3);
        listaPerro.add(p4);

    }

    public void agregarPerro() {
        //Agregar nuevo perro a la arrayList
        listaPerro.add(new Caninos(getNombre(), getRaza(), getColor(), getEdad(), getAdiestramiento()));
        promPerro.add(getEdad());
    }

    // Eliminar elemento de ArrayList.
    /*public void adoptarPerro() {
        listaPerro.remove(xxx);
    }*/
    // Se declara una instancia Iterator it la cual facilita recorrer los objetos, para extraer e imprimir sus valores
    Iterator it = listaPerro.iterator();

    //metodo para mostrar los perros
    public void mostrarPerro() {
        while (it.hasNext()) {
            //generico
            Object objeto = it.next();
            // se pasa a el objeto que se tiene en un principio
            Caninos caninos = (Caninos) objeto;
            JOptionPane.showMessageDialog(null, caninos);
        }
    }
}
