package gr11review.part1;
import java.io.*;

/**
 * This is my native java review1, coverting month to days
 * @author: Zyaire, Qu
 */    
public class Review1{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    //state my vars
    int month;
    int days;
    int monthDays = 0;
    int count;
    int output;

    //ask for the vars
    System.out.print("Enter the month number: ");
    month = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    days = Integer.parseInt(key.readLine());
    
    for loop to add the monthdays together
    for (count = 1; count < month; count++){
      if (count == 2){
        monthDays += 28;
      }else if (count == 4 || count == 6 || count == 9 || count == 11){
        monthDays += 30;
      }else{
        monthDays += 31;
      }
    }

    //add them to get the output
    output = days + monthDays;
    System.out.println(output);
    
  }
}
