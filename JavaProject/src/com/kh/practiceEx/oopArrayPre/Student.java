package com.kh.practiceEx.oopArrayPre;

public class Student {
    // 멤버변수 전역변수 인스턴스 필드 속성 필드
    private String name;
    private  int age;
    private String idCard;

    // 기본 생성자 : 객체를 생성할 때 필수로 작성 해야 하는 파라미터를 생성하지 않는 생성자
    public Student() {}

    // 필수 생성자 : 파라미터를 메서드를 사용해 한 번에 저장하는 방법, 주로 필수 작성 사항이 있는 회원가입 등에서 사용
    public Student(String name, int age/* , String idCard */) {
        this.name = name;
        this.age = age;
//        this.idCard = idCard; 만들고 싶은 학생만 만들도록 필수에서 제외
    }

    // Setter 하나씩 값을 체크하고 객체를 생성해 값을 저장하는 방법, 주로 선택사항이나 암호화 처리가 필요한 값 등에서 사용
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    // Getter DB의 저장된 값을 프론트에 전달 반환
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getIdCard() {
        return idCard;
    }


}
