package com.iu.io2;

import java.io.File;
import java.util.ArrayList;

public class File_Test4 {

	public static void main(String[] args) {
		File file = new File("c:\\test");
		
		String [] names = file.list();
		
		//ArrayList에 추가
		//경로명, 파일명, 폴더명
		
		ArrayList<File> ar = new ArrayList<>();
		
		for(String s: names) {
			File f = new File(file, s);
			ar.add(f);
		}
		
		for(File fi: ar) {
			System.out.println(fi.getName());
			System.out.println(fi.exists());
		}
		
		
		

	}

}
