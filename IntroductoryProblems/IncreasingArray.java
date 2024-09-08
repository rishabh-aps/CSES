package IntroductoryProblems;

import java.util.Scanner;

public class IncreasingArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    scanner.close();
    solve(arr, n);
  }

  public static void solve(int[] arr, int n) {
    long totalCount = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i - 1] > arr[i]) {
        totalCount += (arr[i - 1] - arr[i]);
        arr[i] = arr[i - 1];
      }
    }
    System.out.println(totalCount);
  }
}
