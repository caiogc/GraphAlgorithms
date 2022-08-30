import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    /*
     * Graph g1 = new Graph(4);
     * g1.addEdge(0, 1, 3);
     * g1.addEdge(1, 0, 3);
     * g1.addEdge(0, 3, 4);
     * g1.addEdge(3, 0, 4);
     * g1.addEdge(3, 4, 2);// aviso
     * System.out.println(g1);
     * System.out.println("Grau de cada nó:");
     * System.out.println(g1.degree(0));
     * System.out.println(g1.degree(1));
     * System.out.println(g1.degree(2));
     * System.out.println(g1.degree(3));
     * System.out.println("Maior grau: " + g1.highestDegree());
     * System.out.println("Menor grau: " + g1.lowestDegree());
     * System.out.println("Densidade: " + g1.density());
     * System.out.println("Grafo complementar: \n" + g1.complement());
     * 
     * Graph g2 = new Graph(3);
     * g2.addEdge(0, 1, 1);
     * g2.addEdge(1, 0, 1);
     * System.out.println("g2 is subGraph? " + g1.subGraph(g2)); // true
     * Graph g3 = new Graph(4);
     * g3.addEdge(1, 3, 1);
     * g3.addEdge(3, 1, 1);
     * System.out.println("g3 is subGraph? " + g1.subGraph(g3)); // false
     */
    Graph g5 = new Graph(12);
    g5.addEdgeUnoriented(7, 5, 1);
    g5.addEdgeUnoriented(7, 1, 1);
    g5.addEdgeUnoriented(7, 2, 1);
    g5.addEdgeUnoriented(1, 0, 1);
    g5.addEdgeUnoriented(1, 4, 1);
    g5.addEdgeUnoriented(2, 3, 1);
    g5.addEdgeUnoriented(5, 6, 1);
    g5.addEdgeUnoriented(6, 8, 1);
    System.out.println(g5.bfs(7));
    System.out.println(g5.connected());
    Graph g6 = new Graph("graph1.txt");
    System.out.println(g5.dfs_rec(7));
    // System.out.println(g6);
    // System.out.println(g6.nonOriented());
  }
}