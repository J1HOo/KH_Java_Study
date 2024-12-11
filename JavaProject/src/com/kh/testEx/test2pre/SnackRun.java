package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRun {
    public static void main(String[] args) {

        Snack snack1 = new Snack("포테토칩", "짠맛", 1500);
        Snack snack2 = new Snack("초코파이", "단맛", 2000);
        Snack snack3 = new Snack("허니버터칩", "허니버터맛",2500);

        ArrayList<Snack> snackList = new ArrayList<Snack>();

        snackList.add(snack1);
        snackList.add(snack2);
        snackList.add(snack3);

//        for (int i = 0; i < snackList.size(); i++) {
//            System.out.println(snackList.get(i));
//        }

        for (Snack s : snackList) {
            System.out.println(s);
        }
    }
}
