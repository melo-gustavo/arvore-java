package tree;

import java.util.ArrayList;

public class Node<T> {
	private T root;
	private Node<T> parent;
	private ArrayList<Node<T>> children;
	
	public Node(T root) {
        this.root = root;
        children = new ArrayList<>();
    }

    public Node<T> addChild(T child) {
        Node<T> childNode = new Node<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    public T getRoot() {
        return root;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public boolean isLeaf() {
        return children.size() == 0;
    }

    public int getLevel() {
        if (this.isRoot())
            return 0;
        else
            return parent.getLevel() + 1;
    }

    @Override
    public String toString() {
        return root != null ? root.toString() : "null";
    }
}
