package com.jieun.io4.emp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.io4.member.MemberDTO;

public class EmpDAO {//데이터나 파일을 저장하는 곳으로 연결된 것
	//사원 퇴사
	public boolean delete(String empNum) {
		boolean check = false;
		ArrayList<EmpDTO> ar = this.all();
		EmpDTO e = null;//결과를 담아줄 empDTO
		for(EmpDTO empDTO : ar) {
			if(empDTO.getEmpNum().equals(empNum)) {
				e = empDTO; //찾은 empDTO를 넘겨준다
				break;
			}
		}
		if(e != null) {//e가 null이아닌경우가 해당 번호를 찾은경우
			ar.remove(e);
			File file = new File("c:\\test","emp.txt");
			FileWriter fw = null; //파일에 쓰기위한 객체
			try {
				fw = new FileWriter(file,false);//default값은 true: 기존의 내용이 잇으면 내용추가, false : 내용덮어씌움 
				for(EmpDTO empDTO:ar) {
					fw =new FileWriter(file,true);//file에 입력, 기존에 있는 파일에 추가 하는 것:true
					fw.write(empDTO.getEmpNum()+",");
					fw.write(empDTO.getId()+",");
					fw.write(empDTO.getAge()+",");
					fw.write(empDTO.getDept()+",");
					fw.write(empDTO.getLev()+",");
					fw.write(empDTO.getSalary()+",");//,는 구분자
					fw.write(empDTO.getInsen()+"\r\n");//마지막에는 한줄 내려보냄
					fw.flush();
				}//for문이 끝났을때 성공
				check = true;
			}catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
			
		return check;
	}
	//사원검색
	public EmpDTO search(String empNum) { //사원한명을 검색해서 EmpDTO에 넣어줌 따라서 반환값
		ArrayList<EmpDTO> ar = this.all(); //Arraylist전체를 가져옴 -> 이중에서 사원번호가 같은 사원을 검색
		EmpDTO e = null;//결과를 담아줄 empDTO
		for(EmpDTO empDTO : ar) {
			if(empDTO.getEmpNum().equals(empNum)) {
				e = empDTO; //찾은 empDTO를 넘겨준다
				break;
			}
		}
		return e; //찾은 사원번호 리턴 , 못찾은 경우는  null이 리턴 따라서 이걸로 찾았는지 아닌지 구분
	}
	
	//전체사원
	public ArrayList<EmpDTO> all(){
		File file = new File("c:\\test","emp.txt");
		FileReader fr = null;
		BufferedReader br = null;//혼자서 읽을수 없기때문에 버퍼리더 필요
		ArrayList<EmpDTO> ar = new ArrayList<>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(br);
			while(true) {//무한반복상태
				String str = br.readLine();//한줄읽음
				if(str==null) {
					break;
				}
				//널이 아니라면 문자열 파싱
				String [] s = str.split(",");
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpNum(s[0]);
				empDTO.setId(s[1]);
				empDTO.setAge(Integer.parseInt(s[2]));
				empDTO.setDept(s[3]);
				empDTO.setLev(s[4]);
				empDTO.setSalary(Integer.parseInt(s[5]));
				empDTO.setInsen(Integer.parseInt(s[6]));
				ar.add(empDTO);
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ar;
	}
	//사원추가
	public boolean add(EmpDTO empDTO) {//boolean리턴으로 성공인지 실패인지 구분한다
		//저장할 데이터를 받아서 저장해야해서 empDTO를 매개변수로 준다
		File file  = new File("c:\\test","emp.txt");
		FileWriter fw = null;//파일에 입력
		boolean check = true;
		try {
			fw =new FileWriter(file,true);//file에 입력, 기존에 있는 파일에 추가 하는 것:true
			fw.write(empDTO.getEmpNum()+",");
			fw.write(empDTO.getId()+",");
			fw.write(empDTO.getAge()+",");
			fw.write(empDTO.getDept()+",");
			fw.write(empDTO.getLev()+",");
			fw.write(empDTO.getSalary()+",");//,는 구분자
			fw.write(empDTO.getInsen()+"\r\n");//마지막에는 한줄 내려보냄
			fw.flush();
		} catch (Exception e) {//예외발생
			check = !check; //예외발생하면 check값이 바뀐다
			e.printStackTrace();
			
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
	
}

