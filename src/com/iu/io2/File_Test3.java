package com.iu.io2;

import java.io.File;

public class File_Test3 {

	public static void main(String[] args) {
		File file = new File("c:\\test");
		
		String []  str=file.list();
		
		for(String s: str) {
			System.out.println(s);
		}
		
		File [] files=file.listFiles();
		
		int dir=0;
		int filesCount=0;
		for(File f: files) {
			if(f.isDirectory()) {
				dir++;
			}
			
			if(f.isFile()) {
				filesCount++;
			}
			
		}
		
		System.out.println("Dir : "+dir);
		System.out.println("File : "+filesCount);
		

	}

}
