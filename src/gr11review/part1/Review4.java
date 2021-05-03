package gr11review.part1;
import java.io.*;
import java.text.*;

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    NumberFormat numberFormat = new DecimalFormat("#,##0.00");
    //state vars
    int items;
    int count;
    double subtotal = 0;
    double tax;
    double total;
    double itemPrice;

    System.out.print("How many items do you want to buy? ");//item num get
    items = Integer.parseInt(key.readLine());
  
    for (count = 1; count <= items; count++){//print the price for each
      System.out.print("Enter the price for item " + count + ": ");
      itemPrice = Double.parseDouble(key.readLine());
      subtotal += itemPrice;
    }
    tax = subtotal * 0.13;//tax calc
    //numberFormat.format(tax);
    total = subtotal + tax;//total calc
    
    System.out.println("Subtotal: $" + numberFormat.format(subtotal));
    System.out.println("Tax: $" + numberFormat.format(tax));
    System.out.println("Total: $" + numberFormat.format(total));
  }
}