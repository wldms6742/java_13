package com.jieun.io4.emp;

public class EmpMain {
	public static void main(String[] args) {
		/*EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpNum("t");
		empDTO.setId("t");
		empDTO.setAge(10);
		empDTO.setDept("t");
		empDTO.setLev("t");
		empDTO.setSal(10);
		empDTO.setInsen(10);
		
		EmpDAO empDAO = new EmpDAO();
		boolean check=empDAO.add(empDTO);
		if(check) {
			System.out.println("성공");
		}else {
			System.out.println("Fail");
		}*/
		EmpInput empInput = new EmpInput();
		empInput.makeEmpNum();
	}
}
