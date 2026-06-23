package dsa.dataStructures.linear.linkedLists.doubly;
public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}
class DoublyLinkedList{
    Node head;
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void removeLast(){
        // Empty
        if (head == null){
            System.out.println("Empty list. Can't delete tail node.");
            return;
        }
        // Single element
        if (head.next == null){
            head = null;
            return;
        }
        // Multiple elements
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null; // Update the next pointer of prev to null
    }
    public void display(){
        Node temp = head;
        System.out.print("null <--> ");
        while (temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.display();
        dll.removeLast();
        dll.display();
    }

}
