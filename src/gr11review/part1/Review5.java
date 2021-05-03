package gr11review.part1;
import java.io.*;
public class Review5{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int year = 0;
	  double investAmt;
	  double intrestRate;
	  double targetAmt;
	  double totalAmt = 0;

	  System.out.print("Enter the yearly invested amount: ");
	  investAmt = Double.parseDouble(key.readLine());

	  System.out.print("Enter the compound interest rate: ");
	  intrestRate = Double.parseDouble(key.readLine());

	  System.out.print("Enter the target amount: ");
	  targetAmt = Double.parseDouble(key.readLine());
	    
	  while (totalAmt < targetAmt){
	    totalAmt += investAmt;
	    totalAmt += (totalAmt * (intrestRate / 100));
	    year++;
	  }

	  System.out.println("The target amount will be earned in " + year + " years.");
  }
}