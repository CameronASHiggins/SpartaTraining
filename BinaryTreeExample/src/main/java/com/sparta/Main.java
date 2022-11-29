package com.sparta;

import com.sparta.BinaryTree.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        BinaryTree.Node start = new Node(10);
        bTree.add(start,7);
        System.out.println(bTree.search(start,7).toString());
//        bTree.add(start,6);
//        System.out.println(bTree.search(start,7).toString());
        bTree.add(start,5);
        bTree.add(start,8);
        System.out.println(bTree.search(start,7).toString());

    }
}