package String;

import java.util.StringJoiner;

public class internTest {
    public static void main(String[] args) {
        String q = "I'm";
        String w = "I'm";
        String r = new String("I'm");
        String t = r.intern();
        System.out.println("q==w: " + (q == w));
        System.out.println("q==r: " + (q == r));
        System.out.println("q==t: " + (q == t));

        StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
        for (String s : "Hello the brave world".split(" ")) {
            joiner.add(s);
        }
        System.out.println(joiner);
    }
}
