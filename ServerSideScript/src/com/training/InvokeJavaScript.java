package com.training;

import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InvokeJavaScript {

	public static void main(String[] args) {
		
		try{
			
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
			
		
			engine.eval(new FileReader("MyScript.js"));
			
			//function invoked from javascript that invokes java code
			engine.eval(new FileReader("Sample.js"));
			
			Invocable invocable = (Invocable) engine;
			
			//fun1 invoked fro javascript MyScript.js
			Object result = invocable.invokeFunction("fun1", "Rohit");
			
			System.out.println(result);
		
		}catch(IOException | ScriptException | NoSuchMethodException e){
			e.printStackTrace();
		}
		

	}

}
