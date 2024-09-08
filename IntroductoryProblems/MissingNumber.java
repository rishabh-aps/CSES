package IntroductoryProblems;

import java.util.Scanner;

/**
 * MissingNumber
 */
public class MissingNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long sum = 0;
    for (int i = 0; i < n - 1; i++) {
      long x = sc.nextLong();
      sum += x;
    }
    long ans = (n * (n + 1) / 2) - sum;
    System.out.println(ans);
    sc.close();
  }
}