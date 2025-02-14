

//Arithmetic operator
let a=10,b=5;

console.log("Addition is: "+(a+b));
console.log(`Subtraction is: ${a-b}`);
console.log(`Multiplication is: ${a*b}`);
console.log(`division is: ${a/b}`);
console.log(`modulus is: ${a%b}`);

console.log(90/0);//Infinity
console.log(-90/0);//-Infinity
console.log("hi"/0);//NaN not a number
console.log(0/0);//NaN

//String + (concatenation)
console.log("10"+10);//1010

/*
increement and decrement
a=10;                      b=20;
a++ : post increment       b-- :post decrement
++a : Pre increment         --b: pre decrement

a=a+1                       b=b-1
*/


let a1=100;
console.log(a1);//100
console.log(a1++);//100
console.log(a1);//101


let b1=200;
console.log(b1);//200
console.log(++b1);//201

let x=90;
let y=x++;//value will assign first the increment 
console.log(x);//91
console.log(y);//90


let c=189;
let d=c++;
console.log(c);//190
console.log(d);//189

//post decrement
let m=188;
let n=m--;
console.log(m);//187
console.log(n);//188

let p=145;
let q=++p;
console.log(p);//146
console.log(q);//146

let u=567;
let v=++u;
console.log(u);//568
console.log(v);//568

//pre decrement
let i=689;
let j=--i;
console.log(i);//688
console.log(j);//688


/*
Relational operators
< less than
<= less than equal to
> greater than
>=greter than equal to
!= not equal

Equality
========
Strict equality
===

loose equality
==

test data
========
p=q=146 m=187 n=188 i=j=688
*/ 

console.log(p>i);//false
console.log(p>=q);//true
console.log(i>=m);//true
console.log(m<=n);//true
console.log(i!=n);//true
console.log(j>n);//true
console.log(p>m);//false
console.log(m<n);//true

console.log(i==j);//true

//loose equality == 
console.log("10" == 10);//true

//strict equality : look for value and type of value

console.log("10" === 10);//false

//Logical operators
/*
  a     b         a&&b (And)&&       a||b(Or) ||    (not) a!
 true  true        true               true             false  
 true   false       false             true             false
 false   true      false              true              true
 false  false       false             false            true
*/

console.log("------Logical opertaor-----------");

console.log((p==q)  && (i==j));//true
console.log((p==q)  && (i<j));//false
console.log((p>q)  && (i==j));//false
console.log((p!=q)  && (i!=j));//false


console.log((p==q)  || (i==j));//true
console.log((p==q)  || (i<j));//true
console.log((p>q)   || (i==j));//true
console.log((p!=q)  ||  (i!=j));//false

console.log("------not ! operator-----");

console.log(p==q);//true

console.log(!p==q);//false

console.log(null == undefined);//true
console.log(null === undefined);//false


console.log(false+1);//1
console.log(true+1);//2
console.log(null+1);//1
console.log(undefined+100);//NAN
console.log(true+true);//2
console.log(true+false);//1
console.log(""+10);//10

console.log(false === null);
console.log(false == null);//values are different










































