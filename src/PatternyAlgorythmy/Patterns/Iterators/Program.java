package PatternyAlgorythmy.Patterns.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            states.clear();
        }
    }
}
