package com.example.binary_trees;

public class BinaryTree {
    static int index = -1;
   public Node buildTree(int[] nodes){
        index++;
        if(nodes.length == 0 || nodes[index] == -1) return null;
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
}