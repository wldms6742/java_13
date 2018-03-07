package com.iu.io2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class File_Test5_mkName {
	
	public String mkName() {
		Calendar ca = Calendar.getInstance();
		long l = ca.getTimeInMillis();
		return String.valueOf(l);
	}
	
	public String mkName2() {
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("HH시-mm분-ss초");
		String name=sd.format(ca.getTime());
		Random r = new Random();
		name=name+"-"+r.nextInt(100);
		return name;
	}

}
