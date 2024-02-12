package LinkedList;

/**
This class represents a custom written Linked List with 4 methods
Insert method - 1 parameter: To insert node at the end of and array
Insert method - 2 parameters: To insert node at preferred index
Delete method: To delete a certain node
Show method: To print all nodes
 */
public class LinkedList {

    Node head;

    // Insert method
    public void insert(int data) {

        // Create node and add data
        Node node = new Node();
        node.setData(data);

        // If this node is the fist element
        if(head == null)
            head = node;

        // If the node is not the first element
        else {

            // Start from head node and traverse nodes until we reach the last node
            Node n = head;
            while(n.getNext() != null)
                n = n.getNext();

            // Set the reference of the previous node to point to the new node
            n.setNext(node);
        }
    }

    // Insert method with position index
    public void insert(int index, int data) {

        // If index is at zero invoke insertAtStart method
        if(index == 0)
            insertAtStart(data);

        else { // Else traverse the nodes starting from head node
              // set the next node value of the new node to the next node at the given index
             // and update the current next node value to the new node

            Node node = new Node();
            node.setData(data);

            Node n = head;
            for(int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }

            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    // Inserts node at start by setting the new node next value as the head node
    // and updating the head to the new node
    public void insertAtStart(int data) {

        Node node = new Node();
        node.setData(data);

        node.setNext(head);
        head = node;
    }


    // Show method
    public void show() {

        // Traverse the nodes
        Node node = head;
        while(node.getNext() != null) {

            // Print data of the current node and move to the next node
            System.out.print(node.getData());
            System.out.print(" ");
            node = node.getNext();
        }
        // Print the data of the last node
        // This node will not be printed inside the while loop since it will have a next node of null value
        // since it is the last node
        System.out.print(node.getData());
    }

    // Delete node
    public void deleteAt(int index) {

        // Push to head forward
        if(index == 0) {
            head = head.getNext();
        }

        // Go to the node before the index
        Node n = head;
        for(int i = 0; i < index - 1; i++) {
            n = n.getNext();
        }

        Node toDelete = n.getNext(); // Capture node for nullification

        // Update the next node to the node at index + 1;
        n.setNext(n.getNext().getNext());

        toDelete = null; // Nullify
    }

}
