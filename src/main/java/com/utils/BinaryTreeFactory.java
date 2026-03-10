package com.utils;
import com.example.binary_trees.BinaryTree;
import com.example.binary_trees.Node;
public class BinaryTreeFactory {
    public static Node createSampleTree() {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        return tree.buildTree(nodes);
    }
}
