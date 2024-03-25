function id(){

var submit=document.getElementById("btn");
 var cust=document.getElementById("cust").value.trim();
 var error=document.getElementById("cerror");
 console.log(cust)
        if(cust.length==8){
        console.log("Valid Id")
        submit.removeAttribute('disabled');
         error.innerHTML=""
}
else{
 console.log("Please enter the valid customer id")

        error.innerHTML="Please enter the valid Customer id"
        error.style.color='red';
        submit.setAttribute('disabled','');
        }

}


//function vendor(){
//var submit=document.getElementById("submit");
//var ven=document.getElementById("ven");
//var error1=document.getElementById("verror");
//console.log(ven.value)
//        if(ven.value!=="0"){
//       console.log("Valid vendor")
//        submit.removeAttribute('disabled');
//         error1.innerHTML=""
//        }
//        else{
//          console.log("Please select the valid vendor")
//
//                        error1.innerHTML="Please select the valid Vendor"
//                        error1.style.color='red';
//                        submit.setAttribute('disabled','')
//                        }
//}

function amount(){
var submit=document.getElementById("btn");
  var amnt=document.getElementById("amnt");
        var amount = parseFloat(amnt.value);
        var error2=document.getElementById("aerror");
             console.log(amount);
              if(amount>10 || amount<10000 || !isNaN(amount)){
             console.log("Valid amount")
              submit.removeAttribute('disabled')
               error2.innerHTML=""
                }
else{
 console.log("Please Enter Valid Recharge Amount")

                   error2.innerHTML="Please enter the valid Recharge Amount"
                   error2.style.color='red';
                   submit.setAttribute('disabled','');
                   }
}

//function type(){
//var submit=document.getElementById("submit");
//var rtype=document.getElementById("rtype");
//var error3=document.getElementById("terror");
//console.log(rtype.value)
//        if(rtype.value!=="0"){
//         console.log("valid Recharge Type")
//          submit.removeAttribute('disabled');
//        }
//       else{
//       console.log("Please select the valid vendor")
//
//                             error3.innerHTML="Please select the valid Vendor"
//                             error3.style.color='red';
//                             submit.setAttribute('disabled','');
//                             }
//}

//function check(){
//var submit=document.getElementById("submit");
// var check=document.getElementById("check")
//        var error4=document.getElementById("box")
//        console.log(check.value)
//        if(check.checked){
//         console.log("Checked")
//          submit.removeAttribute('disabled');
//        }
//        else{
//
//        error4.innerHTML="Please Accept the Condition"
//        error4.style.color='red';
//        submit.setAttribute('disabled','');
//        }
//
//}