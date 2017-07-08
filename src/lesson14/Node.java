package lesson14;

public class Node {

    private Object data;
    private Node left;
    private Node right;

    Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
