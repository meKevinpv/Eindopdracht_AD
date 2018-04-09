package com.eindopdracht.java;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree {
    private ArrayList<Lego> dataSet = new ArrayList<Lego>();

    // Class containing left and right child of current node and key value
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    public BinaryTree() {
        root = null;
        Parser validator = new Parser("src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("BinarySearchTree insert active=====================================================================================================================");
        dataSet = validator.getLegoArray();

        //sorting start hier
        int i, j;
        for(j = 0; j < dataSet.size(); j++) {
            for (i = 1; i < dataSet.size() - j; i++) {
                insert(dataSet.get(i).item_number);
            }
        }
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    void inorder()  {
        inorderRec(root);
    }

    // A function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // A function to search a given key in BST
    public Node search(Node root, int key)
    {
        System.out.println("Binary search active===========================================================================================================================================");
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // val is greater than root's key
        if (root.key > key)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.inorder();

        tree.search(null, 5004737);
    }
}
