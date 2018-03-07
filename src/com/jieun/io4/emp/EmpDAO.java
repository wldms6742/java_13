package com.jieun.io4.emp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.iu.io4.member.MemberDTO;

public class EmpDAO {
	public 
	public ArrayList<MemberDTO> getEmp(){
		File file = new File("c:\\test", "emp.txt");
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
}

