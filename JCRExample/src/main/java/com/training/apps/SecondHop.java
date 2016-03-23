package com.training.apps;

import javax.jcr.Credentials;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Value;

import org.apache.derby.tools.sysinfo;
import org.apache.jackrabbit.core.TransientRepository;

public class SecondHop {

	public static void main(String[] args) {
	
		Repository repository = new TransientRepository();
		Credentials crd = new SimpleCredentials("admin","admin".toCharArray());
		
		Session session=null;
		try{
			session=repository.login(crd);
			Node rootNode = session.getRootNode();
//			Node node1 = rootNode.addNode("chapter1");
//			Node node2 = rootNode.addNode("chapter2");
//			
//			node1.setProperty("What is Java", "Java OOP Lang");
//			node2.setProperty("What is an Object", "Instance of Class");
//			
//			session.save();
			
			//Unstructured
			/*
			 * 
			 * */
			
			Node foundNode = rootNode.getNode("chapter1");
			System.out.println("Node1 : " +foundNode.toString());
			System.out.println("Path : " + foundNode.getPath());
			
			Value val = foundNode.getProperty("What is Java").getValue();
			System.out.println(val.getString());

		}catch(Exception e){
			e.printStackTrace();
			}
		
		}
	


}
