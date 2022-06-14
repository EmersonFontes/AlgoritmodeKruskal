import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class KruskalArestas {

    Vector<HashSet<String>> arvores = new Vector<HashSet<String>>(); //conjunto de vertices

    TreeSet<Aresta> kruskalArestas = new TreeSet<Aresta>();

    public TreeSet<Aresta> getArestas() {return kruskalArestas;}

    HashSet<String> getArvore(String vertice){

        for(HashSet<String> arvore:arvores){
            if(arvore.contains(vertice)){
                return arvore;
            }
        }
        return null;
    }

    public void insereAresta(Aresta aresta){
        String v1= aresta.getV1();
        String v2 = aresta.getV1();

        HashSet<String> arvoreA = getArvore(v1);
        HashSet<String> arvoreB = getArvore(v2);

        if(arvoreA == null){
            kruskalArestas.add(aresta);
            if(arvoreB == null){
                HashSet<String> htNewVerTexGroup = new HashSet<String>();
                htNewVerTexGroup.add(v1);
                htNewVerTexGroup.add(v2);
                arvores.add(htNewVerTexGroup);
            }else{
                arvoreB.add(v1);
            }
        }else{
            if(arvoreB == null){
                arvoreA.add(v2);
                kruskalArestas.add(aresta);
            }else if(arvoreA != arvoreB){
                arvoreA.addAll(arvoreB);
                arvores.remove(arvoreB);
                kruskalArestas.add(aresta);
            }
        }
    }


}
