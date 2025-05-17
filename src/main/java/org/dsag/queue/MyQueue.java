package org.dsag.queue;

/**
 * Queue implemented with a double link list.
 */
public class MyQueue<T extends Number> {
    GenLink<T> head;
    GenLink<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void offer(T o) {
        if(head == null) {
            GenLink<T> temp = new GenLink<>(o);
            head = temp;
            tail = temp;
        } else {
            GenLink<T> temp = new GenLink<>(o, null, tail);
            tail.next = temp;
            tail = temp;
        }
    }

    public T poll() {
        if(head == null) {
            return null;
        } else {
            T temp = head.value;
            head = head.next;

            if(head == null) {
                tail = null;
            }

            return temp;
        }
    }

    public T peek() {
        return head == null ? null : head.value;
    }

    public void print() {
        if(head != null) {
            GenLink<T> temp = head;
            System.out.print("Queue");

            while(temp != null) {
                System.out.print(" -> " + temp);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.offer(1);
        mq.offer(2);
        mq.print();
        System.out.println(mq.peek());
        mq.offer(3);
        System.out.println(mq.peek());
        mq.poll();
        mq.poll();
        System.out.println(mq.peek());
        mq.offer(4);
        mq.print();
        mq.offer(5);
        mq.print();
    }
}
