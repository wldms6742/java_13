package com.iu.io4.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {
	public boolean delete(String id) {//boolean을 리턴으로 줘서 삭제를 한건지 안한건지 구분한다
		ArrayList<MemberDTO> ar = this.getMembers();
		boolean check = false;
		for(MemberDTO m : ar) {
			if(m.getId().equals(id)) {
				ar.remove(m);
				check = !check;
				break;
			}
		}
		if(check) {//check가 true일경우 파일에 다시 덮어씌운다
			
		File file = new File("c:\\test", "member.txt");
		FileWriter fw  = null;
		try {
			fw = new FileWriter(file, false);
			for(MemberDTO m : ar) {
				fw.write(m.getId()+",");
				fw.write(m.getPw()+",");
				fw.write(m.getName()+",");
				fw.write(m.getPhone()+"\r\n");
				fw.flush();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		return check;
	}
	public MemberDTO login(MemberDTO memberDTO) {
		//저장되어있는 데이터랑 
		//사용자가 입력한 id, pw 가 같은지 안같은지 판별
		//로그인 성공 => 데이터가있는 memberDTO리턴 
		//로그인 실패 => 데이터가없는 MemberDTo리턴
		ArrayList<MemberDTO> ar = this.getMembers();
		MemberDTO reDto = null;
		for(MemberDTO m : ar) {
			if(m.getId().equals(memberDTO.getId())&&m.getPw().equals(memberDTO.getPw())){
		
				reDto = m;
				break;
			}
		}
		return reDto;
	}
	
	
	public ArrayList<MemberDTO> getMembers(){
		File file = new File("c:\\test", "member.txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<MemberDTO> ar  = new ArrayList<>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while(br.ready()) {
				String str = br.readLine();
				str=str.replace('.',',').trim();//앞뒤 공백을제거
				StringTokenizer st = new StringTokenizer(str, ",");
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setId(st.nextToken());
				memberDTO.setPw(st.nextToken());
				memberDTO.setName(st.nextToken());
				memberDTO.setPhone(st.nextToken());
				ar.add(memberDTO);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ar;
		
	}
	
	public void join(MemberDTO memberDTO) {
		//1 member.txt 파일을 출력
				//2 회원가입 
				// id,pw,name,phone
		File file = new File("c:\\test", "member.txt");
		FileWriter fw  = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter(file, true);
			
			fw.flush();
			
		} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
	}

}

