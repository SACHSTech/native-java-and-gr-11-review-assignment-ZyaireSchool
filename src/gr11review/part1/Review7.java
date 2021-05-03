package gr11review.part1;
import java.io.*;
public class Review7{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    String sentence;
	  int count;
	  int characters;
	  int space = 0;  
	  int letterA = 0; 
	  String dash = ""; 

	  sentence = key.readLine();
	  characters = sentence.length();

	  for (count = 0; count < characters; count++){
	    char OneCharacter = sentence.charAt(count);
	    if(OneCharacter == ' '){
	    	space++;
	    }
	    if(OneCharacter == 'a'){
	    	letterA++;
	    }
	    if ((count+1) % 2 != 0){
	    	dash += "-";
	    }
	  }

	   System.out.println("There are " + characters + " characters in the sentence.");
	   System.out.println("There are " + space + " spaces in the sentence.");
	   System.out.println("There are " + letterA + " letter a in the sentence.");
	   System.out.println(dash);
  }
}