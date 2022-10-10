package practicapilas;

public class Vaso {

    private String vaso;
    private int cantidadCubiertos;

    public Vaso(int CantidadCubiertos) {
        vaso = "Vaso";
        cantidadCubiertos = CantidadCubiertos;
    }

    public String getVaso() {
        return vaso;
    }

    public void setVaso(String vaso) {
        this.vaso = vaso;
    }

    public int getCantidadCubiertos() {
        return cantidadCubiertos;
    }

    public void setCantidadCubiertos(int cantidadCubiertos) {
        this.cantidadCubiertos = cantidadCubiertos;
    }
}
