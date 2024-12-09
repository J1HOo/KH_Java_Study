package com.kh.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        // setter 를 이용해서 유저 저장
        // username 빈칸이거나 6글자 이상 저장 x return 시키기
        // email    빈칸이거나 30자 이상 작성 불가 return 시키기

        // Setter 이용
        // 변수에 담는 것이 아닌 직접적으로 데이터를 넣는 방식이므로 Getter 사용해서 정보 반환 가능
        User user1 = new User();
        user1.setUserName("홍길동");
        user1.setEmail("hong@hong.com");
        user1.setAge(10);

        User user2 = new User();

        System.out.println("이름을 입력하세요 : ");
        String inputName = sc.nextLine();
        if (inputName != null && inputName.length() <= 6) {
            System.out.println("성공적으로 기입 되었습니다.");
            user2.setUserName(inputName);
        } else {
            System.out.println("이름은 빈 값이거나 6글자 이상일 수 없습니다.");
            return;
        }

        System.out.println("이메일을 입력하세요 : ");
        String inputEmail = sc.nextLine();
        if (inputEmail != null && inputEmail.length() <= 30) {
            System.out.println("성공적으로 기입 되었습니다.");
            user2.setEmail(inputEmail);

        } else {
            System.out.println("이메일은 빈 값이거나 30글자 이상일 수 없습니다.");
            return;
        }

        System.out.println("나이를 입력하세요 : ");
        int inputAge = sc.nextInt();
        sc.nextLine();
        if (inputAge != 0) {
            System.out.println("성공적으로 기입 되었습니다.");
            user2.setAge(inputAge);

        } else {
            System.out.println("나이는 0일 수 없습니다.");
            return;
        }

        System.out.println("=== 저장된 사용자 정보 ===");
        // ArrayList 이용해서 정보 저장하고
        users.add(user1);
        users.add(user2);

        // toString 이용해서 저장된 사용자 정보 가져오기
        for (User user : users) {
            System.out.println(user);
        }
    }
}
