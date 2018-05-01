import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
class BasicStructures {
  public static void main(String[] args) {
    int i=0;
    System.out.println ("Integer:"+i);
    double f= 1.2;
    System.out.println("Float:"+f);
    String s="Hello World!";
    System.out.println("String:"+s);
    char c='c';
    System.out.println("Char:"+c);
    int intArray[] = new int[5];
    intArray[0]=1;
    intArray[1]=2;
    for (int j=0; j<intArray.length; j++){
      System.out.println("Array integer:"+intArray[j]);
    }
    String strArray[] = {"Hello World!", "This is a string array"};
    for(String str : strArray) {
    		System.out.println("Array String:"+str);
    }
    int multiArray[][] = {{1,1},{2,4},{3,9}};
    for (int[] m: multiArray) {
    		for (int k :m) {
    			System.out.println("Array multidimensional"+k);
    		}
    }
    ArrayList<String> al= new ArrayList<String>();
    al.add("Hello World!");
    al.add("This is an ArrayList String");
    for (String s1: al) {
    		System.out.println(s1);
    }
    System.out.println(al.get(0));
    List<String> l=new ArrayList<String>();
    l.add("Hello World");
    l.add("This is a List String");
    for (String ls: l) {
    		System.out.println(ls);
    }
   System.out.println(l.get(1));
   HashMap<Integer,String> hm=new HashMap<Integer, String>();
   hm.put(1, "Hello World");
   hm.put(2,"This is a HashMap - Integer, String");
   for (int m=1; m<=hm.size(); m++) {
	   System.out.println("Value of "+m+":"+hm.get(m));
   }
   System.out.println(hm);
   Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
   ht.put(1, 3);
   ht.put(2, 5);
   System.out.println(ht);
  }
}