package com.kh.collectionEx.pack1.listPre;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListPre1 {

    public void method1() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("새우깡");
        list.add("맛동산");
        list.add("포카칩");
        list.add("고구마칩");
        list.add("고래밥");

        System.out.println(list);
        System.out.println(list.size());

        // 만약 index 1 자리에 허니버터칩을 넣고 싶다면
        list.add(1,"허니버터칩");

        System.out.println(list);

        // 특정 index 주소의 값 가져오기
        System.out.println(list.get(3));

        // 2번째 저장된 값을 망고과자로 변경
        list.set(2, "망고과자");
        System.out.println(list.get(2));

        // 특정 index 주소의 값 삭제
        list.remove(1);
        System.out.println(list);

        list.remove("포카칩");
        System.out.println(list);

        // contains (index 주소) 리스트에 찾는 값이 들어있는지 확인
        System.out.println(list.contains("망고과자")); // true
        System.out.println(list.contains("눈을감자")); // false

        // list 안의 모든 값 삭제
        list.clear();
        System.out.println(list.isEmpty()); //true

    }

    public void method2() {
        // ArrayList를 생성하여사과, 포도, 바나나, 망고를 저장하세요.
        ArrayList<String> list = new ArrayList<>();
        list.add("사과");
        list.add("포도");
        list.add("망고");
        list.add("바나나");

        // 과일 리스트의 두 번째 위치에 오렌지를 추가하세요.
        list.add(1, "오렌지");

        // 리스트에서 바나나 -> 파인애플로 변경하세요.
        list.set(3, "파인애플");

        // 리스트에서 첫 번째 과일을 삭제하세요.
        list.remove(0);

        // 리스트에서 망고를 삭제하세요.
        list.remove("망고");

        // 리스트에 사과가 남아있는지 확인하고 사과가 만약에 있다면 사과를 없애고 출력하세요.
        if (list.contains("사과") == true) {
            list.remove("사과");
            System.out.println(list);
        } else {
            System.out.println("사과가 리스트에 없습니다.");
        }

        // 리스트를 비우고, 리스트가 비어 있는지 확인하고 결과를 출력 하세요.
        list.clear();
        System.out.println("과일 바구니가 비었는가 " + list.isEmpty());

    }

    public void method3() {
        // 1. 숫자(int) 타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println(intList);

        // 2. 문자(char) 타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        System.out.println(charList);

        // 3. 논리(boolean) 타입 제한
        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        boolList.add(true);
        boolList.add(false);
        System.out.println(boolList);

        // 4. 실수(double) 타입 제한
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(3.14);
        System.out.println(doubleList);

    }

}
