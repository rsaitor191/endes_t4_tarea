import java.util.ArrayList;

/**
 * La clase Concesionario representa un concesionario que gestiona una lista de coches.
 * @author Aitor.
 */
public class Concesionario {


    private ArrayList<Auto> autos;

    /**
     * Constructor para crear un objeto Concesionario con una lista de coches vacía.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Añade el nuevo coche a la lista del concesionario.
     * @param auto El coche a añadir.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Obtiene la lista de coches del concesionario.
     * @return La lista de coches del concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime los detalles de los coches del concesionario.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

