package com.example.proguardtest;

public final class Mapper<T> {

    private final T item;

    public Mapper(T item) {
        this.item = item;
    }

    public <R> R map(Function<T, R> function) {
        return function.call(item);
    }
}
