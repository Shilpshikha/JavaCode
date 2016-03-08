/**
 * 
 */
$(function(){
			$("#orderid").on('blur',function(){
				var orderId = $(this).val();
				console.log(orderId);
				var url="TestRecords";
				$.get(url,{"orderno": orderId},function(resp){
					
					console.log(resp);
					
					patCode=resp;
					arr =patCode.split(",");
					patientcode = arr[0];
					patientname = arr[1];
					age = arr[2];
					handphone = arr[3];
					email = arr[4];
					gen = arr[5];
					coltype = arr[6];
					coldate = arr[7];
					$('#patcode').val(patientcode);
					$('#patname').val(patientname);
					$('#patage').val(age);
					$('#patphone').val(handphone);
					$('#patmail').val(email);
					
					console.log(gen);
					console.log(coltype);
					console.log(coldate);
					
					if(gen=="male"){
// 						$('#patmale').prop('checked',true);
						alert("male");
					}
					
					if(gen=="female"){
// 						$('#patfemale').attr('checked',true);
						alert("female");
					}
					
					if(coltype=="lab"){
						$('#lab').attr('checked',true);
					}
					else if(coltype=="home"){
						$('#home').prop('checked',true);
					}
					
					$('#cdate').val(coldate);
				});
			});
		});


$(function(){
	
	$("#ajax").on('blur',function(){
		var testId = $(this).val();
		console.log(testId);
		$.ajax({
			type: 'GET', 
            url: "data/html-elements.json",
            dataType: "json",
            success: function(data)
            {
            	for (var i=0;i<data.length;++i) 
            	{
                	if(testId == data[i].code) 
                	{
                		$("#testname").val(data[i].name);
                		$("#tamount").val(data[i].rate);
                	}
                }

            }
		});
	});
	
});

function addTest(){
 $('#test').find('tr:last').before('<tr><td><input type="text" id="ajax" list="json-datalist"><datalist id="json-datalist"></datalist></td><td><input id="tname2"></td><td><input id="rate2"></td></tr> ');
}

function calculate(){
 var sum=0;
 
}



S