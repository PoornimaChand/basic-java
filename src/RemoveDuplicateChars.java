import java.io.*;
import java.util.*;

public class RemoveDuplicateChars{	
	public static void main(String args[]) {
		String str1="Hello World!";
		String str2="World is big";
		System.out.println ("Original String 1 = "+str1);
		System.out.println ("String 1 without duplicate chars:"+removeDuplicates(str1));
		System.out.println ("Original String 2 = "+str2);
		System.out.println("String 2 - without duplicate chars:"+removeDuplicates(str2));
	}
	public static String removeDuplicates(String str) {
		String strNew="";
		boolean duplicate=false;
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if  (str.charAt(i)==str.charAt(j))
					//System.out.println(str.charAt(i));
					duplicate=true;
			
			}
			if(!duplicate)
				strNew=strNew+str.charAt(i);
			duplicate=false;
		}
		return strNew;
	}
}