import java.io.*;
import java.util.*;

public class LeapYear {
	
	public static void main (String args[]) {
		
		int year = 2001;
		System.out.println (year + ": Leap Year = "+ checkLeapYear(year));
		
	}
	
	public static boolean checkLeapYear (int year) {
			return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
	}
}