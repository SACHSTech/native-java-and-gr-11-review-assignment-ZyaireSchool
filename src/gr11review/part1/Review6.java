package gr11review.part1;
import java.io.*;
import java.text.*;

public class Review6{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");
	    
	  int itemNum;
	  double Price = 1;
	  double subtotal = 0;
	  double tax;
	  double total;

	  while (Price != 0){
	    System.out.print("Enter the price for an item: ");
	    Price = Double.parseDouble(key.readLine());
	    subtotal += Price;
      }   
	  
	  tax = subtotal * 0.13;  
	  total = tax + subtotal;

	  System.out.println("Subtotal: $" + numberFormat.format(subtotal));
    System.out.println("Tax: $" + numberFormat.format(tax));
    System.out.println("Total: $" + numberFormat.format(total));
  }
}