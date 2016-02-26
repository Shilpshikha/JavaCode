package com.training.newfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class File_Example {

	public static void main(String[] args) {
	
		//Generating a reference
		File f = new File("Sample.txt");
		
		try{
			f.createNewFile(); //creating a new file
		}catch(IOException e){
			e.printStackTrace();
		}
		
		PrintWriter writer = null;
		try {
			 writer = new PrintWriter(f);
			writer.println("Hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			writer.close();
		}
		
		
		/**
		 * lists files in current directory
		 */
		File dir = new File(".");
		String[] files = dir.list();
		File[] fileList = dir.listFiles();
		
		System.out.println("File : ");
		for(String file :files)
		{
			
			System.out.println(file);
		}

		System.out.println("\nDirectory : ");
		for(File file : fileList)
		{
			if(file.isDirectory()){
				
				System.out.println("\t" + file);
				File[] fl2 = file.listFiles();
				for(File fl : fl2){
					if(fl.isDirectory()){
						System.out.println("\t\t" + fl);
					}
					System.out.println(file);
				}
			}
			System.out.println(file);
		}
		System.out.println(f.exists());
	}

}
