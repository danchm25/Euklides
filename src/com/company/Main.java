package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podać liczbe calkowitą (4-100): ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.println(i);
            }
        }

    }
}
