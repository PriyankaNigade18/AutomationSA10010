

add();
/*

Variable is name of storage location where we can store data

var(not recommends to follow)
===============================
1.scope: Functional and Global scope
blocked scope
2.redeclaration is allowed


modern Javascript
=====================
let
=====
1.scope: Blocked scope + global
2.redeclaration is not allowed

blocked scope
{
}

3. variables are mmutable

const
==========
1.scope: Blocked scope + global
2.redeclaration is not allowed
3.variables are immutable

*/

//Global
var fname="Jay";
let id=101;
const email="jay@gmail.com";

console.log(".............Calling from Global scope............");
console.log(`fname is: ${fname}`);
console.log(`id is: ${id}`);
console.log(`email is: ${email}`);


function show()
{

console.log("------Calling Global data from  functional scope-------")

console.log(`fname is: ${fname}`);
console.log(`id is: ${id}`);
console.log(`email is: ${email}`);
}

//call the function
show();

/*
Any variable declare within a function is  local variable and it has scope 
which is functional
so variable can be accessed within function only
*/

function display()
{
    let uname="Sarang";
    var marks=90;
    const pi=3.14;
    console.log(`username is: ${uname}`);
    console.log(`marks is: ${marks}`);
    console.log(`pi is: ${pi}`);
    
}

//calling function
display();

//console.log(`pi is: ${pi}`);//ReferenceError: pi is not defined
//console.log(`username is: ${uname}`);//ReferenceError: uname is not defined
//console.log(`'marks is: ${marks}`);//ReferenceError: marks is not defined

//block scope
console.log("------Blocked scope runnig------");
if(true)
{
    let bname="chrome";
    var bversion=113;
    console.log(`browser name is: ${bname}`);
    console.log(`browser version is: ${bversion}`);
}

console.log(`browser version is: ${bversion}`);
//console.log(`browser name is: ${bname}`);//ReferenceError: bname is not defined

//redeclaration about variable

var x;
console.log(x);//undefined

let y;
console.log(y);//undefined


//const z;//'const' declarations must be initialized.
//problem in var declaration - as you redeclared you will get updated data
var data="Testing";
var data="Programming";
data="coding";
console.log(data);

//Cannot redeclare block-scoped variable 'testData'.
//let testData="chrome";
let testData="firefox";
testData="edge";
console.log(testData);

//Cannot redeclare block-scoped variable 'value'./reassignment for const not allowed
const value="IsFinal";
//const value="test";

//value="test";//TypeError: Assignment to constant variable.

console.log(value);


console.log("------const variable------");

const cname="AISSPMS";
//const cname="Wadia";
//cname="wadia";//TypeError: Assignment to constant variable.
console.log(cname);


console.log("-------------Hoisting------------");

/*
Hoisting is a JavaScript feature that moves variable, function, and class declarations to the top 
of their scope before the code is executed.
 This allows you to use these declarations before they appear in the code. 

How hoisting works
The JavaScript engine parses the declarations during compilation. 
The declarations are moved to the top of their scope, but the assignments are left in place. 
You can use the declarations before they appear in the code. 


When hoisting can be useful 
Hoisting can help avoid errors related to undeclared variables.
It can make code more readable and maintainable.
When hoisting can be problematic
Hoisting can cause undesirable outcomes in your program. 

It's easy to reference a function before it is defined in the file,
 which can harm readability and maintainability. 

*/


console.log(num1);

var num1=1818;

console.log(num1);



//console.log(num2);//ReferenceError: Cannot access 'num2' before initialization

//let num2=9090;

//ReferenceError: Cannot access 'num3' before initialization
//console.log(num3);

//const num3=90;


//hoisting allowed to function declaration but not function expression


add();

//function declaration type in Js
function add()
{
    console.log("Calling add function......");
}


add();


 //calling function
 //sum();//ReferenceError: sum is not defined


//function expression 1. anonymous function 2. arraow function

let sum=function()
    {   
        console.log("Calling sum function..... ")
    }

    //calling function
    sum();

























