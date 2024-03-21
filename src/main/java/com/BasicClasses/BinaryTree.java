package com.BasicClasses;

import java.util.ArrayList;

import com.Association;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void insert(T key, T value) {
        Node<T> newNode = new Node<T>(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            Node<T> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.getData()) > 0) { // Compare with >
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                } else {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                }
            }
        }
    }

    public ArrayList<Association<T,T>> inOrder(Node<T> node, ArrayList<Association<T,T>> list) { //aqui pues no puede hacerlo tan generico, porque mejor devuelvo una lista con las asociaciones de un solo
        if (node != null) {
            inOrder(node.getLeft(), list);
            list.add(node.getAssociation());
            inOrder(node.getRight(), list);
        }
        return list;
    }
}


