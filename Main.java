import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Grafo grafo;
        Tuple<Integer, ArrayList<ArrayList<Integer>>> result;
        
        grafo = new Grafo("instances/test.txt");

        
        result = grafo.getDisjointedPaths(grafo.getPathStart(), grafo.getPathEnd());
        
        System.out.println("Num Caminhos: "+result.getKey() + "\nCaminhos: ");
        for (ArrayList<Integer> p : result.getValue()) System.out.println(p);
    }
}