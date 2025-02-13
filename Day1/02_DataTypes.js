
/*
DataTypes used to define the type for data
Js support two types
1.Primitive 
============
    1.Number
    2.String
    3.Boolean
    4.Null
    5.Undefined
    6.BigInt
    7.Symbol(not requried)

2.NonPrimitive( everything as Object)
====================
    1.Object
    2.Array


*/

/* Variables are used to store data
Keywords to declare variable
=============
 var (older not used)

 modern Js
 ==============
 let 
 const
 
 Js is dynamic check and loosely coupled language
*/

//typeof opertor: get the type of that data/object

//Number : int / decimal digit
let id=1818;
console.log("Value of id is: "+id);
console.log("Type of id: "+typeof id);

let marks=78.88;

console.log("Value is: "+marks);
console.log("Type is: "+typeof marks);

/*
String type in js
1.single quoat ''
2.double quoat ""
3.back tick/ template String 

*/

let fname='Jay';
let lname="Nigade";
let userName=`Sarang`;

console.log('first name is: '+fname);
console.log("type of fname: "+typeof fname);


console.log('lname name is: '+lname);
console.log("type of lname: "+typeof lname);


console.log('userName is: '+userName);
console.log("type of UserName: "+typeof userName);

//template string  `` back tick

//using string you cant write in this way
// let info="My Name is Priyanka,
// my qualification is ME in Computers and I am having 
// total 15+ years of experience in software testing.
// I am ISTQB certified tester";

let trainerName="Priyanka",
    qualification="ME Computers",
    years="15+",
    certificate="ISTQB";

let info=`My Name is ${trainerName},
my qualification is ${qualification} and I am having 
total ${years} years of experience in software testing.
I am ${certificate} certified tester`;

console.log(info);


//Boolean true/false value

let isActive=true;
console.log(`value is: ${isActive}`);//true
console.log(`type is: ${typeof isActive}`);//boolean

let currentStatus=false;

console.log(`value is: ${currentStatus}`);//false
console.log(`type is: ${typeof currentStatus}`);//boolean

/*
undefined: variable is declare and if it not initialize
by defualt value and the type will be undefined
*/

let num;

console.log(`value is: ${num}`);
console.log(`type of num: ${typeof num}`);


//null type means unknown or not a value

/*
This is bug in typeof operator in Js
as for null type it shows Object
*/
let value=null;

console.log(`value is: ${value}`);//null
console.log(`type  of null variable is: ${ typeof value}`);//null


//BigInt: big interger value

//max value for integer/Number type
console.log(Number.MAX_VALUE);//1.7976931348623157e+308

let bigNum=797693134862315788888888888n;//bigInt
console.log(`value is: ${bigNum}`);
console.log(`type is: ${typeof bigNum}`);



//Symbol-not required
let newSymbol=Symbol('id');
console.log(newSymbol);
console.log(typeof newSymbol);


//Noprimitive  data type
//Object example: 1. Object Literal

let person={
    id:101,
    fname:"Sarang",
    email:"sarang@gmail.com"

}


//confirm is it really object
console.log(person);
console.log(typeof person);

//how to get detials from object

console.log(`person id is: ${person.id}`);
console.log(`person first name is: ${person.fname}`);









































