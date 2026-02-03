// write a program to replace all instance of characters c1 with character c2 and vice versa

import java.util.Scanner;

public class ReplaceLetters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // declare variables
    String word = "";
    char ch1;
    char ch2;

    // collect user inputs
    System.out.print("Enter word: ");
    word = input.next();

    System.out.print("Enter first character: ");
    ch1 = input.next().charAt(0);

    System.out.print("Enter second character: ");
    ch2 = input.next().charAt(0);

    // convert string to char array and loop to replace the characters
    char[] chars = word.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ch1) {
        chars[i] = ch2;
      } else if (chars[i] == ch2) {
        chars[i] = ch1;
      }
    }
    // print the new string
    System.out.println(chars);
    input.close();
  }
}