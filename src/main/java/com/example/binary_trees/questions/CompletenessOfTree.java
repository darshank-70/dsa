package com.example.binary_trees.questions;
//a Tree is complete if any level has all its nodes. 
//level n -> log2(n) Nodes
//          1 
//      2        3 
//    4   5    6   -

// we need to use Level Order Traversal, 
//main logic is that while processing from the queue if we encounter a null, then after that every other popped node should be null .
//level 0 -> 2^0
//level 1 -> 2^1
// 
import java.util.LinkedList;
import java.util.Queue;

import com.example.binary_trees.Node;

public class CompletenessOfTree {
    static Queue<Node> queue = new LinkedList<Node>();
    public static boolean check(Node root){
        queue.add(root);
        while(!queue.isEmpty()){
            Node popped = queue.remove();
            if(popped!=null){
                // were still in the same level. 
                // add its children. 
                queue.add(popped.left);
                queue.add(popped.right);
            } else {
                while(!queue.isEmpty()){
                    if(queue.remove() != null) return false;
                    // we expect all values are null 
                }
            }
        }
        return true;
    }
}
