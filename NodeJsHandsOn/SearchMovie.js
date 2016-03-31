/**
 * http://usejsdoc.org/
 */

var express = require('express');
var app = express();
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');

var url = 'mongodb://localhost:27017/movielist';

app.use(express.urlencoded());
app.use(express.static("public"))

app.set("view engine","ejs");

app.get('/',function(req,res){
	
	console.log("Got a GET request for the homepage");
	res.send('Hello GET');
});

app.get('/about',function(req,res){
	res.sendfile('./views/welcome.html');
	
});


app.get('/movielist',function(req,res){
	
	MongoClient.connect(url, function(err, db) {
		  assert.equal(null, err);
		  console.log('connecting');
		  db.collection('movie').find().toArray(function(err,docs){
			 res.send(docs);
		 });
	});			  			
});

app.get('/movie/:id',function(req,res){
	
	//res.send(req.params.id);
	
	MongoClient.connect(url, function(err, db) {
		  assert.equal(null, err);
		  db.collection('moviesongs').findOne({movId:parseInt(req.params.id)},function(err,docs){
			 res.locals.docs = docs.movSongs;
			 res.render("index");
		  })
	});	
});

var server = app.listen(3030, function(){
	var host = server.address().address;
	var port = server.address().port;
	
	console.log("Example app listening at http//%s:%s",host,port);
});
	
