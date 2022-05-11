/*
    Find height of binary tree
    Input :- root node of tree
    Output :- height/depth of tree
*/

package Recursion;

import Util.BinaryTree;
import Util.Node;

import java.util.Scanner;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(5);
        System.out.println(heightOfTree(tree.root));
    }

    private static int heightOfTree(Node node) {
        if(node==null){
            return 0;
        }
        int lHeight = heightOfTree(node.left);
        int rheight = heightOfTree(node.right);
        return 1 + Integer.max(lHeight,rheight);
    }
}
