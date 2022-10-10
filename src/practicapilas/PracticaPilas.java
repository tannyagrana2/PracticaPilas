package practicapilas;

public class PracticaPilas {
    
    //Tannya Granados Guerrero
    //Bryan Daniel Cantillo Aguilar
    //Juan Diego León León

    public static void main(String[] args) {

        Pila miPila = new Pila();
        Vaso v = new Vaso(0);
        Plato p = new Plato(0);
        
        miPila.push(new Vaso(3)); //Vaso con 3 cubiertos
        miPila.push(new Plato(2));//Plato con 2 cubiertos
        miPila.push(new Plato(0));//Plato sin cubiertos
        miPila.listar(); 

    }
}
