package com.iu.io3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_1 {

	public static void main(String[] args) {
		//1. 어디에 저장
		File file = new File("c:\\test", "t1.txt");
		FileWriter fw=null;
		try {
			//true , add
			//false, defalut, new
			fw = new FileWriter(file);
			fw.write("123\r\n");
			fw.write("456");
			fw.flush();//버퍼를 강제로 비움
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
