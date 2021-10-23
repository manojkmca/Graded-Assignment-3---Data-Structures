package com.GreatLearning.Construction;

public class CompleteBST {
	    int value;
	    CompleteBST left, right;

	    CompleteBST(int item) {
	        value = item;
	        left = right = null;
	    }
	}
	class Driver {
	    public CompleteBST node;
	    public CompleteBST prevNode = null;
	    public CompleteBST headNode = null;

	    //Create a Skewed Tree
	     
	    public void createSkewedTree(CompleteBST root, int order) {
	        if (root == null) {
	            return;
	        }

	        if (order > 0) {
	            createSkewedTree(root.right, order);
	        } else {
	            createSkewedTree(root.left, order);
	        }
	        CompleteBST rightNode = root.right;
	        CompleteBST leftNode = root.left;

	        if (headNode == null) {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        } else {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }

	        if (order > 0) {
	            createSkewedTree(leftNode, order);
	        } else {
	            createSkewedTree(rightNode, order);
	        }
	    }

	    // Traverse the Right Skewed Tree
	    
	    public void traverseRightSkewed(CompleteBST root) {
	        if (root == null) {
	            return;
	        }
	        System.out.print(root.value + " -> ");
	        traverseRightSkewed(root.right);
	    }
}
