// Floyd-Warshall Algorithm
// Assignment 4: Airline Fare Distance Mapping

import java.util.Scanner;

class FloydWarshall {
    static final int INF = 9999;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];

        System.out.println("Enter cost matrix:");
        System.out.println("Use 9999 for no path");

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Floyd-Warshall Logic
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][k] + a[k][j] < a[i][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }

        // Output
        System.out.println("\nShortest Distance Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nTime Complexity = O(n^3)");
        sc.close();
    }
}
