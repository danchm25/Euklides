package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podać pierwsza liczbe: ");
        number1 = scanner.nextInt();
        System.out.println("Porsze podac drugą liczbe: ");
        number2 = scanner.nextInt();
        while (number2!= number1)
        {
            if(number2 > number1)
            {
                number2 = number2 - number1;
            }
            else

                number1 = number1 - number2;

        }
        System.out.println("Najwiekszym wspólnym dzielnikiem jest" + number2);

    }
}
