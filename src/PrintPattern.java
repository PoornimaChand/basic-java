import java.io.*;
import java.util.*;

public class PrintPattern {
	public static void main (String args[]){
		String stars="*";
		for (int i=0; i <10; i++) {
			
			System.out.println(stars);
			stars=stars+"*";
		}
	
	}
}