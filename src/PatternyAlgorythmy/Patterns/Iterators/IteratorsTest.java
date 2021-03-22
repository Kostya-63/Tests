package PatternyAlgorythmy.Patterns.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorsTest {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
        Iterator<Integer> integerIterator = numbers.iterator();
        numbers.add(10);
        List<Integer> result = new LinkedList<>();
        integerIterator.forEachRemaining(result::add);

        assert(result.equals(new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8})));       //true

        Iterator<Integer> iterator2 = numbers.iterator();
        List<Integer> result2 = new LinkedList<>();
        iterator2.forEachRemaining(result2::add);

        assert(result2.equals(new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8, 10})));  //true


        /////////////////////////////////////////////////////////////


        List<String> cities = new ArrayList<>();
        cities.add("Warsaw");
        cities.add("Prague");
        cities.add("Budapest");

        Iterator<String> citiesIterator = cities.iterator();
        citiesIterator.next();
        cities.remove(1);
        citiesIterator.next();   //ConcurrentModificationException

    }
}
