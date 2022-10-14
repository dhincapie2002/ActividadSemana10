package modelo;
//clase hija

public class Caninos extends Animal {
// inicio encapsulamiento

    /**
     * @return the adiestramiento
     */
    public int getAdiestramiento() {
        return adiestramiento;
    }

    /**
     * @param adiestramiento the adiestramiento to set
     */
    public void setAdiestramiento(int adiestramiento) {
        this.adiestramiento = adiestramiento;
    }
// fin encapsulamiento
//Atributos de la clase hija
    private int adiestramiento;
//constructor

    public Caninos() {
    }
//constructor sobrecargado

    public Caninos(String nombre, String raza, String color, int edad,int adiestramiento) {
        super(nombre, raza, color, edad);
        this.adiestramiento = adiestramiento;
    }

    @Override
    public String toString() {
        return ("Nomre: " + getNombre() + "\n"
                + "Raza: " + getRaza() + "\n"
                + "Color: " + getColor() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Tiene Toxoplasmosis: " + getAdiestramiento());
    }
}
