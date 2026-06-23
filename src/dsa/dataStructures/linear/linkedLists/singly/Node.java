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
    public void removeFirst(){
        // Empty list - can't delete
        if (head == null){
            System.out.println("Empty list. Can't delete head node.");
            return;
        }
        // For a single node, the head will point to next [null]
        // For multiple nodes, the head will point to next [valid node]
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        // Empty list - can't delete
        if (head == null){
            System.out.println("Empty list. Can't delete tail node.");
            return;
        }
        // If single element - point the head to null
        if (head.next == null){
            head = null;
            size--;
            return;
        }
        // For multiple nodes we need to find the last & secondLast
        Node last = head.next;
        Node secondlast = head;
        while (last.next != null){
            secondlast = last;
            last = last.next;
        }
        // By the end of this loop both sl & l will be available
        // We need to point secondLast to null rather than last
        // The last node will be automatically deleted by JVM
        secondlast.next = null;
        size--;
    }
    public void removeTarget(String target){
        // Empty list - can't delete
        if (head == null){
            System.out.println("Empty list. Can't delete target node.");
            return;
        }
        // target is located @ the head node [1st Element]
        if(head.data.equals(target)){
            head = head.next;
            size--;
            return;
        }
        // target is anywhere in the list
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)){
            prev = curr;
            curr = curr.next;
        }
        // After this loop check is curr is null
        // If null -> target not found
        if(curr == null){
            System.out.println("Target Node: " + target + " NOT FOUND.");
            return;
        }
        // Delete the target node by adjusting it's previous node
        prev.next = curr.next;
        size--;
        System.out.println("Target Node: '" + target + "' FOUND & DELETED.");
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
        singlylinkedlist.removeFirst();
        singlylinkedlist.printList();
        singlylinkedlist.removeLast();
        singlylinkedlist.printList();
        singlylinkedlist.removeTarget("Python");
        singlylinkedlist.removeTarget("Linked-Lists");
        singlylinkedlist.printList();
    }
}
