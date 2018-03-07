package com.iu.io2;

import java.io.File;

public class File_Test5_mkdir {
	
	public boolean mkdir(String p, String name) {
		File file = new File(p, name);
		boolean result = file.mkdir();
			
		return result;
	}

}
