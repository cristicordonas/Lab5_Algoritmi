import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Primul Algoritm - Dijkstra
        System.out.println("Primul Algoritm - Dijkstra");
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);
        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);
        nodeC.addDestination(nodeE, 10);
        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);
        nodeF.addDestination(nodeE, 5);
        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        Node start = nodeA;
        Dijkstra.calculateShortestPathFromSource(graph, start);
        System.out.println("Distanta de la " + start.getName() + " la A este: " + nodeA.getDistance());
        System.out.println("Distanta de la " + start.getName() + " la B este: " + nodeB.getDistance());
        System.out.println("Distanta de la " + start.getName() + " la C este: " + nodeC.getDistance());
        System.out.println("Distanta de la " + start.getName() + " la D este: " + nodeD.getDistance());
        System.out.println("Distanta de la " + start.getName() + " la E este: " + nodeE.getDistance());
        System.out.println("Distanta de la " + start.getName() + " la F este: " + nodeF.getDistance());
        //Al doilea algoritm - Kruskal
        System.out.println();
        System.out.println("Al doilea algoritm - Kruskal");
        int V = 4;
        List<Edge> graphEdges = new ArrayList<>(
                List.of(new Edge(0, 1, 10), new Edge(0, 2, 6),
                        new Edge(0, 3, 5), new Edge(1, 3, 15),
                        new Edge(2, 3, 4)));
        graphEdges.sort(new Comparator<>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        Kruskal.kruskals(V, graphEdges);
        //Al treilea algoritm - Prim
        System.out.println();
        System.out.println("Al treilea algoritm - Prim");
        int[][] graphPrim = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        Prim.PrimMST(graphPrim);
    }
}