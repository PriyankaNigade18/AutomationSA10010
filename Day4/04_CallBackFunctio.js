/*

What is call back function/ what is higher order function in js
==============================================================
when we pass and function as parameter or argument to call function is called 
call back or higher order function
*/
//main function for execution
function greet(name,callbackfun)//variables(parameters)
{
console.log("Hello "+name);
callbackfun();

}

//call back function
function display()
{
    console.log("Welcome to learn Call Back function!");
    
}

//call the function to run
greet("Pooja",display);


//dont write () whenever you are passing function as argument or parameter


console.log("------------------------------------");


function add(a,b)
{
    return a+b;
}

function sub(a,b)
{
    return a-b;
}
function mul(a,b)
{
    return a*b;
}
function div(a,b)
{
    return a/b;
}

function calculate(a,b,fun)
{
    let res=fun(a,b);
    return res;
}


//call
console.log("Addition is:"+calculate(100,20,add));//add is call back function


console.log("subtraction is:"+calculate(100,20,sub));

console.log("multiplication is:"+calculate(100,20,mul));

console.log("division is:"+calculate(100,20,div));

