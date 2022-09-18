package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
	
	public static void main(String[] args) {
//		File f=new File("first.txt");
//		FileInputStream fin= new FileInputStream(null);
		try {
			FileInputStream fin=new FileInputStream(new File("first.txt"));
			int i=0;
			while((i=fin.read())!=-1) {  //not created file
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
