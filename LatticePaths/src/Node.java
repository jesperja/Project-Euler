import java.util.ArrayList;

public class Node {

    private int number;
    private ArrayList<Node> parents;

    public Node(int number){
        this.number = number;
        this.parents = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Node> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Node> parents) {
        this.parents = parents;
    }
}
