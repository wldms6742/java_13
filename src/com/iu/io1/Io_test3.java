package com.iu.io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Io_test3 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);
		boolean check=true;
		try {
			while(true) {
				System.out.println("문자열을 입력");
				String str = br.readLine();
				if(str.equals("exit")) {
					break;
				}
				System.out.println("입력된 문자열 : "+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
