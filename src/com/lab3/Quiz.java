package com.lab3;

import java.util.ArrayList;
import java.util.*;
public class Quiz {
    static ArrayList<Question> l = new ArrayList<>();
    static int correct = 0;
    public static void add_question() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the question Text?");
        String question = sc.nextLine();
        System.out.println("What is the answer?");
       String answer = sc.nextLine();
        System.out.println("How Difficult (1-3)?");
        int difficulty = sc.nextInt();
        sc.nextLine();
        l.add(new Question(question, answer, difficulty));
    }
    public static void remove_question() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the question to remove? ");
        for(int i = 0; i < l.size(); i++) {
            System.out.println(i + ". " + l.get(i).getQuestion());
        }
        int n = sc.nextInt();
        sc.nextLine();
        l.remove(n);
    }
    public static void modify_question() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the question to modify?");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + ". " + l.get(i).getQuestion());
        }
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the question Text?");
        String question = sc.nextLine();
        System.out.println("What is the answer?");
        String answer = sc.nextLine();
        System.out.println("How Difficult (1-3)?");
        int difficulty = sc.nextInt();
        sc.nextLine();
        l.get(n).setQuestion(question);
        l.get(n).setAnswer(answer);
        l.get(n).setDifficulty(difficulty);
    }
    public static void give_quiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getQuestion());
            String ans = sc.nextLine();
            if (l.get(i).getAnswer().equals(ans)) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got " + correct + " out of " + (l.size()));
    }
}
