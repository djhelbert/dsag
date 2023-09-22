package org.dsag.queue;

/**
 * Double Link List
 */
public class Link {
    public Object value;
    public Link next;
    public Link previous;

    public Link(Object value) {
        this.value = value;
    }

    public Link(Object value, Link next, Link previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
