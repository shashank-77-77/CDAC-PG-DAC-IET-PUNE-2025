package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStreamTest {

	public static void main(String[] args) {
		File f=new File("myfilecopy.txt");
		BufferedOutputStream bos=null;
		try {
			if(f.exists()) {
				
				bos=new BufferedOutputStream(new FileOutputStream(f,true));
				
			}else {
				bos=new BufferedOutputStream(new FileOutputStream(f));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(BufferedInputStream bis=new BufferedInputStream(
				                           new FileInputStream("myfile.txt"));
				BufferedOutputStream bos1=bos;){
			
			int i=bis.read();
			while(i!=-1) {
				bos.write(i);
				i=bis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
