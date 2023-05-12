import java.util.*;
public class Kruskal {
    public static void kruskals(int V, List<Edge> edges) {
        int j = 0;
        int noOfEdges = 0;
        Subset[] subsets = new Subset[V];
        Edge[] results = new Edge[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }
        while (noOfEdges < V - 1) {
            Edge nextEdge = edges.get(j);
            int x = findRoot(subsets, nextEdge.getSrc());
            int y = findRoot(subsets, nextEdge.getDest());
            if (x != y) {
                results[noOfEdges] = nextEdge;
                union(subsets, x, y);
                noOfEdges++;
            }
            j++;
        }
        System.out.println("Muchiile arborelui de cost minim:");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(results[i].getSrc() + " - "
                    + results[i].getDest() + " cu costul "
                    + results[i].getWeight());
            minCost += results[i].getWeight();
        }
        System.out.println("Costul total: " + minCost);
    }
    private static void union(Subset[] subsets, int x, int y) {
        int rootX = findRoot(subsets, x);
        int rootY = findRoot(subsets, y);
        if (subsets[rootY].getRank() < subsets[rootX].getRank()) {
            subsets[rootY].setParent(rootX);
        }
        else if (subsets[rootX].getRank() < subsets[rootY].getRank()) {
            subsets[rootX].setParent(rootY);
        }
        else {
            subsets[rootY].setParent(rootX);
            subsets[rootX].setRank(subsets[rootX].getRank() + 1);
        }
    }
    private static int findRoot(Subset[] subsets, int i) {
        if (subsets[i].getParent() == i)
            return subsets[i].getParent();
        subsets[i].setParent(findRoot(subsets, subsets[i].getParent()));
        return subsets[i].getParent();
    }
}
