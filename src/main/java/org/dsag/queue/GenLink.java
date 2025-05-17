package org.dsag.queue;

/**
 * Double Link List
 */
public class GenLink<T extends Number> {
    public T value;
    public GenLink<T> next;
    public GenLink<T> previous;

    public GenLink(T value) {
        this.value = value;
    }

    public GenLink(T value, GenLink<T> next, GenLink<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
