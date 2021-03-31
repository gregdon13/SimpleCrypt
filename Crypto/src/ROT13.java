import java.util.function.Consumer;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    int rotate;

    ROT13(Character cs, Character cf) {
        rotate = cf - cs;
    }

    ROT13() {
        rotate = 13;
    }

    public String crypt(String text) throws UnsupportedOperationException {
        return encrypt(text, rotate);
    }

    public String encrypt(String text) {
        return encrypt(text, rotate);
    }

    public String encrypt(String text, int val) {
        String output = "";
        for (char c : text.toCharArray()) {
            int count = 0;
            int charVal = c;
            if (Character.isLetter(c)) {
                while (count < val) {
                    charVal++;
                    count++;
                    if (charVal == 91) {
                        charVal = 65;
                    } else if (charVal == 123) {
                        charVal = 97;
                    }
                }
            }
            output += (char) charVal;
        }
        return output;
    }

    public String decrypt(String text) {
        return encrypt(text);
    }

    public static String rotate(String s, Character c) {
        if (c == s.charAt(0)) {
            return s;
        }
        String output = "";
        int diff = s.indexOf(c);
        for (int i = diff; i != diff - 1; i++) {
            output += s.charAt(i);
            if (i == s.length()-1) {
                i = -1;
            }
        }
        output += s.charAt(diff-1);
        return output;
    }

}
