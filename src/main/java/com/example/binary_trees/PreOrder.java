package com.example.binary_trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public interface PreOrder {
    // pre order is N - L - R 
    static void traversal(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        traversal(root.left);
        traversal(root.right);
    }
    static List<Integer> traversalIterative(Node root){
        //since pre order traversal need to be processed N , L , R.
//        to store processed node
        List<Integer> result = new LinkedList<>();
//        To simulate recursion process we consider a stack.
        Stack<Node> stack = new Stack<>();
        //to start with Node
        stack.push(root);

        while(!stack.isEmpty()){
            Node node = stack.pop();
            //N -> Node
            result.add(node.data);

            // R -> Since LIFO we process left L when popped from stack.
            stack.push(node.right);
            // L -> since LIFO we process right R after left
            stack.push(node.left);
        }
        return result;
    }
}
