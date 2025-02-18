/*
Type Casting
============
conversion of one type of data into other type is called type casting

1.Implicit(Automatic conversion)
==================================
It is called Type Coersion in Js

2.Explicit conversion(Manual Conversion)
==================================
1.String()
2.Number()
3.Boolean()


*/

//Type Coersion: when Js automatically convert the types is called type coersion
//String conversion: Implicit conversion
let num1="10"+20;//20 will coersed to string "20"
console.log(num1);//1020
console.log(typeof num1);//String

let num2=2+5+"10";//7 will coersed with string "7"+"10"=710
console.log(num2);
console.log(typeof num2);//string

let num3=10+"5"+20;//10 and 20 will coersed to String
console.log(num3);//10520
console.log(typeof num3);//string

let d1="Hi"+true;//true coersed to string
console.log(d1);//hitrue
console.log(typeof d1);

//Number type(-,*,/,%)
console.log("-------Number Coersion------");
console.log("20"+"10"+20);//201020
console.log("20"-10);//20 coersed to number 20-10=10
console.log(typeof ("20"-10));//Number
console.log("100"*2);//100 coersed to number 100*2=200
console.log(typeof ("100"*2));//number

console.log("20"/"2");//"20" and "2" coersed to number 20/2=10
console.log(typeof ("20"/"2"));//number

console.log("hi"*20);//NaN


console.log("------Explicit Conversion------");

let data="200";

console.log(typeof data);//String
console.log('value is: '+data);//200
console.log(data+200);//200200
//addition-string to number
let result=Number(data);
console.log(result);//200
console.log(typeof result);//number
console.log(result+200);//400

console.log(Number("Hello"));//NaN
console.log(Number(true));//1
console.log(Number(false));//0
console.log(Number(null));//0
console.log(Number(undefined));//NaN

console.log("-------Number to String-----");

let num=2000;
console.log(typeof num);//number
console.log(num);//2000
console.log(num-1000);//1000
console.log(num+1000);//3000


let numToStringConvert=String(num);
console.log(numToStringConvert);//"2000"
console.log(typeof numToStringConvert);//String
console.log(numToStringConvert+1000);//20001000
//string into number
console.log(numToStringConvert-1000);//1000

console.log("-----Boolean conversion-------");

//Boolean type
/*
truthy and falsy
truthy means any value in boolean cotext represented as true
nonzero number and nonempty string

falsy: any value in boolean context represented as false
0,"",null,undefined,NaN,false

*/

console.log(Boolean(90));//true
console.log(Boolean(-100));//true
console.log(Boolean("Jay"));//true
console.log(Boolean(true));//true
console.log(Boolean(78.666));//true

console.log(Boolean(0));//false
console.log(Boolean(false));//false
console.log(Boolean(null));//false
console.log(Boolean(""));//false
console.log(Boolean(NaN));//false
console.log(Boolean(undefined));//false

/*
test for any value is NaN(not a number)
*/


console.log(isNaN(1234));//false as 1234 is number

console.log(isNaN("Hello"));//true as hello is not a number

console.log(isNaN(0));//false

console.log("strict equality(===) vs loose equality (==)");

//strict equality vs loose equality (==) it will automatic convert the value

console.log("10" == 10);//true
console.log("10" === 10);//false























































