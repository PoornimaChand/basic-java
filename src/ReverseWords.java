

import java.util.Arrays;
import java.util.List;
public class ReverseWords {
  
  
    public static void main(String args[]) {
      
 
        String sentence = "Hello World";
        String newSentence="";
        List< String> words = Arrays.asList(sentence.split("\\s"));
        
       System.out.println("Original Sentence : "+ sentence);
        
        for (int i=words.size()-1; i>=0; i--) {
    			newSentence=newSentence+words.get(i)+" "; 
        }

        		System.out.println ("New Sentence= "+newSentence);      		   
    }   
}

