package problem1;

import java.util.Scanner;

public class Sales {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the total number of salesmen : ");
    final int SALESPEOPLE = scan.nextInt();
    int[] sales = new int[SALESPEOPLE];
    int sum;
    for (int i = 0; i < sales.length; i++) {
      System.out.print("Enter sales for salesperson " + i + ": ");
      sales[i] = scan.nextInt();
    }
    System.out.println("\nSalesperson Sales");
    System.out.println("--------------------");
    sum = 0;
    for (int i = 0; i < sales.length; i++) {
      System.out.println(" " + (i + 1) + " " + sales[i]);
      sum += sales[i];
    }
    System.out.println("\nTotal sales: " + sum);

    // Computing the average sales
    double average = (double) sum / SALESPEOPLE;
    System.out.println("Average sale :" + average);

    // Computign the best sale

    int maxID = 0;
    int maxSale = 0;

    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > maxSale) {
        maxID = i;
        maxSale = sales[i];
      }
    }

    System.out.println("The salesman with id " + maxID + " has the max sale " + maxSale + " $ !");

    // Computign the best sale

    int minID = 0;
    int minSale = Integer.MAX_VALUE;

    for (int i = 0; i < sales.length; i++) {
      if (sales[i] <= minSale) {
        minID = i;
        minSale = sales[i];
      }
    }

    System.out.println("The salesman with id " + minID + " has the min sale " + minSale + " $ !");

    // Priting salesman with bigger value than the one given

    System.out.print("Enter a value : ");
    int value = scan.nextInt();
    int count = 0;

    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > value) {
        count++;
        System.out.println(i + " " + sales[i]);
      }
    }

    System.out.println(count + "salesmen exceeded the value you have given !");
  }
}

