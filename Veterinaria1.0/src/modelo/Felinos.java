package modelo;
//clase hija

public class Felinos extends Animal {
// inicio encapsulamiento

    /**
     * @return the toxoplasmosis
     */
    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    /**
     * @param toxoplasmosis the toxoplasmosis to set
     */
    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
// fin encapsulamiento
//Atributos de la clase hija
    private String toxoplasmosis;
//constructor

    public Felinos() {
    }
//constructor sobre cargado

    public Felinos(String nombre, String raza, String color, int edad, String toxoplasmosis) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    @Override
    public String toString() {
        return ("Nomre: " + getNombre() + "\n"
                + "Raza: " + getRaza() + "\n"
                + "Color: " + getColor() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Tiene Toxoplasmosis: " + getToxoplasmosis())+ "\n"+"\n";
    }

}
