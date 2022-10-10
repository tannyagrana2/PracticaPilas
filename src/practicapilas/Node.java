package practicapilas;

public class Node {

    private int cubierto; //Se insertan en los objetos vaso y plato, vienen por cantidad
    private Plato plato; //Se insertan en cada nodo, pueden contener cubiertos o no
    private Vaso vaso; //Se insertan en cada nodo, pueden contener cubiertos o no
    private Node siguiente; 

    public Node() {
        cubierto = this.cubierto = 0; //Inicializa el objeto tipo INT
        plato = this.plato = null; //Inicializa el objeto tipo NODE
        vaso = this.vaso = null; //Inicializa el objeto tipo NODE
        siguiente = this.siguiente = null; //Inicializa el objeto tipo NODE
    }

    public int getCubierto() {
        return cubierto;
    }

    public void setCubierto(int cubierto) {
        this.cubierto = cubierto;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Vaso getVaso() {
        return vaso;
    }

    public void setVaso(Vaso vaso) {
        this.vaso = vaso;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
