package Casa.habitacionPrincipal.inmuebles.lampara;

import java.util.ArrayList;

public class Medidor {

    ArrayList<String> medidas;
    Boton boton = new Boton();
    String medidaEnUso = "apagado";

    public Medidor() {
        this.medidas = new ArrayList<>();
        this.medidas.add(0, "apagado");
        this.medidas.add(1, "bajo");
        this.medidas.add(2, "medio");
        this.medidas.add(3, "alto");
    }

    public ArrayList<String> getMedidas() {
        return medidas;
    }

    public String getMedidaEnUso() {
        return medidaEnUso;
    }

    @Override
    public String toString() {
        return "Medidor [medidas=" + medidas + ", getMedidas()=" + getMedidas() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public void usarMedidor(int medida, boolean encender) {
        if(encender == true) {
            boton.encender();
            System.out.println("se encendio la lampara");
            if(medida == 1 || medida == 2 || medida == 3) {
                medidaEnUso = medidas.get(medida);
                System.out.println("y su medida es " + medidas.get(medida));
            }else {
                boton.apagar();
                medidaEnUso=medidas.get(0);
                System.out.println("el boton esta en apagado y el medidor tambien");
            }
        }

    }



}
