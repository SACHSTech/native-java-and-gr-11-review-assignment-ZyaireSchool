package gr11review.part1;
import java.io.*;

public class Review2{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //state the var
    int option;

    //ask for the var
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.print("Choose a menu option: ");

    //give var value from the keyboard
    option = Integer.parseInt(key.readLine());
    
    //switch to decide the cases
    switch(option){
      case 0:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break; //use break here
      case 1:
      System.out.println("If someone with a lisp dropped a hammer on their foot, would they be Thor?");
      System.out.println("Hmmmmm");
      break;
      case 2:
      System.out.println("What is the opposite of Nautica clothing?");
      System.out.println("Ica clothing");
      break;
      case 3:
      System.out.println("Why did the teacher wear sunglasses?");
      System.out.println("Because his class was so bright!");
      break;
      default:
      System.out.println("Invalid menu option");
    }
  }
}