package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        // пользователь ввел число

        if (number % 3 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
