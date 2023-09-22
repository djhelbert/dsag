package org.dsag.queue;

/**
 * Queue implemented with a double link list.
 */
public class MyQueue {
    Link head;
    Link tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void offer(Object o) {
        if(head == null) {
            Link temp = new Link(o);
            head = temp;
            tail = temp;
        } else {
            Link temp = new Link(o, null, tail);
            tail.next = temp;
            tail = temp;
        }
    }

    public Object poll() {
        if(head == null) {
            return null;
        } else {
            Object temp = head.value;
            head = head.next;

            if(head == null) {
                tail = null;
            }

            return temp;
        }
    }

    public Object peek() {
        return head == null ? null : head.value;
    }

    public void print() {
        if(head != null) {
            Link temp = head;
            System.out.print("Queue");
            while(temp != null) {
                System.out.print(" -> " + temp);
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.offer("1");
        mq.offer("2");
        mq.print();
        System.out.println(mq.peek());
        mq.offer("3");
        System.out.println(mq.peek());
        mq.poll();
        mq.poll();
        System.out.println(mq.peek());
        mq.offer("4");
        mq.print();
    }
}
