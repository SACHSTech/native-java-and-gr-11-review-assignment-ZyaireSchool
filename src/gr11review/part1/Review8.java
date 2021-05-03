package gr11review.part1;
import java.io.*;

public class Review8{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    int count;//vars state
    int slot1;
	  int slot2;
	  int slot3;
	  int triple = 0;

	  for (count = 0; count < 1000; count++){// use for loop to print 1000 pulls for the thing
	    slot1 = (int)(Math.random()*8+1);//all random~
	    slot2 = (int)(Math.random()*8+1);
	    slot3 = (int)(Math.random()*8+1);
	      
	    if (slot1 == slot3 && slot2 == slot3){
	    	triple++;
		  }//see the amount of triples

	    System.out.print(slot1 + " ");
	    System.out.print(slot2 + " ");
	    System.out.println(slot3);
	    }
	    
	    System.out.println(triple);
  }
}