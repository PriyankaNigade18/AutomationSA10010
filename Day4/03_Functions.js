

/*
function is used to reusability
1.Function declaration

2.Function Expression(modern js)
================
    1.Anonymous function
    2.Arrow function
*/

console.log("------function declaration------");
//function without parameter
function test1()
{
    console.log("Hello all!");
    
}

//calling function
test1();

console.log("------function declaration with parameter------");

function test2(name)//parameters passing
{
    console.log("Welcome "+name);
    
}

//call function
test2("Sandip")//actual data-argument

console.log("------function declaration with parameter with return------");


function test3(num1,num2)
{
return num1+num2;
}


//call the function
let result=test3(10,10);
console.log("addition is: "+result);

console.log("-------Function Expression---------");
console.log("-----Anonymous function:function without name---");

let newTest=function(id,name)
{
    console.log("Student id is: "+id);
    console.log("Student name is: "+name);
    
}

//call the function
newTest(101,"Sarang");

let test4=function(id,name)
{
return `Employee id is: ${id} and Employee name is: ${name}`;
}

//call
console.log(test4(201,"Amit"));


console.log("-------arrow function--------");

let add=(num1,num2)=>{
     //return num1+num2
     console.log("Addition is: "+(num1+num2));
     
    };

//call for return
// let res=add(100,200);
// console.log(res);


//call
add(100,300);









