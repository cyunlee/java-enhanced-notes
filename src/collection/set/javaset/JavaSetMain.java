package collection.set.javaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

//iterator.hasNext() : 다음 데이터가 있는 지 확인한다.
//iterator.next() : 다음 데이터를 반환한다.
//HashSet : 입력한 순서를 보장하지 않는다.
//LinkedHashSet : 입력한 순서를 정확히 보장한다.
//TreeSet : 데이터 값을 기준으로 정렬한다.
