package com.iu.io1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Io_test2 {

	public static void main(String[] args) {
		System.out.println("글자를 입력하세요");
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		try {
			int num=ir.read();
			char ch = (char)num;
			System.out.println("입력된 값 : "+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
