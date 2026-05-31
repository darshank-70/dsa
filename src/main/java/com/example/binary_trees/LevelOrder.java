package com.example.binary_trees;
// Also called as BFS

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    //we need a queue 
    private static Queue<Node> queue = new LinkedList<Node>();
    static void traversal(Node root){
        // first push root and null into Queue. 
        queue.add(root);
        queue.add(null);
        // iterate untill quueue is empty. 
        //remove 1 element and then store its left adn right immediately if not null.
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            if(currentNode == null){
                System.out.println();
                // we printing a new line for the level completed
                if(queue.isEmpty()){
                    break;
                }//if this was the last level then exit. 
                else{
                    queue.add(null);
                } // add null to end of quueue as soon as removed. 
            } else {
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null ){
                    queue.add(currentNode.left);
                } if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
    }


}
