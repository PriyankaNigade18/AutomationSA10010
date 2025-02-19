/*


Object is Key and value pair information
How many ways are there to create object in javascript
===============================================
1.Object literal way
2.Using class level
3.using Constructor function
4.Object.create(): prototype based

*/

//object literal

let Person={
    id:101,
    fname:"Sarang",
    job:"QA"
}

console.log(Person);
console.log("type is: "+typeof Person);//Object

//how to get specific data from object Person.key
console.log("job is: "+Person.job);

//Iterate object

console.log("-------Iteration for Object using for..in loop----");

for(let e in Person)
{
    console.log(e);//in case of Object it print key
    
}

console.log("--------------------");

for(let e in Person)
{
    console.log("At Key: "+e+" value is: "+Person[e]);
    
}










