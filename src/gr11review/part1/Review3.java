package gr11review.part1;
import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{

    int count;

    for(count = 20; count < 100; count++){
      if(count % 2 > 0){
        System.out.println(count);
      }
    }
    
    System.out.println(" ");
    
    for (count = 29; count >= 2; count--){
        System.out.println(count);
    }

  }
}