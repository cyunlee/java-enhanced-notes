package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        // 4번 반복 O(n)
        for (Integer inputValue : inputArray) {
            if(inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}

// 데이터의 값과 데이터의 인덱스를 일치시킨다면, 값을 찾는 연산이 O(1)로 된다.