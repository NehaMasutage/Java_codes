package com.edu;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class CreateFileEx {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");//representing file
		if(file.exists()) {
			file.createNewFile();//new file will create
		}
		
//writing data inside a file'
		FileOutputStream fos = new FileOutputStream(file);
		String data ="This a Training of Java Full Stack";
		
		//serialization
		fos.write(data.getBytes());
		fos.flush();//flush method will remove all data inside writer
	}

}
