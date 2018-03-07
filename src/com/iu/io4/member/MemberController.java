package com.iu.io4.member;

import java.util.Scanner;

import com.iu.io4.view.MemberView;

public class MemberController {
	private MemberDAO memberDAO;
	private MemberInput memberInput;
	private MemberView memberView;
	
	public MemberController() {
		memberDAO = new MemberDAO();
		memberInput = new MemberInput();
		memberView = new MemberView();
	}
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원로그인");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				MemberDTO memberDTO=memberInput.join();
				memberDAO.join(memberDTO);
			}else if(select==2) {
				MemberDTO memberDTO = memberInput.login();
				memberDTO=memberDAO.login(memberDTO);
				if(memberDTO != null) {
					memberView.view("로그인 성공");
				}else {
					memberView.view("로그인 실패");
				}
				
			}else if(select ==3) {
				String id = memberInput.delete();
				boolean check=memberDAO.delete(id);
				if(check) {
					memberView.view("삭제 성공");
				}else {
					memberView.view("삭제 실패");
				}
			
			}else {
				System.out.println("Finish");
				break;
			}
			
			
		}
		
		//1. 회원가입
		//2. 로그인
		//3. 삭제
		//4. 종료
		
	}

}
