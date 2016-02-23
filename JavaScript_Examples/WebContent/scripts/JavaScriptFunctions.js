/**
 * 
 */

function normalFunction(){
	
	alert("I am a Normal Function");
}

function withArgFunction(name){
	
	alert("Function that takes an argument : " + name);
}

function returnFunction(name){
	
	return "Function that return argument : " + name;
}

function takeFunctionArg(func){
	
	var recvd = func;
	alert(recvd);
}

function returningFunctions(){
	
	return{
		
		addClass:function(){
			alert("Add class called");
		},
		removeClass:function(){
			alert("Remove class called");
		}
	};
}

