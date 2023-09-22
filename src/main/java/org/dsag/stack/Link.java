package org.dsag.stack;

/**
 * Link List
 */
public class Link {
    public Object value;
    public Link next;

    public Link(Object value) {
        this.value = value;
    }

    public Link(Object value, Link next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
