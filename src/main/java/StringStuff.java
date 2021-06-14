import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringStuff {
  public static void testing(){
    System.out.println("Please enter something!");
    Scanner sc = new Scanner (System.in);
    String input = sc.nextLine();
    System.out.printf("You entered %s\n", input);
    if (StringUtils.isNumeric(input)){
      System.out.println(input + " is a number.");
    } else {
      System.out.println(input + " is NOT a number.");
    }
    System.out.println("Flipped case : " + StringUtils.swapCase(input));
    System.out.println("Reversed: " + StringUtils.reverse(input));


  }

  public static void main(String[] args) {
    testing();
  }
}
