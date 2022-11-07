package com.pragra;

import java.util.Scanner;
public class loops {

public static void main(String[] args) {
        int number;
        int factorial =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        number = sc.nextInt();
        for (int counter = number; counter>0; counter--) {
        factorial = counter*factorial;
        }
    System.out.print(factorial);
        }
        }
