package Casa.habitacionPrincipal.inmuebles;

public class Vestier {


    int puertas;
    int cajones;
    String color;
    String peso;
    int tubos;
    boolean cajadeseguridad;
    public Vestier(int puertas, int cajones, String color, String peso, int tubos, boolean cajadeseguridad) {
        super();
        this.puertas = puertas;
        this.cajones = cajones;
        this.color = color;
        this.peso = peso;
        this.tubos = tubos;
        this.cajadeseguridad = cajadeseguridad;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getCajones() {
        return cajones;
    }
    public void setCajones(int cajones) {
        this.cajones = cajones;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public int getTubos() {
        return tubos;
    }
    public void setTubos(int tubos) {
        this.tubos = tubos;
    }
    public boolean isCajadeseguridad() {
        return cajadeseguridad;
    }
    public void setCajadeseguridad(boolean cajadeseguridad) {
        this.cajadeseguridad = cajadeseguridad;
    }
    @Override
    public String toString() {
        return "Vestier [puertas=" + puertas + ", cajones=" + cajones + ", color=" + color + ", peso=" + peso
                + ", tubos=" + tubos + ", cajadeseguridad=" + cajadeseguridad + "]";
    }












}

