package com.iu.io1;

import java.io.IOException;
import java.io.InputStream;

public class Io_test1 {

	public static void main(String[] args) {
		System.out.println("글자를 입력하세요 ");
		InputStream in =System.in;
		
		try {
			int num = in.read();
			
			char ch = (char)num;
			
			System.out.println("입력된 글자는 : "+ch);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
