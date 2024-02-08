package com.lakshx;

import java.util.Scanner;

public class FizzBuzz {
    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        byte number = scanner.nextByte();

            if (number % 3 == 0 && number % 5 ==0)
                System.out.println("FizzBuzz");
            else if (number % 3 == 0)
                System.out.println("Fizz");
            else if (number % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(number);
    }
}
