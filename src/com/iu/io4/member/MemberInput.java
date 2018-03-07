package com.iu.io4.member;

import java.io.FileWriter;
import java.util.Scanner;

public class MemberInput {
	private Scanner sc;

	public MemberInput() {
		sc = new Scanner(System.in);

	}
	public MemberDTO login() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력 하세요");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력 하세요");
		memberDTO.setPw(sc.next());
		return memberDTO;
	}

	public String delete() {
		System.out.println("삭제할 ID를 입력하세요");
		String id = sc.next();

		return id;
	}

	//join - 회원 가입
	public MemberDTO join() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력 하세요");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력 하세요");
		memberDTO.setPw(sc.next());
		System.out.println("NAME을 입력 하세요");
		memberDTO.setName(sc.next());
		System.out.println("Phone를 입력 하세요");
		memberDTO.setPhone(sc.next());
		return memberDTO;
	}
}

