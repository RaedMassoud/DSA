package BinaryTree;

public class BinaryTree {

    Node root;

    // Insert node
    public void insert(int data) {
        root = insertNode(root, data);
    }

    // Insert logic
    public Node insertNode(Node root, int data) {

        // If root is null create the node
        if(root == null)
            root = new Node(data);

        // Else if data is smaller than root
        // return the left hand side node
        else if(data < root.getData())
            root.setLeftNode(insertNode(root.getLeftNode(), data));

        // Else if data is greater than root
        // return the right hand side node
        else
            root.setRigtNode(insertNode(root.getRigtNode(), data));

        // return the node
        return root;
    }

    // In order traversal
    public void inOrderTraversal(Node root) {

        // While root is not null
        if(root != null) {

            // Traverse to the last left node
            inOrderTraversal(root.getLeftNode());
            System.out.print(root.getData());
            System.out.println(" ");

            // Traverse to the last right node
            inOrderTraversal(root.getRigtNode());
        }

    }

    // Pre order traversal
    public void preOrderTraversal(Node root) {

        // if current node is null go back
        if(root == null)
            return;

        // Print current node data
        System.out.println(root.getData());
        System.out.print(" ");

        // recur on left subtree
        preOrderTraversal(root.getLeftNode());
        // recur on right subtree
        preOrderTraversal(root.getRigtNode());

    }

    // Post order traversal
    public void postOrderTraversal(Node root) {

        // if null go back
        if(root == null)
            return;

        // Recur on left subtree
        postOrderTraversal(root.getLeftNode());
        // Recur on right subtree
        postOrderTraversal(root.getRigtNode());

        // Print current node data
        System.out.println(root.getData());
        System.out.print(" ");

    }
}
