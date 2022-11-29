package com.sparta;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            if (left == null && right != null){
                return "The node's value is: " + String.valueOf(data) + " its left track is null" + " its right track is: " + String.valueOf(right.data);
            } else if (right == null && left != null){
                return "The node's value is: " + String.valueOf(data) + " its left track is: " + String.valueOf(left.data) + " its right track is null";
            } else if (left == null){
                return "The node's value is: " + String.valueOf(data) + " both its left and right tracks are null";
            } else{
                return "The node's value is: " + String.valueOf(data) + " its left track is: " + String.valueOf(left.data) + " its right track is: " + String.valueOf(right.data);
            }
        }
    }

    void add(Node start, int data){
//        if(start.data == data){                 // see if the data your adding is already the current node
//            return;                             // if it is, do nothing because we don't allow duplicates
//        }                                       // this check is implicitly covered by the < & > comparisons after so there is actually no need for this

        if(data < start.data){                  // if the data you're trying to add is less than the start node
            if (start.left == null){            // see if the left branch of that node is null
                start.left = new Node(data);    // if it is then your data is added there
            }
            else {
                add(start.left,data);           // if the left track is not null then run the comparison again but for that node as the root
            }
        }
        else if (data > start.data) {           // if larger than root node, do the same as above but for the right track
            if (start.right == null){
                start.right = new Node(data);
            }
            else {
                add(start.right,data);
            }
        }
    }

    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data==key)
            return root;

        // Key is greater than root's key
        if (root.data < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }
}
