package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray() {
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        // TODO: 1. Arrays.toString 이용해서 arr1, arr2 출력
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        // TODO: 2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("오름차순 정렬 " + Arrays.toString(arr1));

        // TODO: 3. arr1 안의 모든 값을 500으로 변경
        Arrays.fill(arr1, 500);
        System.out.println("모든 값을 500으로 " + Arrays.toString(arr1));

        // TODO: 4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 값 출력
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println("값이 일치하는가 " + areEqual);
    }

    public void int2DArray() {
        String[] arr1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 = {"apple", "banana", "cherry", "date", "elderberry"};

        // TODO: 1. Arrays.toString 이용해서 arr1, arr2 출력
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        // TODO: 2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("오름차순 정렬 " + Arrays.toString(arr1));

        // TODO: 3. arr1 안의 모든 값을 mango로 변경
        Arrays.fill(arr1, "mango");
        System.out.println("모든 값을 mango로  " + Arrays.toString(arr1));

        // TODO: 4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 값 출력
        boolean equal = Arrays.equals(arr1, arr2);
        System.out.println("값이 일치하는가 " + equal);
    }

    public static void main(String[] args) {
        ArraysPre ap = new ArraysPre();
        ap.int1DArray();
        ap.int2DArray();
    }
}

