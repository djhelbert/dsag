package org.dsag.hash;

import java.util.LinkedList;

/**
 * Direct Chaining Hash
 */
public class DirectChainHash {
    LinkedList<String>[] list;

    public DirectChainHash(int size) {
        list = new LinkedList[size];
    }

    public void insert(String value) {
        int pos = getHashValue(value);

        if(list[pos] == null) {
            list[pos] = new LinkedList<>();
            list[pos].add(value);
        } else {
            list[pos].add(value);
        }
    }

    public int getHashValue(String value) {
        return value.hashCode() % getSize();
    }

    public int getSize() {
        return list.length;
    }

    public void printHashTable() {
        if (list != null) {
            for (int i=0; i<getSize(); i++) {
                System.out.println("Index " + i + ", key:" + list[i]);
            }
        }
    }

    public boolean search(String value) {
        int pos = getHashValue(value);

        if(list[pos] == null) {
            return false;
        } else {
            return list[pos].stream().filter(s -> s.equals(value)).findFirst().isPresent();
        }
    }

    public static void main(String[] args) {
        DirectChainHash dch = new DirectChainHash(12);
        dch.insert("a");
        dch.insert("b");
        dch.insert("c");
        dch.insert("d");
        dch.insert("a");
        dch.printHashTable();
        System.out.println("Found b = " + dch.search("b"));
        System.out.println("Found x = " + dch.search("x"));
    }
}
