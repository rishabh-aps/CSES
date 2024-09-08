package IntroductoryProblems;

import java.util.Scanner;

public class Permutations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    solve(n);
  }

  public static void solve(int n) {

    if (n == 2 || n == 3) {
      System.out.println("NO SOLUTION");
      return;
    }

    StringBuilder even = new StringBuilder();
    StringBuilder odd = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        even.append(i).append(" ");
      } else {
        odd.append(i).append(" ");
      }
    }
    System.out.print(even);
    System.out.println(odd);
  }
}
