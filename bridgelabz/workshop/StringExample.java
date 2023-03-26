package com.bridgelabz.workshop;

import java.util.Scanner;
public class StringExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String input = scanner.nextLine();
        char[] chars = {'A', 'e', 'I', 'O', 'u'};
        StringExample problem = new StringExample ();
        problem.countCharacter(input, chars);
    }
    private void countCharacter(String input, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == chars[i]) {
                    count++;
                }
            }
            System.out.println("Count for character " + chars[i] + " : " + count);
        }
    }
}
