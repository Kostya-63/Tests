package Collections;

import java.util.Arrays;
import java.util.List;

public class LiastAsList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world");
        strings.add("!");            //Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(strings);
    }
}
