package gr11review.part1;
import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{

    int count;
    int countt;//i found that i should use 2 counts or this thing will be like "ohhh urrr wrongggg"
    //modulus to see if there is odd num
    for(count = 20; count < 100; count++){
      if(count % 2 > 0){
        System.out.println(count);
      }
    }
    
    System.out.println(" ");
    //her to count down use for loop 
    for (countt = 29; countt >= 2; countt--){
        System.out.println(count);
    }

  }
}