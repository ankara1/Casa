package Casa.habitacionPrincipal.inmuebles;

import casa.habitacionPrincipal.inmuebles.lampara.Boton;
import casa.habitacionPrincipal.inmuebles.lampara.Medidor;

public class Lampara {

    String color;
    int peso;
    int tamaño;
    Boton boton;
    Medidor medidor;

    public Lampara(String color, int peso, int tamaño, Boton boton, Medidor medidor) {
        super();
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
        this.boton = boton;
        this.medidor = medidor;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public Boton getBoton() {
        return boton;
    }
    public void setBoton(Boton boton) {
        this.boton = boton;
    }
    public Medidor getMedidor() {
        return medidor;
    }
    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }

    @Override
    public String toString() {
        return "Lampara [color=" + color + ", peso=" + peso + ", tamaño=" + tamaño + ", boton=" + boton + ", medidor="
                + medidor + "]";
    }





}