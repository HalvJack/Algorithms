package org.example;

public class Tree {
    private Node root;

    public Tree() {
    }

    public Tree(Node root) {
        this.root = root;
    }

    public void addNode(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addNode(value, root);
        }
    }

    public void addNode(int value, Node node) {
        if (value < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(value));
            } else {
                addNode(value, node.getLeft());
            }
        } else if (value > node.getValue()) {
            if (node.getRight() == null) {
                node.setRight(new Node(value));
            } else {
                addNode(value, node.getRight());
            }
        }
    }

    public void addNode(int value, int parentValue, boolean isLeftChild) {
        if (root == null) {
            root = new Node(value);
        } else {
            addNode(value, parentValue, isLeftChild, root);
        }
    }

    public void addNode(int value, int parentValue, boolean isLeftChild, Node node) {
        if (node == null) {
            return;
        }
        if (node.getValue() == parentValue) {
            if (isLeftChild) {
                node.setLeft(new Node(value));
            } else {
                node.setRight(new Node(value));
            }
            return;
        }
        addNode(value, parentValue, isLeftChild, node.getLeft());
        addNode(value, parentValue, isLeftChild, node.getRight());
    }

    public int countLeaves() {
        return countLeavesHelper(this.root);
    }

    private int countLeavesHelper(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesHelper(node.left) + countLeavesHelper(node.right);
    }

    public int maxDepth() {
        return maxDepthHelper(this.root);
    }

    private int maxDepthHelper(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = maxDepthHelper(node.left);
        int rightDepth = maxDepthHelper(node.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public boolean equals(Tree other) {
        return equalsHelper(this.root, other.root);
    }

    private boolean equalsHelper(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.value != node2.value) {
            return false;
        }
        return equalsHelper(node1.left, node2.left) && equalsHelper(node1.right, node2.right);
    }
}

