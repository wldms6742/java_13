package com.jieun.io4.emp.view;

import java.util.ArrayList;

import com.iu.io4.member.MemberDTO;
import com.jieun.io4.emp.EmpDTO;

public class EmpView {
	public void view(ArrayList<EmpDTO> ar) {
		for(EmpDTO emp : ar) {

			System.out.println("=======================");
			System.out.println("사원ID:"+emp.getId());
			System.out.println("사원직책:"+emp.getPosition());
			System.out.println("사원부서:"+emp.getDepart());
			System.out.println("사원연봉:"+emp.getSalary());
			System.out.println("사원번호:"+emp.getEmpNumber());
			System.out.println("인센티브:"+emp.getInsentive());
			System.out.println("입사일:"+emp.getDate());
		}
	}
}
