package com.GreatLearning.Construction;

public class ConstructionMainClass {

	   public static int totalFloors;
	    public static int[] totalFloorSize;

	    public static void main(String[] args) {
	    	ConstructionClass myContructionDriverObj = new ConstructionClass();
	    	myContructionDriverObj.getNumberOfFloors();
	    	myContructionDriverObj.printOrderOfConstruction(myContructionDriverObj.getFloorSize);
	    }

}
