package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setEmpNo(100);
        employee.setEmpName("홍길동");
        employee.setDept("영업부");
        employee.setJob("과장");
        employee.setAge(25);
        employee.setGender('남');
        employee.setSalary(2500000);
        employee.setBonusPoint(0.05);
        employee.setPhone("010-1234-5678");
        employee.setAddress("서울시 강남구");

        System.out.println("empNo : " + employee.getEmpNo());
        System.out.println("empName : " + employee.getEmpName());
        System.out.println("dept : " + employee.getDept());
        System.out.println("job : " + employee.getJob());
        System.out.println("age : " + employee.getAge());
        System.out.println("gender : " + employee.getGender());
        System.out.println("salary : " + employee.getSalary());
        System.out.println("bonusPoint : " + employee.getBonusPoint());
        System.out.println("phone : " + employee.getPhone());
        System.out.println("address : " + employee.getAddress());
    }
}