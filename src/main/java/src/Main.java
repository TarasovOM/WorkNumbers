package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();
        List<Integer> intList3 = new ArrayList<>();
        List<Integer> intList4 = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++)
            if (intList.get(i) > 0)
                intList2.add(intList.get(i));
        System.out.println(intList2);

        for (int i = 0; i < intList2.size(); i++)
            if (intList2.get(i) % 2 == 0)
                intList3.add(intList2.get(i));
        System.out.println(intList3);

        intList3.sort(Comparator.naturalOrder());
        System.out.println(intList3);
    }
}