package Life;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leaders {
    public static void main(String[] args) {
        Set<String> leaders = new HashSet<>(Arrays.asList("Москва", "Новосибирск", "Кукуево", "Тольятти", "Самара", "Белгород"));
        System.out.println("Leaders = " + leaders);
    }
}
