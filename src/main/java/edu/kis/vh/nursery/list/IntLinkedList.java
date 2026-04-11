package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentujaca stos liczb calkowitych oparty na liscie wiazanej.
 */
public class IntLinkedList {

    private static final int EMPTY = -1;

    
    private Node last;
    private int i;

    /**
     * Dodaje nowy element na szczyt stosu.
     * @param i wartosc calkowita do dodania na stos
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * @return true jesli stos jest pusty, w przeciwnym razie false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy stos jest pelny.
     * W tej implementacji stos oparty na liscie nigdy nie jest pelny.
     * @return zawsze false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartosc elementu na szczycie stosu bez jego usuwania.
     * @return wartosc na szczycie stosu lub wartosc EMPTY (-1), jesli stos jest pusty
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Zwraca i usuwa element ze szczytu stosu.
     * @return
     * wartosc ze szczytu stosu lub wartosc EMPTY (-1), jesli stos jest pusty
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
 class Node {

    private int value;
     // TODO: usunac nieuzywana zmienna 'i'
    private Node prev, next;
    public int getValue() { return value; }

    public Node getPrev() { return prev; }
    public void setPrev(Node prev) { this.prev = prev; }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
    public Node(int i) {
        value = i;
    }

}
