import java.io.*;
import java.util.*;

public class GCD{
	public static void main (String args[]) {
		int number1=6, number2=33;
		System.out.println("GCD of "+number1+" & "+number2+ " is"+findGCD(number1, number2));
	}
	public static int findGCD(int number1, int number2) {
		int gcd=1, j=1;
		if (number1 >=number2)
			j=number2;
		else
			j=number1;
		for (int i=j; i>0; i--) {
			if (number1 % i==0 && number2 % i==0) {
				gcd=i;
				break;
			}
				
		}
		
		return gcd;
		
	}
}