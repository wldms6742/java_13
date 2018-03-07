package com.iu.io2;

import java.io.File;

public class File_Test2 {

	public static void main(String[] args) {
		File file = new File("c:\\test");
		file = new File(file, "Test1.class");
		
		System.out.println(file.getPath());
		
		System.out.println(file.getName());
		
		System.out.println(file.length());
		
		
		file = new File("c:\\test", "Test1.class");

	}

}
