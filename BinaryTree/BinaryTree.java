package BinaryTree;

public class BinaryTree {

    Node root;

    // Insert node
    public void insert(int data) {
        root = insertrec(root, data);
    }

    // Insert logic
    public Node insertrec(Node root, int data) {

        // If root is null create the node
        if(root == null)
            root = new Node(data);

        // Else if data is smaller than root
        // return the left hand side node
        else if(data < root.getData())
            root.setLeftNode(insertrec(root.getLeftNode(), data));

        // Else if data is greater than root
        // return the right hand side node
        else
            root.setRigtNode(insertrec(root.getRigtNode(), data));

        // return the node
        return root;
    }

    // In order traversal
    public void inOrderRec(Node root) {

        // While root is not null
        if(root != null) {

            // Traverse to the last left node
            inOrderRec(root.getLeftNode());
            System.out.print(root.getData());
            System.out.println(" ");

            // Traverse to the last right node
            inOrderRec(root.getRigtNode());
        }

    }
}
