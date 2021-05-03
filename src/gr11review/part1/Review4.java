package gr11review.part1;
import java.io.*;
import java.text.*;

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    NumberFormat numberFormat = new DecimalFormat("#,##0.00");
    
    int items;
    int count;
    double subtotal = 0;
    double tax;
    double total;
    double itemPrice;

    System.out.print("How many items do you want to buy? ");
    items = Integer.parseInt(key.readLine());
  
    for (count = 1; count <= items; count++){
      System.out.print("Enter the price for item " + count + ": ");
      itemPrice = Double.parseDouble(key.readLine());
      subtotal += itemPrice;
    }
    tax = subtotal * 0.13;
    //numberFormat.format(tax);
    total = subtotal + tax;
    
    System.out.println("Subtotal: $" + numberFormat.format(subtotal));
    System.out.println("Tax: $" + numberFormat.format(tax));
    System.out.println("Total: $" + numberFormat.format(total));
  }
}