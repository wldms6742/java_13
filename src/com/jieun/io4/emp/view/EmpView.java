package com.jieun.io4.emp.view;

import java.util.ArrayList;

import com.iu.io4.member.MemberDTO;
import com.jieun.io4.emp.EmpDTO;

public class EmpView {
	public void view(String s) {
		System.out.println(s);
	}
	
	public void view(ArrayList<EmpDTO> empDTOs) {
		for(EmpDTO empDTO: empDTOs) {
			this.view(empDTO);
		}
	}
	
	public void view(EmpDTO empDTO) {
		System.out.println("EmpNum : "+empDTO.getEmpNum());
		System.out.println("ID : "+empDTO.getId());
		System.out.println("Age : "+empDTO.getAge());
		System.out.println("Dept : "+empDTO.getDept());
		System.out.println("Lev : "+empDTO.getLev());
		System.out.println("Sal : "+empDTO.getSalary());
		System.out.println("Insen : "+empDTO.getInsen());
		
	}
}
