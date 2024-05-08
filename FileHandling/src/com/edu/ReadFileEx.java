package com.edu;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileEx {
	public static void main(String[] args) throws IOException {
		//file Input Stream -> read data
		FileInputStream inp = new FileInputStream("data.txt");
		//read first byte
		int i = inp.read();
		while(i!=-1) {
			System.out.println((char)i);
			//read next byte from the file
			i=inp.read();
		}
		inp.close();
	}
}
