package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();
        List<Integer> objects = List.of();
    }
}
