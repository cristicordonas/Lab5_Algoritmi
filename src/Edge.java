public class Edge {
    private int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public int getDest() {
        return dest;
    }
    public int getSrc() {
        return src;
    }
}
