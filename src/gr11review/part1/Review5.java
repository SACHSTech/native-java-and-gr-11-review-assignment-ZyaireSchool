package gr11review.part1;
import java.io.*;

/**
 * This is my native java review5, calculate the invenstment thing
 * @author: Zyaire, Qu
 */  
public class Review5{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    //vars
    int year = 0;
	  double investAmt;
	  double intrestRate;
	  double targetAmt;
	  double totalAmt = 0;

	  System.out.print("Enter the yearly invested amount: ");//invest amount get
	  investAmt = Double.parseDouble(key.readLine());

	  System.out.print("Enter the compound interest rate: ");//rate get
	  intrestRate = Double.parseDouble(key.readLine());

	  System.out.print("Enter the target amount: ");//target get
	  targetAmt = Double.parseDouble(key.readLine());
	    
	  while (totalAmt < targetAmt){//here to get the year
	    totalAmt += investAmt;
	    totalAmt += (totalAmt * (intrestRate / 100));
	    year++;
	  }

	  System.out.println("The target amount will be earned in " + year + " years.");
  }
}