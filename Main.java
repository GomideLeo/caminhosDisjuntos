import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    static RandomAccessFile csvWriter;
    static String executor = "Leo";
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Grafo grafo;
        Tuple<Integer, ArrayList<ArrayList<Integer>>> result;
        
        grafo = new Grafo("instances/test.txt");
        
        result = grafo.getDisjointedPaths(grafo.getPathStart(), grafo.getPathEnd());

        System.out.println("Num Caminhos: "+result.getKey() + "\n caminhos: ");
        for (ArrayList<Integer> p : result.getValue()) System.out.println(p);
    }
}