/**
 * 
 */
function init(){
	
	//creating custom object
	var item = {
			"itemName":"TV",
			"itemImage":"images/images.jpg",
			showItem:function(){
				
				console.log("Show item called");
				var ele= document.getElementById("itemName");
				ele.innerHTML=this.itemName;
				document.getElementsByTagName("img")[0].src=this.itemImage;
			}
	};
	
	console.log("Init Called");
	console.log(item.itemName);
	item.showItem();
	//console.log(item.prototype);
	
	
}

//anonymous function
(function(){
	init();
})();