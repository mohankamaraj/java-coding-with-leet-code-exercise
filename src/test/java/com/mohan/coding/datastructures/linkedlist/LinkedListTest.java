package com.mohan.coding.datastructures.linkedlist;


import org.junit.jupiter.api.Assertions;

class LinkedListTest {
    @org.junit.jupiter.api.Test
    void testLinkedList() {
        LinkedList list = new LinkedList(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Assertions.assertEquals(10, list.getFirstValue());
        Assertions.assertEquals(40, list.getLastValue());
        Assertions.assertEquals(4, list.getLength());
    }
}