/**
 * http://usejsdoc.org/
 */
var express = require('express');
//var bodyParser = require("body-parser");
var app = express();

app.use(express.urlencoded());

app.get('/',function(req,res){
	console.log("Got a GET request for the homepage");
	res.send('Hello GET');
});

app.get('/about',function(req,res){
	res.sendfile('./views/Login.html');
});

app.post('/login',function(req,res){
	var user_name=req.body.userName;
	var password=req.body.password;
	console.log("Username = " + user_name + ", Password is " +password);
	res.end("yes");
});

var server = app.listen(8081, function(){
	var host = server.address().address;
	var port = server.address().port;
	
	console.log("Example app listening at http//%s:%s",host,port);
});