package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100,"홍길동","영업부","과장",25,'남', 2500000, 0.05, "010-1234-5678","서울시 강남구");
        System.out.println(employee1);


        Employee employee2 = new Employee();
        employee2.setEmpNo(100);
        employee2.setEmpName("홍길동");
        employee2.setDept("영업부");
        employee2.setJob("과장");
        employee2.setAge(25);
        employee2.setGender('남');
        employee2.setSalary(2500000);
        employee2.setBonusPoint(0.05);
        employee2.setPhone("010-1234-5678");
        employee2.setAddress("서울시 강남구");

        System.out.println("empNo : " + employee2.getEmpNo());
        System.out.println("empName : " + employee2.getEmpName());
        System.out.println("dept : " + employee2.getDept());
        System.out.println("job : " + employee2.getJob());
        System.out.println("age : " + employee2.getAge());
        System.out.println("gender : " + employee2.getGender());
        System.out.println("salary : " + employee2.getSalary());
        System.out.println("bonusPoint : " + employee2.getBonusPoint());
        System.out.println("phone : " + employee2.getPhone());
        System.out.println("address : " + employee2.getAddress());
    }
}