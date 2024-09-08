package IntroductoryProblems;

import java.util.Scanner;

/**
 * WeirdAlgorithm
 */
public class WeirdAlgorithm {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    solve(n);
  }

  private static void solve(long n) {
    while (n != 1) {
      System.out.print(n + " ");
      if (n % 2 == 1) {
        n = n * 3 + 1;
      } else {
        n /= 2;
      }
    }
    System.out.print(n);
  }
}