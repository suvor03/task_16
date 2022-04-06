package ru.vsu.cs.suvorov_d_a;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStack<E> extends Stack<E> {
    int length = 0;
    Node<E> top = null;

    private class Node<E> {

        private E data;
        private Node<E> nextNode;

        public Node(E data){
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    @Override
    public E push(E data) {
        Node<E> tempNode = new Node<E>(data);
        tempNode.setNextNode(top);
        top = tempNode;
        length++;

        return top.getData();
    }

    public E pop() {
        if(empty()){
            throw new EmptyStackException();
        }

        Node<E> node = top;
        top = top.getNextNode();
        length--;

        return node.getData();
    }
}