package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

//Diameter is the maximum length of the tree passing through root. 
//find diameter of the leftSubtree 
// find diameter of right subtree=
// find height of left subtree + height of right subtree.
//and then find macximum of them. 
public class DiameterOfTree {
    public static int diameterOn2(Node root){
        if(root == null) return 0;
        int diamLeft = diameterOn2(root.left);
        int diamRight = diameterOn2(root.right);
        int diameterHeight = HeightOfTree.height(root.left ) + HeightOfTree.height(root.right) + 1;
        return Math.max(diameterHeight, Math.max(diamLeft,diamRight));
    }
    public static TreeInfo diameterOn(Node root){
        if(root == null) return new TreeInfo(0,0);
        TreeInfo leftInfo = diameterOn(root.left);
        TreeInfo rightInfo = diameterOn(root.right);
        // HeightOfTree.height(root.left) + HeightOfTree.height(root.right) + 1; O(n2) part

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        //got the maxumimn height of tree.
        // find diameter of tree
        int diameter3 = leftInfo.height + rightInfo.height + 1;

         int diameter = Math.max(diameter3, Math.max(leftInfo.diameter, rightInfo.diameter));
         return new TreeInfo(height, diameter);
    }
}
// we needto calculate height at the same time as we find diameter
//this way we cn do it in O(n)

class TreeInfo {
    int height, diameter;
    TreeInfo(int height, int diameter){
        this.height = height;
        this.diameter = diameter;
    }
}