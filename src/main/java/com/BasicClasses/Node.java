package com.BasicClasses;

import com.Association;

public class Node<T> {

    private T data;
    private Association<T, T> association;
    private Node<T> left;
    private Node<T> right;

    public Node(T key, T value) {
        this.data = key;
        this.association = new Association<T, T>(key, value);
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
