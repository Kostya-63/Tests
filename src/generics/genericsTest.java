package generics;

import java.util.ArrayList;
import java.util.List;

public class genericsTest {
    public static void main(String[] args) {
        ArrayList<String> genericArrayList = new ArrayList<>();
        ArrayList arrayList = new ArrayList();

        arrayList = genericArrayList; // Ok
        arrayList.add(1); //unchecked call, error

        genericArrayList = arrayList; // Unchecked assignment

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);

        List<? super Double> nums = new ArrayList<>();
        Double dub = 2.89;

        nums.add(dub);
        dub = 2.999;
        nums.set(0, dub);
        System.out.println(nums.get(0));

        List dubles = nums;
        dubles.get(0);

        ArrayList<String> strings = new ArrayList<>(); // parameterized type

        ArrayList arrayList2 = new ArrayList(); // raw type
        arrayList = strings; // Ok
        strings = arrayList2; // Unchecked assignment (назначение)
        arrayList2.add(1);
        System.out.println(arrayList2.get(0));
    }
}
