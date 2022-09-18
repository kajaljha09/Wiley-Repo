package com.fileio;

import java.io.File;
import java.io.IOException;

//byte hierarchy
//character hierarchy
public class Demo1 {
	
	public static void main(String[] args) {
		//how to create a file
		File f=new File("first.txt");
		//it doesnot create a file just point to a file ,
		//it may be present or may not be
		try {
			if(!f.exists()) {
			f.createNewFile();
			System.out.println("new file is create");
			}
			else {
				System.out.println("already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //checked exception
		
	}

}
