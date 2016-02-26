package com.training.serialize;

import java.io.*;
public class BookSerializer {

	public String serialize(Book obj)
	{
		String message =null;
		ObjectOutputStream out = null;
		
		
		try{
			out = new ObjectOutputStream(new FileOutputStream(new File("Book.ser")));
			out.writeObject(obj);
			message = "One Object Serialized - Press F5 to viw the File";
		}
		catch(IOException e){
			System.out.println(e.getMessage());	
		}
		finally{
			try{
				out.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return message;
	}
	
	
	public Object deSerialize(){
		Object obj=null;
		//ObjectInputStream oin = null;
	
		/**
		 * try with resource : closed automatically
		 */
		try(ObjectInputStream oin=new ObjectInputStream(new FileInputStream(new File("Book.ser")));)
		{
			obj=oin.readObject();
		}
		catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		return obj;
	}
}
