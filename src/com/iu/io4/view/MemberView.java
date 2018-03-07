package com.iu.io4.view;
import java.util.ArrayList;

import com.iu.io4.member.MemberDTO;
public class MemberView {
	public void view(String st) {
		System.out.println(st);
	}
	public void view(ArrayList<MemberDTO> ar) {
		for(MemberDTO memberDTO : ar) {
			System.out.println("ID:"+memberDTO.getId());
			System.out.println("Pw:"+memberDTO.getPw());
			System.out.println("Name:"+memberDTO.getName());
			System.out.println("Phone:"+memberDTO.getPhone());
		
		}
	}
}



/*
c:\\test\\emp.txt
간단한 사원관리
사원의 정보는 : 사원벙보, id,부서명, 직책,월륵. 인선티브 입사일
ㅋ사원번호 : 년도2자리 월2자리 1~100이하의 랜덤읜수 (1203003)
입사일 : 년도-월 -일 형식 exP 2017-03-07*/
//전체사원 정보관리
/*기능
1. 전체사원정보보기
2.사원검색해보기(사원번호로 검색)
3.사원을 추가
4.사원퇴사

패키지 : com.jieun.io4.emp - EmpDTo, empDao, empControoller. 
com.iu.io4.view
*/