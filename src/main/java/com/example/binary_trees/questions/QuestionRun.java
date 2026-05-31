package com.example.binary_trees.questions;

import com.example.binary_trees.Node;
import com.utils.BinaryTreeFactory;

public class QuestionRun {
    public static void main(String[] args) {
        //* * build working tree. * * 
        Node root  = BinaryTreeFactory.createSampleTree();
        ////*********COUNT NO OF NODES********
        var count  = CountNodes.count(root);
        System.out.println("TOTAL NO OF NODES: "+ count);
        // /***** SUM OF NODES */
        var sum = SumOfNodes.sum(root);
        System.out.println("SUM OF NODES: " + sum);
    }
}
