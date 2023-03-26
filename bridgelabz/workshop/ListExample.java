package com.bridgelabz.workshop;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Anshul");
        friends.add("Palvinder");
        friends.add("Arvind");
        friends.add("Vipin");
        System.out.println(friends);

        char[] chars = {'A', 's', 'I', 'o', 'U', 'H', 'E'};
        ListExample match = new ListExample();
        match.countCharacter(String.valueOf(friends), chars);
    }

    private void countCharacter(String friends, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < friends.length(); j++) {
                if (friends.charAt(j) == chars[i]) {
                    count++;
                }
            }
            System.out.println("Count for character " + chars[i] + " : " + count);
        }
    }
}
