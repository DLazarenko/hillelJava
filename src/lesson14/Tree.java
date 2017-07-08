package lesson14;

public class Tree {
    private Node root;

    public void add(Object object) {
        Node node = new Node(object);
        add(node);
    }

    private void add(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            add(root, newNode);
        }
    }

    private void add(Node node, Node newNode) {
        Object nodeObject = node.getData();
        Object newNodeObject = newNode.getData();
        Comparable nodeComparable = (Comparable) nodeObject;
        Comparable newNodeComparable = (Comparable) newNodeObject;
        if (nodeComparable.compareTo(newNodeComparable) > 0) {
            if (node.getLeft() == null) {
                node.setLeft(newNode);
            } else {
                add(node.getLeft(), newNode);
            }
        } else if (nodeComparable.compareTo(newNodeComparable) < 0) {
            if (node.getRight() == null) {
                node.setRight(newNode);
            } else {
                add(node.getRight(), newNode);
            }
        } else add(node.getRight(), newNode);
    }
}
