import org.w3c.dom.Node;

import java.util.Objects;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    private class Node{
        private Node next;
        private Objects data;

        public Node(Objects data){
            this.data = data;
        }
        public Objects getData(){
            return this.data;
        }
    }
    public void add(int index, Objects data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
    }
    public void addFirst(Objects data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
