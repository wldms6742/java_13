package com.iu.io2;

import java.io.File;

public class File_Test1 {

	public static void main(String[] args) {
		File file=null;
		
		file = new File("c:\\test3");
		
		System.out.println(file.exists());
		
		System.out.println(file.isDirectory());
		
		System.out.println(file.isFile());
		
		System.out.println(file.mkdirs());
		
		System.out.println(file.delete());
		
		file = new File("c:\\test\\Test1.java");
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.mkdirs());
		System.out.println(file.delete());

	}

}
