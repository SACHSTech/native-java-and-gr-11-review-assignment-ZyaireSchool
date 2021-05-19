package gr11review.part1;
import java.io.*;
import java.text.*;

/**
 * This is my native java review6, clculate price of items directly
 * @author: Zyaire, Qu
 */  
public class Review6{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");//formatting decemals
	  //here is the vars
	  int itemNum;
	  double Price = 1;
	  double subtotal = 0;
	  double tax;
	  double total;

	  while (Price != 0){// here to get the items from the user
	    System.out.print("Enter the price for an item: ");
	    Price = Double.parseDouble(key.readLine());
	    subtotal += Price;
      }   
	  
	  tax = subtotal * 0.13; // tax and total calc 
	  total = tax + subtotal;

	  System.out.println("Subtotal: $" + numberFormat.format(subtotal));
    System.out.println("Tax: $" + numberFormat.format(tax));
    System.out.println("Total: $" + numberFormat.format(total));
  }
}