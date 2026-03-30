package edu.kis.vh.nursery.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntLinkedListTest {

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;
        Assertions.assertEquals(EMPTY_STACK_VALUE, list.top());
        int testValue = 5;
        list.push(testValue);
        Assertions.assertEquals(testValue, list.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assertions.assertTrue(list.isEmpty());

        list.push(888);
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;

        Assertions.assertEquals(EMPTY_STACK_VALUE, list.pop());

        list.push(3);
        list.push(7);

        Assertions.assertEquals(7, list.pop());
        Assertions.assertEquals(3, list.top());
    }
}