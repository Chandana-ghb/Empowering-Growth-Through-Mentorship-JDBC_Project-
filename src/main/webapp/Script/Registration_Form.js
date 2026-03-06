//First Name
function fun1(){
    document.getElementById("unameP").innerText="Enter your First name";
    document.getElementById("unameP").style.color="green";
    document.getElementById("unameP").style.fontSize="15px";
    document.getElementById("unameP").style.marginLeft="20%";
    document.getElementById("unameP").style.marginTop="2%";
    document.getElementById("cancel").style.display="none";
  

  }

 function blur1(){
    let uname=document.getElementById("uname").value;
      if(uname==""){
        document.getElementById("unameP").innerText="You must enter your First name";
        document.getElementById("unameP").style.color="red";
        document.getElementById("cancel").style.display="block"; 
        document.getElementById("unameP").style.marginLeft="2%";


      }

      else{
        document.getElementById("unameP").innerText="";
        document.getElementById("cancel").style.display="none";
      }
  }
      

//Last Name

  function fun2(){
    document.getElementById("unameP1").innerText="Enter your Last name";
    document.getElementById("unameP1").style.color="green";
    document.getElementById("unameP1").style.fontSize="15px";
    document.getElementById("unameP1").style.marginLeft="20%";
    document.getElementById("unameP1").style.marginTop="2%";
    document.getElementById("cancel1").style.display="none";

  }

  function blur2(){
    let uname1=document.getElementById("uname1").value;
      if(uname1==""){
        document.getElementById("unameP1").innerText="You must enter your Last name";
        document.getElementById("unameP1").style.color="red";
        document.getElementById("cancel1").style.display="block"; 
        document.getElementById("unameP1").style.marginLeft="2%";


      }

      else{
        document.getElementById("unameP1").innerText="";
        document.getElementById("cancel1").style.display="none";
      }
  }
      
function onlyLetter(char){
  let reg=/[^a-z A-Z]/;
  char.value=char.value.replace(reg,"");
}

//Password

  function fun5(){
    document.getElementById("unameP4").innerText="Enter your password";
    document.getElementById("unameP4").style.color="green";
    document.getElementById("unameP4").style.fontSize="15px";
    document.getElementById("unameP4").style.marginLeft="20%";
    document.getElementById("cancel4").style.display="none";

  }

  function blur5(){
    let pass=document.getElementById("pass").value;
      if(pass==""){
        document.getElementById("unameP4").innerText="You must enter your password";
        document.getElementById("unameP4").style.color="red";
        document.getElementById("cancel4").style.display="block"; 
        document.getElementById("unameP4").style.marginLeft="2%";


      }

      else{
        document.getElementById("unameP4").innerText="";
        document.getElementById("cancel4").style.display="none";
      }
  }

  //Confirm Password

  function fun6(){
    document.getElementById("unameP5").innerText="Enter your confirm password";
    document.getElementById("unameP5").style.color="green";
    document.getElementById("unameP5").style.fontSize="15px";
    document.getElementById("unameP5").style.marginLeft="20%";
    document.getElementById("cancel5").style.display="none";

  }

  function blur6(){
    let cpass=document.getElementById("cpass").value;
      if(cpass==""){
        document.getElementById("unameP5").innerText="You must enter your confirm password";
        document.getElementById("unameP5").style.color="red";
        document.getElementById("cancel5").style.display="block"; 
        document.getElementById("unameP5").style.marginLeft="2%";


      }

      else{
        document.getElementById("unameP5").innerText="";
        document.getElementById("cancel5").style.display="none";
      }
  }


  //Mail

  function checkmail(){
    
    var mail=document.getElementById("mail").value;

    var reg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    var msg=reg.test(mail)?"":"Invalid Mail Id";
    document.getElementById("mailerror").innerText=msg;
    document.getElementById("mailerror").style.color="red";
    document.getElementById("mailerror").style.fontSize="15px";
    document.getElementById("mailerror").style.marginLeft="20%";
    
    document.getElementById("cancel2").style.display="block";

  }

  function fun7(){
    var mail=document.getElementById("mail").value;

    var reg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    var msg=reg.test(mail)?"Valid mail id":"Enter mail id";
    document.getElementById("mailerror").innerText=msg;
    document.getElementById("mailerror").style.color="green";
    document.getElementById("mailerror").style.fontSize="15px";
    document.getElementById("mailerror").style.marginLeft="20%";
    document.getElementById("mailerror").style.marginTop="2%";

  }

  //Submit Button

  function sub(){

    var firstname=document.getElementById("uname").value;
    var lastname=document.getElementById("uname1").value;
    var mail=document.getElementById("email").value;
    var password=document.getElementById("pass").value;
    var cpass=document.getElementById("cpass").value;

  
      var pass=document.getElementById("pass").value;
      var reg = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
      var msg=reg.test(pass)?"":"";
      document.getElementById("passerr").innerHTML=msg;
      document.getElementById("passerr").style.color="green";
      document.getElementById("passerr").style.fontSize="15px";
      document.getElementById("passerr").style.marginLeft="20%";

    if(firstname=="" || lastname=="" || mail==""  || password==""|| cpass!=pass){
      document.getElementById("error").innerText="Please enter all the details !!!";
      document.getElementById("error").style.marginLeft="20%";
      document.getElementById("error").style.fontSize="18px";
      document.getElementById("cpasserr").innerText="";
      document.getElementById("cpasserr").style.marginLeft="20%";


      document.getElementById("error").style.color="red";
      console.log("done");
      return false;
    }

    else{
      document.getElementById("error").innerText="";
      document.getElementById("cpasserr").innerText="password matched ✅";
      document.getElementById("cpasserr").style.marginLeft="20%";
      console.log("error");
      return true;

    }

    
    

  }
  

  // LOGIN Mail
  
//Login Button
function login(){
  var mail11=document.getElementById("mail11").value;
  var pass11=document.getElementById("pass11").value;
  
    
  if(mail11 ==""  || pass11 ==""){
   
		document.getElementById("error11").innerText = "Enter Mailid and Password!";
	    document.getElementById("error11").style.color = "red";
		document.getElementById("error11").style.marginLeft = "20%";
	    return false;

   
  }

  else{
		document.getElementById("error11").innerText = "Login successful ✅";
	       document.getElementById("error11").style.color = "green";
		   document.getElementById("error11").style.marginLeft = "25%";
	       return true;

  }
  
}

