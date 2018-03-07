package com.iu.io3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_1 {

	public static void main(String[] args) {
		File file=new File("c:\\test", "iuuuuuuuuuuuuuuuuuu.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
				String str=br.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
