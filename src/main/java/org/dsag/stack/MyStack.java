package org.dsag.stack;

/**
 * Stack implemented with a link list
 */
public class MyStack {
    private Link head;

    public boolean isEmpty() {
      return head == null;
    }

    public void push(Object o) {
        if(head == null) {
            head = new Link(o);
        } else {
            Link temp = new Link(o, head);
            head = temp;
        }
    }

    public Object pop() {
         if(head == null) {
             return null;
         } else {
             Object temp = head.value;
             head = head.next;

             return temp;
         }
    }

    public Object peek() {
        return head == null ? null : head.value;
    }

    public void print() {
        if(head != null) {
            Link temp = head;
            System.out.print("Stack");
            while(temp != null) {
                System.out.print(" -> " + temp);
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("One");
        System.out.println(ms.peek());
        ms.push("Two");
        ms.push("Three");
        System.out.println(ms.peek());
        ms.pop();
        System.out.println(ms.peek());
        ms.push("Four");
        System.out.println(ms.peek());
        ms.print();
    }
}

