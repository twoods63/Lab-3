package com.lab3;

import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        new Quiz();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do?\n1. Add a question to the quiz\n2. Remove a question from the quiz\n3. Modify a question in the quiz\n4. Take the quiz\n5. Quit");
            int choice = sc.nextInt();
            if (choice == 1) {
                Quiz.add_question();
            }
            if (choice == 2) {
                Quiz.remove_question();
            }
            if (choice == 3) {
                Quiz.modify_question();
            }
            if (choice == 4) {
                Quiz.give_quiz();
            }
            if (choice == 5) {
                break;
            }
        }
    }
}