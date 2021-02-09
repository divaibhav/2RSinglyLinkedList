package myinterface;

public interface SinglyLinkedListADT {
    void addFirst(int element);
    void addLast(int element);
    boolean isEmpty();
    int size();
    void traverse();
    int first();
    int last();
    int removeFirst();
    int removeLast();
    void addAfterGivenNode(int givenElement, int element);
    int removeGivenNode(int givenElement);
}
