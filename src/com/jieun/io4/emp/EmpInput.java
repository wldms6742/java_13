package com.jieun.io4.emp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class EmpInput {
	private Scanner sc;
	public EmpInput() {
		sc = new Scanner(System.in);//메서드여러곳에 필요하므로 멤버변수로 선언후 생성자이용
	}
	//사원번호입력
	public String setEmpNum() {
		System.out.println("사원번호를 입력하세요");
		String s = sc.next();
		return s;
	}
	//사원번호 테스트
	public String makeEmpNum() {
		Random random = new Random();
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyMM");//03월 이라는 두자리로 가져오기위해서 simpledateformat사용
		String s = sd.format(ca.getTime());
		int num = random.nextInt(100)+1;//0~99에 +1을 해주면 1~100
		String n = String.valueOf(num);//int 형 num을 String 타입으로 변경
		String one = "";
		for(int i = n.length();i<3;i++) {
			one=one+"0";
		}
		s = s+one+n;
		System.out.println(s);
		return s;
		
	}
	//사원정보입력
	public EmpDTO setEmp() {//사원한명의 정보 -> 리턴타입 EmpDTO
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpNum(this.makeEmpNum());
		System.out.println("ID를 입력:");
		empDTO.setId(sc.next());
		System.out.println("나이를입력:");
		empDTO.setAge(sc.nextInt());
		System.out.println("부서를 입력 :");
		empDTO.setDept(sc.next());
		System.out.println("직책입력:");
		empDTO.setLev(sc.next());
		System.out.println("월급:");
		empDTO.setSalary(sc.nextInt());
		System.out.println("인센티브:");
		empDTO.setInsen(sc.nextInt());
		
		return empDTO;
		
	}
}
