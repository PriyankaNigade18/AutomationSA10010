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

console.log("---------Class based object---------");


class Color{

    constructor(cname)
    {
        this.cname=cname;
    }

    display()
    {
        console.log("Color selected is: "+this.cname);
        
    }
}
//object create
let c1=new Color("Red");
c1.display();


console.log("--------Constructor Function based Object--------");

/* constructor function should start name with capital letter
*/

function Student(id,fname,subject)
{
    this.id=id;
    this.fname=fname;
    this.subject=subject;
    
    //function
    this.print=function()
    {
        console.log("id: "+this.id+" : "+"name: "+this.fname+" : "+"subject: "+this.subject);
        
    }

}

//for constructor function Object creation 
let s1=new Student(101,"Raju","testing");
s1.print();

console.log("---------Using Object.create(): this is prototype based----");

//Test is prototype
let Test={

    subject:"testing",
    marks:100
}

//Creates an object that has the specified prototype or that has null prototype.
let t1=Object.create(Test);
console.log(t1.subject);
console.log(t1.marks);




















