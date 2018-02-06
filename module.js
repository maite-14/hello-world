//Maite Molina-Muniz
//global variables --> scope
var express = require('express');
    var app = express();
    var path = require('path');

    //handler requests
    app.get('/', function(req, res){ //EVENT DRIVEN BY MESSAGES FROM HTTP SERVER
    res.send('GET request received') //once the server receives the message, a response will be
                          //sent stating "GET request received"
  })

    app.listen(3000); //port number to be used for connection

var myTime; //global variable

      function ticktock(){ //function declaration
        //local variables --> scope
        var today = new Date();
        var hour = today.getHours();
        var minute = today.getMinutes();
        var second = today.getSeconds();

      myTime = setTimeout(ticktock(), 1000); //assign function to variable aka FCC & callback
                                        //pass function as a parameter to function setTimeout()
                                        //call ticktock() function after 1000 ms

      console.log(hour + ":" + minute + ":" + second); //display time
    }

