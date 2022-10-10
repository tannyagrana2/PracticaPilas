package practicapilas;

public class Plato {

    private String plato;
    private int cantidadCubiertos;

    public Plato(int CantidadCubiertos) {
        plato = "Plato";
        cantidadCubiertos = CantidadCubiertos;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public int getCantidadCubiertos() {
        return cantidadCubiertos;
    }

    public void setCantidadCubiertos(int cantidadCubiertos) {
        this.cantidadCubiertos = cantidadCubiertos;
    }
}
