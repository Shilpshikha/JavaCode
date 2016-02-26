/**
 * 
 */
(function(){
	retrieve();
	calculate();
})();

function retrieve(){
	var text = '{"items" : [' + '{"name" :"Chocolate Brownie" ,"price" : 140 },' + '{"name" :"Black Forest" ,"price" : 240 },' + '{"name" :"White Forest" ,"price" : 350 },' + '{"name" :"Butter Scotch" ,"price" : 200 }]}';
	var obj = JSON.parse(text);
	
	document.getElementById("row11").innerHTML = obj.items[0].name;
	document.getElementById("row12").innerHTML = obj.items[0].price;
	
	document.getElementById("row21").innerHTML = obj.items[1].name;
	document.getElementById("row22").innerHTML = obj.items[1].price;
	
	document.getElementById("row31").innerHTML = obj.items[2].name;
	document.getElementById("row32").innerHTML = obj.items[2].price;
	
	document.getElementById("row41").innerHTML = obj.items[3].name;
	document.getElementById("row42").innerHTML = obj.items[3].price;
	
}

function calculate(){
    var element = document.getElementsByName("chk1");
    for(var i=0;i<element.length;i++)
     element[i].addEventListener('click',calc);
      
}

function calc(){
	var arr= document.getElementsByName("chk1");
	var sum=0;
	for(var i=0;i<arr.length;i++)
		{
			if(arr[i].checked){
				sum+=parseInt(arr[i].value);
			}
		}
	console.log(sum);
	document.getElementById("row5").innerHTML=sum;
}




