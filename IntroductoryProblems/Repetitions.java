package IntroductoryProblems;

import java.util.Scanner;

public class Repetitions {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    solve(str);
  }

  public static void solve(String str) {
    int currentLongest = 1;
    int longestSoFar = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        currentLongest++;
      } else {
        longestSoFar = Math.max(longestSoFar, currentLongest);
        currentLongest = 1;
      }
    }
    longestSoFar = Math.max(longestSoFar, currentLongest);
    System.out.println(longestSoFar);
  }
}
