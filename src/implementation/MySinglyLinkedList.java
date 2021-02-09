package implementation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    private Node head;
    private Node tail;
    private int size;
    public MySinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void addFirst(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.setNext(head);
            head = node;
            size++;
        }
    }
    @Override
    public void addLast(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
        }
    }
    public void addLastWithoutUsingTail(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            //traversing to last node
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            tail = node;
            size++;
        }
    }
    @Override
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse() {
        if(!isEmpty()){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData() + "-->");
                temp = temp.getNext();
            }
            System.out.println("null");
        }

    }

    @Override
    //returning first element without removing it
    public int first() {
        int response = 0;//considering 0 as invalid data
        if(!isEmpty()){
            response = head.getData();
        }

        return response;
    }

    @Override
    //returning last element without removing it
    public int last() {
        int response = 0;
        if(!isEmpty()){
            response = tail.getData();
        }
        return response;
    }

    @Override
    public int removeFirst() {
        int response
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public void addAfterGivenNode(int givenElement, int element) {

    }

    @Override
    public int removeGivenNode(int givenElement) {
        return 0;
    }
}
