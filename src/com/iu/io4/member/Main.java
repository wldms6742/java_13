package com.iu.io4.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.iu.io4.view.MemberView;

public class Main {

	public static void main(String[] args) {
//		//1 member.txt 파일을 출력
//		//2 회원가입 
//		// id,pw,name,phone
//		File file = new File("c:\\test", "member.txt");
//		FileWriter fw  = null;
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			fw = new FileWriter(file, true);
//			System.out.println("id입력: ");
//			String id = sc.next();
//			fw.write("\r\n"+id+",");
//			System.out.println("PW 입력 : ");
//			String pw = sc.next();
//			fw.write(pw+",");
//			System.out.println("Name 입력 : ");
//			String name = sc.next();
//			fw.write(name+",");
//			System.out.println("Phone 입력 : ");
//			String phone = sc.next();
//			fw.write(phone);
//			fw.flush();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
		//new MemberDAO().getMembers();

/*		memberDTO.setId("test");//입력
		memberDTO.setId("test");//입력
*/		
/*		//로그인
		MemberInput mInput = new MemberInput();
		MemberDTO memberDTO = mInput.login();
		MemberDAO  memberDAO = new MemberDAO();
		memberDAO.login(memberDTO);
		
		//삭제
		String id = mInput.delete();
		memberDAO.delete(id);
		//가입
		mInput.join();
		memberDAO.join(memberDTO);
		
		
		memberDTO=memberDAO.login(memberDTO);
		if(memberDTO != null) {
			System.out.println("로그인성공");
					}
		else {
			System.out.println("로그인실패");
			
		*/
	MemberController memberController = new MemberController();
	memberController.start();
	
	}

}
