package com.kh.example.practice7.model.vo;

public class StudentRun {
    public static void main(String[] args) {
        StudentController controller = new StudentController();


        System.out.println("\n =========== 학생 정보 출력 ===========");
        for (Student student : controller.printStudent()) {
            System.out.println(student);
        }

        System.out.println("\n =========== 학생 성적 출력 ===========");
        double[] scores = controller.avgScore();
        System.out.println("학생 점수 합계 : " + scores[0]);
        System.out.println("학생 점수 평균 : " + scores[1]);


        System.out.println("\n =========== 성적 결과 출력 ===========");
        controller.printResult();
    }
}
