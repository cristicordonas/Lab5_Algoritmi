import java.util.*;
public class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map<Node, Integer> adjacentNodes = new HashMap<>();
    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
    public Node(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }
    public List<Node> getShortestPath() {
        return shortestPath;
    }
    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    public Integer getDistance() {
        return distance;
    }
    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }
    @Override
    public String toString() {
        return name;
    }
}