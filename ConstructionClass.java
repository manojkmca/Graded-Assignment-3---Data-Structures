package com.GreatLearning.Construction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ConstructionClass {
	public Integer totalNumberOfFloors;
    public Integer[] getFloorSize;

    //Get the Number of Floors !! 
    
    public void getNumberOfFloors() {
        System.out.println("Enter the total no of building floors: ");
        Scanner sc = new Scanner(System.in);
        totalNumberOfFloors = sc.nextInt();
        getFloorSize = new Integer[totalNumberOfFloors];

        for (int i = 1; i <= totalNumberOfFloors; i++) {
            System.out.println("Enter the floor size on a given day : " + i);
            getFloorSize[i - 1] = sc.nextInt();
        }
    }

    // Calculate and print the order of construction
    
    public void printOrderOfConstruction(Integer[] totalFloorSize) {
        System.out.println("The order of construction is as follows");

        int j = 0;
        Integer[] totalFloorSizeSorted = getFloorSize.clone();
        Arrays.sort(totalFloorSizeSorted, Collections.reverseOrder());
        Stack < Integer > myStack = new Stack < Integer > ();

        //Loop over unsorted Stack elements and pop if entry is matched 
        
        for (int i = 0; i < getFloorSize.length; i++) {
            if (getFloorSize[i] == totalFloorSizeSorted[j]) {
                if (i == getFloorSize.length - 1) j = i;
                else j = i + 1;

       // Print the current floor and the Stack till empty and entry is > than next element and is sorted list.
                
                System.out.println("Day: " + (i + 1));
                if (myStack != null) {
                    System.out.print(getFloorSize[i] + " ");
                    while (!myStack.isEmpty()) {
                        int val = myStack.pop();
                        if (val >= totalFloorSizeSorted[j]) {
                            System.out.print(val + " ");
                        } else {
                            myStack.push(val);
                            j -= myStack.size();
                            
                        }
                        break;
                    }
                    System.out.println("");
                } else {
                    System.out.println(getFloorSize[i]);
                }
            } else
            // Add Stack element
            {
                System.out.println("Day: " + (i + 1));
                myStack.push(getFloorSize[i]);
            }
        }
    }

}
