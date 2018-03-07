package com.jieun.io4.emp;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class EmpInput {
	private Scanner sc;
	public EmpInput() {
		sc = new Scanner(System.in);
	}
	public EmpDTO join() {
		EmpDTO empDTO = new EmpDTO();

		System.out.println("사원id입력:");
		String id = sc.next();
		empDTO.setId(id);
		System.out.println("사원부서입력:");
		String depart = sc.next();
		empDTO.setDepart(depart);
		System.out.println("사원연봉입력:");
		int salary = sc.nextInt();
		empDTO.setSalary(salary);
		System.out.println("사원직책입력:");
		String position = sc.next();
		empDTO.setPosition(position);
		
		Calendar ca = Calendar.getInstance();
		empDTO.setDate(ca.getTime());
		
		return empDTO;	
	
	}

}
