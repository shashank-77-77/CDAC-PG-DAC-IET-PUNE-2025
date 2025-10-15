package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy2 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		//open file for reading purpose
		try {
			 fis=new FileInputStream("myfile.txt");
			fos=new FileOutputStream("myfilecopy.txt");
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
