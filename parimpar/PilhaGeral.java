package com.mycompany.parimpar;

public class PilhaGeral<T> {

    private No top;
    private int size;

    public PilhaGeral() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        No newNode = new No(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.prev = top;
            top.next = newNode;
            top = newNode;
        }
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("PilhaGeral Vazia!");
        }
        int data = top.data;
        top = top.prev;
        if (top != null) {
            top.next = null;
        }
        size--;
        return data;
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("PilhaPar Vazia!");
        }
        return top.data;
    }

    public boolean isEmpty() {
        if(this.top == null){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
