package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy3 {

	public static void main(String[] args) {
		
		//open file in autoclosable resource block
		try (FileInputStream fis=new FileInputStream("myfile.txt");
			FileOutputStream fos=new FileOutputStream("myfilecopy.txt");){
			//copy the contents from one file to another
			int i=fis.read();
			//to check the EOF
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
