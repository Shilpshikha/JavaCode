<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Lab Test</title>
<link type="text/css" href="styles/myStyles.css" rel="stylesheet">

<script type="text/javascript" src="jslibs/jquery-1.12.1.js"></script>
	<script>
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
	
	</script>

</head>
<body>
<div id="hdtop">
<h2>Dr.Paul's Path Lab</h2>
</div>
<hr/>
<div id="navmid">
<ul>
		<li><a href="home.html"><span style ="padding-left:5px">home</span></a></li>
		<li><a href="create.html">Create Test Order</a></li>
		<li><a href="add.html">Add Test Results</a></li>
		<li><a href="view.html">View Test Report</a></li>
		
		</ul>
</div>
<div id="content">

	<table>
		<tr>
			<td>Order no.</td>
			<td><input type="text" name="orderno" id="orderid"></td>
			<td>Collection Date</td>
			<td><input type="date" name="coldate" id="cdate"/></td>
			<td>Collection Type</td>
			<td><input type="radio" name="coltype" id="lab">Lab <input type="radio" name="coltype" id="home">Home</td>
		</tr>
		<tr>
			<td>Patient Code</td>
			<td><input type="text" name="patientcode" id="patcode"></td>
			<td>Patient Name</td>
			<td><input type="text" name="patientname" id="patname"></td>
			<td>Age</td>
			<td><input type="text" name="age" id="patage"></td>
		</tr>
		<tr>
			<td>HandPhone</td>
			<td><input type="text" name="handphone" id="patphone"></td>
			<td>Email</td>
			<td><input type="text" name="email" id="patmail"></td>
			<td>Gender</td>
			<td><input type="radio" name="gender" id="patmale">Male <input type="radio" name="gender" id="patfemale">Female</td>
		</tr>
		<tr>
			<td>Doctor Code</td>
			<td><input type="text" name="doctorcode"></td>
			<td colspan="2">Doctor Name</td>
			
			<td colspan ="2"><input type="text" name="age"></td>
			
		</tr>
	</table>

</div>
<div id="content2">
	<table id="test">
		<tr>
			<td>Test Code</td>
			<td>Test name</td>
			<td>Amount</td>
		</tr>
		<tr>
			<td>
			
				<input type="text" id="ajax" list="json-datalist" placeholder="datalist" onblur="fun1()">
				<datalist id="json-datalist"></datalist>
				<script>
				var dataList = document.getElementById('json-datalist');
				var input = document.getElementById('ajax');
				
				if(window.XMLHttpRequest)
					{
						request=new XMLHttpRequest();
					}
				
				else if(window.ActiveXObject)
					{
						request=new ActiveXObject("Microsoft.XMLHTTP");
					} 
				request.open('GET', 'data/html-elements.json', true);
				request.onreadystatechange = function(response) {
					  if (request.readyState === 4) {
					    if (request.status === 200) {
					    
					      var jsonOptions = JSON.parse(request.responseText);

					     
					      jsonOptions.forEach(function(item) {
					    
					        var option = document.createElement('option');
					
					        option.value = item.code;
					     
					        dataList.appendChild(option);
					      });

					  
					     
					    } else {
					 
					      input.placeholder = "Couldn't load datalist options :(";
					    }
					  }
					};

					request.send();
				</script>
			</td>
			<td><input type="text" name="testname" id="testname"></td>
			<td><input type="text" name="tamount" id="tamount"></td>
		</tr>
	
		<tr>
			<td colspan="2">Total</td>
			<td></td>
		
		</tr>
	</table>
	
		<script type="text/javascript">
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

	
	
					
	</script>
	
</div>
<div id="content3">
<input type="button" name="add" value="Add more Test" id="btn1" onclick="addTest()">
</div>
<hr/>
<div id="ftbottom">
<h6>Contact Administrator</h6>
</div>

</body>
</html>