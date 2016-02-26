/**
 * 
 */
(function(){
	validateName();	
})();

	

function validateName(){

	var textelement = document.getElementById("cname");
	var subelement = document.getElementById("sub");
	subelement.addEventListener('click', function(event){
		event.preventDefault();
		var name = textelement.value;
		check = prompt("Is your name is correct?",name);
		document.getElementById("cname").value = check;
		getInputElements();
	});
	
}

function getInputElements(){
	
	var name = document.getElementsByName("cname");
	
	
	var loc = document.getElementById("drpdwn").options[document.getElementById("drpdwn").selectedIndex].value;
	
	var payment = document.getElementsByName("net");
	for(var i=0;i<payment.length;i++){
		if(payment[i].checked){
			pay = payment[i];
		}
	}
	console.log(pay.value);
	
	var offer = document.getElementsByName("offer");
	var ofr = "";
	for(var j=0;j<offer.length;j++){
		if(offer[j].checked){
			ofr += "," + offer[j].value;
		}
	}
	 
	
	alert("Dear " + name[0].value + "Confirm your choices\n" + 
		  "Location : " + loc + "\n" +
		  "Payment : " + pay.value + "\n" + 
		  "Offers : " + ofr + "\n" 
	);
	
}
