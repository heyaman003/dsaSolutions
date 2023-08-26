package heyStrings;

import java.util.*;

public class Main {

    public static String getTown(String[] peopleNames) {
        Arrays.sort(peopleNames, (a, b) -> b.length() - a.length());

        String prefix = peopleNames[0];
        int length = prefix.length();
        while (length > 0) {
            boolean valid = true;
            for (int i = 1; i < peopleNames.length; i++) {
                if (!peopleNames[i].toLowerCase().contains(prefix.toLowerCase())) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return prefix;
            }
            length--;
            prefix = prefix.substring(0, length);
        }
        return "";
    }

    public static void main(String[] args) {
        String[] peopleNames = {"aman","","","vgctg"};
        System.out.println(getTown(peopleNames));
    }
}
