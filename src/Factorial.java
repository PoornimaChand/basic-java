
public class Factorial {
  
  
    public static void main(String args[]) {
      
        //quick wasy to reverse String in Java - Use StringBuffer
        int number = 3;
        int factorial = factorial (number);
        System.out.println ("Factorial of "+number+" is "+factorial);
      
    }   
  
  
    public static int factorial(int number){

        int factorial=1;
        for(int i = 1; i<=number; i++){
            factorial = factorial * i;
        }
      
        return factorial;
    }
    
}

