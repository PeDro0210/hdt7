package com;

public class Association<T,K> {
    private T key;
    private K value;

    public Association(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

}
