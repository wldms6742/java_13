package com.jieun.io4.emp;

import java.util.Scanner;

import com.jieun.io4.emp.view.EmpView;

public class EmpController {
	private EmpDAO empDAO;
	private EmpDTO empDTO;
	private EmpView empView;
	
	public EmpController() {
		empDAO = new EmpDAO();
		empDTO = new EmpDTO();
		empView = new EmpView();
	}
	public void start() {
		boolean check = true;
		while(check) {
			System.out.println("1. 전체사원정보보기");
			System.out.println("2.사원검색해보기(사원번호로 검색)\r\n" );
			System.out.println("3.사원 추가");
			System.out.println("4. 사원 퇴사");
			System.out.println("5. 종료");
			System.out.print("번호를 입력하세요:");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				empView.view(ar);//empView
				break;
			case 2:
				//empsearch
				break;
			case 3:
				//empadd
				break;
			case 4:
				//empdelete
				break;
			default:
				System.out.println("종료합니다");
				check = !check;
				break;
			}
			
		}
	}
}
