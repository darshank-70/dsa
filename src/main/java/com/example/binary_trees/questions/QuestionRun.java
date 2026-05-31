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

        ///Maximum value of the tree 
        var max = MaximumOfTree.max(root);
        System.out.println("MAXIMUM VALUE: " + max);
        
        //// * HEIGHT OF TREE * /////////
        var height = HeightOfTree.height(root);
        System.out.println("HEIGHT OF THE TREE: " + height);

        ////DIAMETER OF THE TREE O(n2)
        var diameter = DiameterOfTree.diameterOn2(root);
        System.out.println("DIAMETER OF THE TREE: " + diameter);
        
        // DIAMETER OF THE TREE O(n)
        var diameterN = DiameterOfTree.diameterOn(root);
        System.out.println("DIAMETER OF THE TREE: " + diameterN.diameter);

        // does node EXIST
        var exists = ExistsInTree.exists(root, 3);
        System.out.println("The Key " + 3 + "is present ? " + exists);
        
        // completeness 
        
    }
}
