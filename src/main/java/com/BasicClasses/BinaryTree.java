package com.BasicClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void insert(T key, T value) { //Implementacion sacada de https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/ "Goat GeeksforGeeks"
        Node<T> newNode = new Node<T>(key, value);
        if (root == null) {
            root = newNode;
        } 
        else {
            Node<T> current = root;
            Node<T> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.getData()) < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } 
                else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }


    public ArrayList<T> inOrder(Node<T> node, ArrayList<T> list) {
        if (node != null) {
            inOrder(node.getLeft(), list);
            list.add(node.getData());
            inOrder(node.getRight(), list);
        }
        return list;
    }
}


