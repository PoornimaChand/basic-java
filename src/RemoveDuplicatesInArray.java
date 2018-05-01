
import java.util.Arrays;
public class RemoveDuplicatesInArray {
  
  
    public static void main(String args[]) {
      
 
        String [] array = {"a","b", "a","d", "d", "e"};
        for (int i=0; i<array.length; i++) {
    		System.out.println ("array["+i+"] = "+array[i]);      		
    }
        String [] reversedArray =  reverseArray (array);
        for (int i=0; i<reversedArray.length; i++) {
        		System.out.println ("newArray["+i+"] = "+reversedArray[i]);      		
        }
      
    }   
  
  
    public static String [] reverseArray(String [] array){
    		
    		String [] newArray = new String[array.length];
    		int check = 0; int newindex=0;
        for(int i = 0; i<array.length; i++){
            for (int j=0; j<newArray.length; j++) {
            		if (array[i].equals(newArray[j])) {
            	        check =1;
            		}

            }
            if (check == 0) {
				newArray[newindex] = array[i];
				newindex++;
            }
            check = 0;
        }
      
        return newArray;
    }
    
}

