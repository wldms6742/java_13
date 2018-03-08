package com.jieun.io4.emp;

import java.util.ArrayList;
import java.util.Scanner;

import com.jieun.io4.emp.view.EmpView;

public class EmpController {
	private EmpDAO empDAO;
	private EmpDTO empDTO;
	private EmpView empView;
	private EmpInput empInput;

	public EmpController() {
		empDAO = new EmpDAO();
		empDTO = new EmpDTO();
		empView = new EmpView();
		empInput = new EmpInput();
	}
	public void start() {
		boolean check = true;
		while(check) {
			System.out.println("1.전체사원정보");
			System.out.println("2.검색사원정보" );
			System.out.println("3.신입사원추가");
			System.out.println("4. 사 원 퇴 사");
			System.out.println("5. 종       료");
			System.out.print("번호를 입력하세요:");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				//사원정보를 DAO에서 가져옴
				ArrayList<EmpDTO> ar =empDAO.all();
				break;
			case 2:
				String empNum = empInput.setEmpNum();
				 empDTO = empDAO.search(empNum);
				if(empDTO != null) {
					empView.view(empDTO);
				}else {
					empView.view("해당번호의 사원이 없습니다.");
				}
				//empsearch
				break;
			case 3:
				empDTO =null;
				boolean check1 = empDAO.add(empDTO);
				String s = "사원등록 실패";
				if(check1) {
					s= "사원등록 성공";
				}
				empView.view(s);
				//empadd
				break;
			case 4:
				String empNum1 = empInput.setEmpNum();
				empDAO.delete(empNum1);
				boolean check2 =empDAO.delete(empNum);
				String s1 = "사원삭제 실패";
				if(check2) {
					s1= "사원삭제 성공";
				}
				empView.view(s1);
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
