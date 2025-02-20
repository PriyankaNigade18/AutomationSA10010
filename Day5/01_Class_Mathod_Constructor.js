
/*
Function: group of statement we write to perfom certain action
Method: Is function which belong to Object
*/
class Student
{
    //constructor
    constructor(id,fname)
    {
        this.id=id;
        this.fname=fname;
    }

//method
/*
 setData(id,fname)
{
    //local
    console.log("Data get set.....");
    //let id=101;
    //Global declaration-this keyword
    // this.id=101; hardcode values
    // this.fname="Sarang";
    //dynamic
    this.id=id;
    this.fname=fname;

}*/


getData()
{
    console.log("id is: "+this.id+" : "+"first name is: "+this.fname);
    
}

}

//object create
let s1=new Student(101,"Jay");
//s1.setData();
//s1.setData(222,"Sneha");
s1.getData();

console.log("--------------");

let s2=new Student(102,"Ram");
//s2.setData(333,"Ram");
s2.getData();