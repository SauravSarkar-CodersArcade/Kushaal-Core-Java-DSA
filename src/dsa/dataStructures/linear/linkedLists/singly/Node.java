package dsa.dataStructures.linear.linkedLists.singly;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // We don't know the address of the next node
            size++; // Increment the size as soon as a node is created
        }
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Connect the new node to the head
        newNode.next = head;
        // Update the head position to the new node
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // If the list is empty - the new node becomes the head
        if(head == null){
            head = newNode;
            return;
        }
        // Traberse & find the last node
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        // By the end of this loop, the temp node will be at the last node [tail]
        // Connect the new node after this node
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LL singlylinkedlist = new LL();
        singlylinkedlist.addFirst("Linked-Lists");
        singlylinkedlist.addFirst("learning");
        singlylinkedlist.addFirst("is");
        singlylinkedlist.addFirst("Kushaal");
        singlylinkedlist.printList();
        singlylinkedlist.addLast("in");
        singlylinkedlist.addLast("Linear");
        singlylinkedlist.addLast("Data Structures");
        singlylinkedlist.printList();
    }
}
