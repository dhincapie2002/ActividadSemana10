package modelo;

import java.util.*;
import javax.swing.JOptionPane;

public class Logica {

    //Crear Array para almacenar Datos de los perros
    ArrayList<String> perros = new ArrayList<String>();
    //Crear Array para almacenar Datos de los gatos
    ArrayList<String> gatos = new ArrayList<String>();
    //variables para poder identificar y eliminar Gatos
    int codigoG = 1;
    //variables para poder identificar y eliminar Perros
    int codigoP = 1;
    //Crear array para alamacenar las edades y poder hacer los promedio
    ArrayList<Integer> edadP = new ArrayList<Integer>();
    ArrayList<Integer> edadG = new ArrayList<Integer>();

    //metodo para agregar felinos
    public String ingresarFelinos(String nombre, String raza, String color, int edad, String toxoplasmosis) {

        //variable para alamcenar la informacion de los animales en forma de una sola linea de texto
        String datosGato = "";
        //Alamacenar el texto dentro de la variable segun ingresa
        datosGato += "Nombre: " + nombre + "\n"
                + "Raza: " + raza + "\n"
                + "Color: " + color + "\n"
                + "Edad: " + edad + "\n"
                + "Tiene Toxoplasmosis: " + toxoplasmosis + "\n"
                + "___________________" + "\n";
        //Almacenar datos en la array
        gatos.add(datosGato);
        codigoG++;
        //almacenar en un array diferente las edades de los gatos
        edadG.add(edad);
        JOptionPane.showMessageDialog(null, datosGato);
        return datosGato;
    }

    //metodo para agrgar Caninos
    public String ingresarCaninos(String nombre, String raza, String color, int edad, int adiestramiento) {
        //variable para alamcenar la informacion de los animales en forma de una sola linea de texto
        String datosPerro = "";
        //Alamacenar el texto dentro de la variable segun ingresa
        datosPerro += "Nombre: " + nombre + "\n"
                + "Raza: " + raza + "\n"
                + "Color: " + color + "\n"
                + "Edad: " + edad + "\n"
                + "Nivel de entrenamiento: " + adiestramiento + "\n"
                + "______________________" + "\n";
        //Almacenar datos en la array
        perros.add(datosPerro);
        codigoP++;
        //almacenar en un array diferente las edades de los perros
        edadP.add(edad);
        JOptionPane.showMessageDialog(null, datosPerro);
        return datosPerro;
    }

    //metodo para mostar la cantidad de animales
    public void cantidadAnimales() {
        JOptionPane.showMessageDialog(null, "Hay : " + perros.size() + " Perros" + "\n" + "Hay : " + gatos.size() + " Gatos");
    }

    //metodo para calcular y mostar la edad promedio
    public void edadPromedio() {
        double proG = 0, proP = 0;
        int sum = 0;
        //recorres el vector con las edades para hacer la sumatoria
        for (int i = 0; i < perros.size(); i++) {
            sum += edadP.get(i);
        }
        if (perros.size() == 0 || sum == 0) {
            proP = 0;
        } else {
            //hacer el calculo del promedio
            proP += sum / perros.size();
        }
        //reiniciar la variable suma para que no se acumile la edad
        sum = 0;
        //recorres el vector con las edades para hacer la sumatoria
        for (int i = 0; i < gatos.size(); i++) {
            sum += edadG.get(i);
        }
        //hacer el calculo del promedio
        if (gatos.size() == 0 || sum == 0) {
            proG = 0;
        } else {
            proG += sum / gatos.size();
        }
        JOptionPane.showMessageDialog(null, "La edad promedio de los perro es: " + proP + " Perros" + "\n" + "La edad promedio de los gatos es: " + proG + " Gatos");
    }

    //metodo para mostar los gatos
    public void mostarListaGato() {
        String datosGato = "";
        for (int i = 0; i < gatos.size(); i++) {
            datosGato += "\n" + "Codigo: " + (i + 1) + "\n" + gatos.get(i) + "\n" + "___________________________";
        }
        JOptionPane.showMessageDialog(null, datosGato);
    }

    //metodo para mostar los perros
    public void mostarListaPerro() {
        String datosPerro = "";
        for (int i = 0; i < perros.size(); i++) {
            datosPerro += "\n" + "Codigo: " + (i + 1) + "\n" + perros.get(i) + "\n" + "___________________________";
        }
        JOptionPane.showMessageDialog(null, datosPerro);
    }

    //metodo para eliminar un gato
    public String eliminarGato(int quitar) {
        String datosGato = "";
        //quitar la pocicion de la array
        gatos.remove(quitar - 1);
        //reiciar la los codigos
        codigoG = 1;
        //ciclo repetitivo para crear nueva lista
        for (int i = 0; i < gatos.size(); i++) {
            datosGato += codigoG + "-" + gatos.get(i) + "\n";
            codigoG++;
        }
        return datosGato;
    }

    //metodo para eliminar un perro
    public String eliminarPerro(int quitar) {
        String datosPerro = "";
        //quitar la pocicion de la array
        perros.remove(quitar - 1);
        //reiciar la los codigos
        codigoP = 1;
        //ciclo repetitivo para crear nueva lista
        for (int i = 0; i < perros.size(); i++) {
            datosPerro += codigoP + "-" + perros.get(i) + "\n";
            codigoP++;
        }
        return datosPerro;
    }
}
