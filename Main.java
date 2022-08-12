class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph(4);
    g1.addEdge(0, 1, 3);
    g1.addEdge(1, 0, 3);
    g1.addEdge(0, 3, 4);
    g1.addEdge(3, 0, 4);
    g1.addEdge(3, 4, 2);// aviso
    System.out.println(g1);
    System.out.println(g1.degree(0));
    System.out.println(g1.degree(1));
    System.out.println(g1.degree(2));
    System.out.println(g1.degree(3));
    System.out.println("Highest degree: " + g1.highestDegree());
    System.out.println("Lowest degree: " + g1.lowestDegree());
    System.out.println("Grafo complementar: \n" + g1.complement());
  }
}