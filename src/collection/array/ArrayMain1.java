package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for(int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]" + arr[i]);
            if(arr[i]==value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}

// 배열에서 인덱스를 갖고 처리하는 행위는 굉장히 빠르게 일어난다.
// 인덱스를 이용한 입력, 변경, 조회의 경우 매우 빠르다.
// 배열의 인덱스를 이용하면 단 한번의 연산으로 바로 데이터를 가져올 수 있다.
// 하지만 배열 내에서 검색을 할 경우에는 하나하나 비교해야 한다.
