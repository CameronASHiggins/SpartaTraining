package com.sparta;

import java.util.Arrays;

public class BubbleSorter {
    public BubbleSorter() {}
    public int[] sort(int[] inputArray) {   // Takes array of ints as input
        int arrayLen = inputArray.length;    // Creates int with the length of input as its value
        boolean isSorted = false;           // Boolean to know when to stop sorting, updated if a clean pass (no swaps) is made through the array

        while (isSorted == false) { //start pass if not sorted
            isSorted = true; //Assume the list is sorted
            for (int i = 0; i < arrayLen - 1; i++) { //initialise conditions for the pass
                if (inputArray[i] > inputArray[i + 1]) { //if element is greater than the next element
                    int swapInt = inputArray[i]; //store higher number
                    inputArray[i] = inputArray[i + 1]; //reassign higher number as lower number
                    inputArray[i + 1] = swapInt; //reassign lower number as higher number
                    isSorted = false;//As a swap was made then the list wasn't sorted
                }
            }
        }
        return inputArray;
    }

    public int[] mergeBrute(int[] inArray1, int[] inArray2){
        int[] outArray = new int[inArray1.length+inArray2.length]; // Create new array of a size of the combined lengths of the input arrays
        for(int i = 0; i<inArray1.length;i++ ){
            outArray[i] = inArray1[i];
        }
        int x = inArray1.length;
        for(int i = 0; i<inArray2.length;i++ ){
            outArray[x] = inArray2[i];
            x++;
        }
        return sort(outArray);
    }

    public int[] merge(int[] inArray1, int[] inArray2) {

        int inArray1Length = inArray1.length;
        int inArray2Length = inArray2.length;

        int[] outArray = new int[inArray1Length + inArray2Length]; // Create new array of a size of the combined lengths of the input arrays

        int inArray1Position = 0; //initialise pointer variables
        int inArray2Position = 0;
        int mergedPosition = 0;

        while(inArray1Position < inArray1Length && inArray2Position < inArray2Length) { // While pointer 1 is still within first array and pointer 2 is still within second array
            if (inArray1[inArray1Position] < inArray2[inArray2Position]) { // Check pointer 1 is less than pointer 2
                outArray[mergedPosition++] = inArray1[inArray1Position++]; // Assign mergedPosition in outArray to the pointer 1 position from array 1, THEN add one to both the merged pointer and the array 1 pointer
            } else {
                outArray[mergedPosition++] = inArray2[inArray2Position++]; // else do the same assignment but using the pointer 2 position from array 2
            }
        }
        //These deal with out-of-bounds exceptions and then just add the remaining elements to the outArray, this works because once one array is empty the remaining values in the other array must be larger, so they can be added on the end
        while (inArray1Position < inArray1Length) {
            outArray[mergedPosition++] = inArray1[inArray1Position++];
        }

        while (inArray2Position < inArray2Length) {
            outArray[mergedPosition++] = inArray2[inArray2Position++];
        }

        return outArray;
    }
}