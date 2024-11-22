package com.kh.oop.constructorPre;

public class Lotto {
    private int[] lotto = new int[6];

    // 기본 생성자
    public Lotto() {

    }

    // 6자리 숫자 + 1 보너스 숫자
    public void randomNumber() {
        // 6개가 맞는지 갯수 세는 count
        int count = 0;
        // 6자리 돌리기
        while (count < 6) {
            //Math.random() * 45 : 0 ~ 44 이므로 + 1을 해줌으로써 1 ~ 45가 출력되도록 설정
            // double -> int 실수 부분 자동 버림 처리
            int num = (int)(Math.random() * 45) + 1;
            boolean 중복확인 = false;

            // 중복 확인
            // count : 현재까지 저장된 유효한 번호의 개수
            // 새로 만들어진 번호가 이미 만들어진 번호와 중복인지 체크
            // lotto[i]를 통해 이미 채워진 배열 속 숫자들만 비교
            for (int i = 0; i < count; i++) {
               if (lotto[i] == num) {
                   중복확인 = true;
                   break; // 기존에 있는 수와 랜덤으로 나온 수가 동일함으로 다시 생성하도록 돌려보냄
               }
            }
            // 중복이 없을 경우 배열에 추가
            if (!중복확인) {
                lotto[count] = num;
                count++;
            }
        }
    }
    // 만약 로또번호가 생성이 모두 완료 됐다면 번호 확인
    public void info() {
        if (lotto == null) {
            System.out.println("로또 번호가 생성되지 않았습니다.");
            return;
        }
        System.out.println("로또 번호 확인하기 : ");
        for (int i = 0; i < 6; i++) { // 각 배열에 0 ~ 5 자리에 
            System.out.print(lotto[i] + " ");
        }
    }
}
