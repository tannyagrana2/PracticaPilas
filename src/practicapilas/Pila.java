/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapilas;

/**
 *
 * @author bcant
 */
public class Pila {
     private Node cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    public boolean Vacia() {
        return cima == null; //Indica si está vacía la pila
    }

    public int tam() {
        return this.largo; //Almacena el tamaño del arreglo
    }

    public void push(Vaso c) {
        Node newNode = new Node();
        newNode.setVaso(c);
        newNode.setCubierto(c.getCantidadCubiertos());
        if (this.Vacia()) {
            this.cima = newNode;
            this.cima.setCubierto(c.getCantidadCubiertos());
        } 
        else {
            Node aux = this.cima;
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            int n = aux.getCubierto() + newNode.getCubierto();
            this.cima.setCubierto(n);
            Node nodoSiguiente = this.cima.getSiguiente();
            nodoSiguiente.setCubierto(0);
        }
        this.largo++;
    }

    public void push(Plato c) {
        Node newNode = new Node();
        newNode.setPlato(c);
        newNode.setCubierto(c.getCantidadCubiertos());
        if (this.Vacia()) {
            this.cima = newNode;
            this.cima.setCubierto(c.getCantidadCubiertos());
        } 
        else {
            Node aux = this.cima;
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            int n = aux.getCubierto() + newNode.getCubierto();
            this.cima.setCubierto(n);
            Node no = this.cima.getSiguiente();
            no.setCubierto(0);

        }
        this.largo++;
    }

    public void listar() {
        // Crea una copia de la pila.
        Node aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {
            if (aux.getVaso() != null) {
                System.out.println("|\t" + aux.getVaso().getVaso() + " con " + aux.getCubierto() + " cubiertos\t|");
                System.out.println("---------------------------------");
            } 
            else {
                System.out.println("|\t" + aux.getPlato().getPlato() + " con " + aux.getCubierto() + " cubiertos\t|");
                System.out.println("---------------------------------");
            }

            aux = aux.getSiguiente();
        }
    }
}
