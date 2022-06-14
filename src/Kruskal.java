import java.util.TreeSet;

public class Kruskal {

    public static void main(String[] args){
        TreeSet<Aresta> arestas = new TreeSet<Aresta>();

        arestas.add(new Aresta("A", "B", 5));
        arestas.add(new Aresta("A", "C", 6));
        arestas.add(new Aresta("A", "D", 9));
        arestas.add(new Aresta("A", "E", 10));
        arestas.add(new Aresta("B", "D", 3));
        arestas.add(new Aresta("D", "E", 2));
        arestas.add(new Aresta("E", "C", 1));
        arestas.add(new Aresta("D", "C", 8));

        System.out.println("Grafo");
        KruskalArestas vv = new KruskalArestas();

        for(Aresta aresta: arestas){
            System.out.println(aresta);
            vv.insereAresta(aresta);
        }

        System.out.println("Kruskal");
        int total = 0;
        for(Aresta aresta: vv.getArestas()){
            System.out.println(aresta);
            total += aresta.getPeso();
        }

        System.out.println("Peso total : " + total);
    }
}
