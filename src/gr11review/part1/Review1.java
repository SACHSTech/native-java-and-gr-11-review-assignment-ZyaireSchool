package gr11review.part1;
import java.io.*;

public class Review1{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int month;
    int days;
    int monthDays = 0;
    int count;
    int output;

    System.out.print("Enter the month number: ");
    month = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    days = Integer.parseInt(key.readLine());
    
    for (count = 1; count < month; count++){
      if (count == 2){
        monthDays += 28;
      }else if (count == 4 || count == 6 || count == 9 || count == 11){
        monthDays += 30;
      }else{
        monthDays += 31;
      }
    }

    output = days + monthDays;
    System.out.println(output);
    
  }
}
