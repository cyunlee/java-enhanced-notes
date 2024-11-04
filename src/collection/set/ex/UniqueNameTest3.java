package collection.set.ex;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);

        for(Integer s : set) {
            System.out.println(s);
        }
    }
}

//list를 만들 때 List.of를 권장한다.