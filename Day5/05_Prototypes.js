/*
Proptype is object belong to Object or function
We can create reusable method or property using prototype
*/
// create any property(length in Array/String)

function EmployeeData(id,name)
{
    this.id=id;
    this.name=name;

}

//design new property which is common for all object-->prototype

EmployeeData.prototype.language="Javascript";

let e1=new EmployeeData(101,"Amit");
//e1.language="Javascript";
console.log("id is: "+e1.id+": Name is: "+e1.name+" : language is: "+e1.language);

console.log("------------------");

let e2=new EmployeeData(102,"Smita");
console.log("id is: "+e2.id+": Name is: "+e2.name+" : language is: "+e2.language);

console.log("--------------Reusable method-----------");

//string scenario
let data="Testing123        ";
console.log("length is: "+data.length);
//only character length
console.log("Character length is: "+data.trim().length);//10
//I want to design new function which give us truelength
String.prototype.trueLength=function()
                            {
                                return this.trim().length;
                            }

console.log("True length for string is: "+data.trueLength());//10

