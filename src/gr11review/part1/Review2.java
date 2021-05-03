package gr11review.part1;
import java.io.*;

public class Review2{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int option;

    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.print("Choose a menu option: ");

    option = Integer.parseInt(key.readLine());

    switch(option){
      case 0:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
      case 1:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
      case 2:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
      case 3:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
      default:
      System.out.println("Invalid menu option");
    }
  }
}