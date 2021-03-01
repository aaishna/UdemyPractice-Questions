package com.way.TreeProg; 
  
class LvelOrderTraversal 
{ 
    // Root of the Binary Tree 
    Node root; 
  
    public LvelOrderTraversal() 
    { 
        root = null; 
    } 
  
    /* function to print level order traversal of tree*/
    void printLevelOrder() 
    { 
        int h = height(root); 
        System.out.println(" height is "+h);
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    /* Compute the "height" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            System.out.println(" lheight is "+lheight);
            int rheight = height(root.right); 
            System.out.println("          rheight is "+rheight);
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
      
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
       LvelOrderTraversal tree = new LvelOrderTraversal(); 
       tree.root= new Node(11); 
       tree.root.left= new Node(22); 
       tree.root.right= new Node(33); 
       tree.root.left.left= new Node(44); 
       tree.root.left.right= new Node(55); 
         
       System.out.println("Level order traversal of binary tree is "); 
       tree.printLevelOrder(); 
    } 
} 