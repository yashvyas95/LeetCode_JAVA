package com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> prime_list = new ArrayList<>();
        System.out.println("Enter Lower bound for prime number search");
        int input_Lower_bound = sc.nextInt();
        System.out.println("Enter Upper bound for prime number search");
        int input_Upper_bound = sc.nextInt();
        if (input_Upper_bound < 0 || input_Lower_bound < 0 || input_Lower_bound > input_Upper_bound) {
            System.out.println("Invalid inputs please enter numbers greater than 0 for both");
        } else {
            for (int i = input_Lower_bound; i < input_Upper_bound; i++) {
                if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13) {
                    prime_list.add(i);
                } else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && (i % 11) != 0 && i % 13 != 0) {
                    prime_list.add(i);
                }
            }
        }
        for (int i = 0; i < prime_list.size(); i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(prime_list.get(i) + "\t");

        }
    }
}
