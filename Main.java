import java.util.Scanner;
/**
 *This program will ask the user for the size of a line. It will then print to the screen the alternating text "black" and "White" the number of times that the user entered
 * @author Khazina Qureshi
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user to enter the length of the line
    System.out.println("Please enter the length of the line:");

    //Store userinput as variable
    int length = input.nextInt();

    //Create the for loop to loop the users number through the modulus operation 
    for (int i = 1; i <= length; i++){
      if (i%2==0){
        //if odd print white
        i = i;
        System.out.print("white,");
      }
        //else print black 
      else { i = i;
        System.out.print("black,");}
    }
  }
}
