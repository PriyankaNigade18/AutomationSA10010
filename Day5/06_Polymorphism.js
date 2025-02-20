/*
Polymorphism is one thing we can reuse in multiple form
purpose: Reusability
Types:
=============
1.compile time polymorphism (Method overloading)
2.RunTime polymorphism (Method overriding)

Rule
================
Method Overloading (Compiletime poly) not possible
RunTime polymorphism (Method overriding) is possible

*/

class Test
{

print()
{
    console.log("Print 1....Hello");
    
}

print(fname)
{
    console.log("Print 2....Hello "+fname);
    
}

print(fname,id)
{
    console.log("Print 3...Hello "+fname+" : id is: "+id);
    
}


}

console.log("----------------Method Overloading(not possible)----------");
/*
Mathod can be overrided when both classes have relation Is-A
both class have same name method
then child class override parent class method
*/
//object
let t1=new Test();
t1.print();


console.log("----------------Method Overriding----------");

class Furit{
    eat()
    {
        console.log("Enjoy fruit......");
        
    }
}


class Orange extends Furit{

    //overrided method
    eat()
    {
        console.log("Enjoy Orange fruit......");
        
    }
}


let f1=new Furit();
f1.eat();

console.log("--------------");

let f2=new Orange();
f2.eat();


