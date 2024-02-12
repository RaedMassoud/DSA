package BinaryTree;

public class Node {

    private int data;
    private Node leftNode;
    private Node rigtNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    public Node getLeftNode() {
        return leftNode;
    }
    public Node getRigtNode() {
        return rigtNode;
    }

    public void setData(int data) {
        this.data = data;
    }
    public void setRigtNode(Node rigtNode) {
        this.rigtNode = rigtNode;
    }
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

}
