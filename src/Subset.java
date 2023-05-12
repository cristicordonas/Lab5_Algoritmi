public class Subset {
    private int parent, rank;
    public Subset(int parent, int rank) {
        this.parent = parent;
        this.rank = rank;
    }
    public int getParent() {
        return parent;
    }
    public int getRank() {
        return rank;
    }
    public void setParent(int parent) {
        this.parent = parent;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}
