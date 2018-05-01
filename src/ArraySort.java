import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class ArraySort {
  public static void main(String[] args) {
    int unsortedArray[]= {5, 6, 1, 4, 2};
    System.out.println("Unsorted Array");
    for (int u : unsortedArray){
      System.out.println(u);
    }
    System.out.println("Sorted Array");
    for (int s : sortArray(unsortedArray)){
      System.out.println(s);
    }
  }
  public static int [] sortArray(int [] unsortedArray){
    int sortedArray[]= unsortedArray;
    for (int j=0; j<sortedArray.length-1; j++){
      for (int i=0; i<sortedArray.length-1; i++){
        int temp;
        if (sortedArray[i]>sortedArray[i+1]){
            temp=sortedArray[i];
            sortedArray[i]=sortedArray[i+1];
            sortedArray[i+1]=temp;
        }
      }
    }
    return sortedArray;
  }
}


/* 
Your previous Plain Text content is preserved below:

This is a sandbox to experiment with CoderPad's execution capabilities.
It's a temporary, throw-away session only visible to you.

This is just a simple shared plaintext pad, with no execution capabilities.

When you know what language you'd like to use for your interview,
simply choose it from the dropdown in the top bar.

You can also change the default language your pads are created with
in your account settings: https://coderpad.io/settings

Enjoy your interview!

 */