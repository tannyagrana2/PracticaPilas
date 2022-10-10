package practicapilas;

public class PracticaPilas {
    
    //Tannya Granados Guerrero
    //Bryan Daniel Cantillo Aguilar
    //Juan Diego León León

    public static void main(String[] args) {

        int cubierto;
        Pila miPila = new Pila();

        //Se coloca un vaso con 3 cubiertos de primero
        cubierto = 3;
        Vaso v = new Vaso(cubierto);
        miPila.push(v);

        //Se coloca un plato con 2 cubiertos
        cubierto = 2;
        Plato p = new Plato(cubierto);
        miPila.push(p);

        //Se coloca un plato sin cubiertos
        cubierto = 0;
        p = new Plato(cubierto);
        miPila.push(p);

        miPila.listar();

    }
}
