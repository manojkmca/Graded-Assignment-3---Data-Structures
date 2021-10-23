package com.GreatLearning.Construction;

public class CompleteBSTMain {
	public static void main (String[] args)
	 {
		 Driver tree = new Driver();
	     tree.node = new CompleteBST(50);
	     tree.node.left = new CompleteBST(30);
	     tree.node.right = new CompleteBST(60);
	     tree.node.left.left = new CompleteBST(10);
	     tree.node.right.left = new CompleteBST(55);

	     int order = 0;
	     tree.createSkewedTree(tree.node, order);
	     System.out.print("Rightly Skewed Tree is as following: ");
	     tree.traverseRightSkewed(tree.headNode);
	 }
}


