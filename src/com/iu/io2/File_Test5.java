package com.iu.io2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class File_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File_Test5_mkdir fm = new File_Test5_mkdir();
		File_Test5_mkName fn = new File_Test5_mkName();
		boolean check=true;
		String p = "c:\\test";
		while(check) {
			System.out.println("1. 폴더명입력");
			System.out.println("2. 폴더자동생성1");
			System.out.println("3. 폴더자동생성2");
			System.out.println("4. 삭         제");
			System.out.println("5. 프로그램 종료");
			//1. 입력받은 폴더명으로 폴더 생성
			//2. 현재시간을 밀리세컨즈 폴더
			//3. 현재시간 09시-50분-02초-00 : 0~100미만의 랜덤숫자
			//4. 크기가 0인 것들 모두 삭제
			int select = sc.nextInt();
			boolean result=false;
			if(select==1) {
				System.out.println("폴더명 입력");
				String name = sc.next();
				result=fm.mkdir(p, name);
			}else if(select==2) {
				String name = fn.mkName();
				result=fm.mkdir(p, name);
				
			}else if(select==3) {
				result=fm.mkdir(p, fn.mkName2());
				//ca.get(Calendar.HOUR_OF_DAY);
				//ca.get(Calendar.MINUTE);
				
			}else if(select==4) {
				File file = new File(p);
				File [] files=file.listFiles();
				for(File f: files) {
					if(f.length()==0) {
						f.delete();
					}
				}
			
			}else {
				System.out.println("종료");
				break;
			}
			
			if(result) {
				System.out.println("디렉터리 생성");
			}else {
				System.out.println("디렉터리 생성 실패");
			}
			
			
		}
		

	}

}
