import java.util.Scanner;

public class activity3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int first_num  = 0 , second_num = 0 ;
    int test_num;

    while (first_num >= second_num) {
      System.out.print("Enter first number: ");
      first_num = input.nextInt();
      System.out.print("Enter second number: ");
      second_num = input.nextInt();

      if(first_num >= second_num){
        System.err.println("error");
      }
    }

    System.out.println("Odd number between " + first_num + " and " + second_num);   

    test_num = first_num;

    while(test_num <= second_num){
      if(test_num % 2 != 0){
        System.out.print(" " + test_num);
      }
      test_num++;
    }

    System.out.println("\nEven number between " + first_num + " and " + second_num);   

    test_num = first_num;

    while(test_num <= second_num){
      if(test_num % 2 == 0){
        System.out.print(" " + test_num);
      }
      test_num++;
    }
    input.close();
  }
}
