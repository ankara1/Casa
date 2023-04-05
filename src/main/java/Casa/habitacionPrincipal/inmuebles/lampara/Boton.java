package Casa.habitacionPrincipal.inmuebles.lampara;

public class Boton {

    boolean encendido;

    public Boton() {}

    public void encender () {
        this.encendido = true;
        System.out.println("prendi la lampara");

    }
    public void apagar () {
        this.encendido = false;
        System.out.println("apague la lampara");
    }

    public boolean isEncendido() {
        return encendido;
    }

}
