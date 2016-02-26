package com.training.newfile;

//import java.io.FileWriter;
import java.io.*;

import com.training.serialize.*;

public class BookManager {

	String message;
	
	
	public BookManager() {
		super();

	}

	public String addBooks(Book[] bks){
		PrintWriter out = null;
		try{
			out = new PrintWriter(new FileWriter("Book.txt"));
			
			message = "Book added";
//			out.println(message);
			
			for(Book bk:bks){
				out.println(bk);
			}
			return message;
			//out.println(message);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			out.close();
		}
		
		return message;
	}

	public void printBooks(File filename){
		try(BufferedReader reader = new BufferedReader(new FileReader("Book.txt"));){
			
			String line;
			while((line=reader.readLine()) !=null){
				 System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
