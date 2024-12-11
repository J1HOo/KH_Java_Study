package com.kh.testEx.test3pre;

import java.util.HashMap;

public class StudentScoreManager {
    public static void main(String[] args) {

        // 학생 이름 key, 점수 value
        HashMap<String, Integer> studentMap = new HashMap<>();

        // 더미데이터
        studentMap.put("김철수", 85);
        studentMap.put("이영희", 92);
        studentMap.put("박민수", 77);
        studentMap.put("최수잔", 88);

        // 학생 정보
        studentInfo(studentMap);

        // 점수 수정
        System.out.println("=== 점수 수정 ===");
        updateScore(studentMap, "박민수", 82);
    }

    // 학생 정보
    private static void studentInfo(HashMap<String, Integer> studentMap) {
        for (String name : studentMap.keySet()) {
            int score = studentMap.get(name);
            System.out.println(name + " : " + score) ;
            System.out.println(name + " : " + (score >= 80 ? "합격" : "불합격"));
        }
    }

    // 점수 수정
    private static void updateScore(HashMap<String, Integer> studentMap, String name, int editScore) {
        if (studentMap.containsKey(name)) {
            studentMap.put(name, editScore);
            int score = studentMap.get(name);
            System.out.println(name + " " + editScore + "로 수정");
            System.out.println(name + " : " + score + "  " + (score >= 80 ? "합격" : "불합격"));
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }
    }
}
