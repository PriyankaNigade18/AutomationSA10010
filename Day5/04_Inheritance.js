/*
Inheritance:
Aquaring properties of one class into another class is called inheritance
Purpose: 1.avoid code duplication
        2.For reusability
        3.implement Runtime polymorphism

    B extends A===> A is parent and B is child
    Child can access child property +Parent property
    Parent can access only parent property
    types
    ==========================
     single,multilevel,hierarchical


*/


class Vehical{

    breakFeature()
    {
        console.log("Vehical....break()");
        
    }
}


class Car extends Vehical// multilevel inheritance
{
    startcar()
    {
        console.log("Car......strat()");
        
    }

    refule()
    {
        console.log("Car......refule()");
               
    }
    stop()
    {
        console.log("Car......stop()");
        
    }
}


class BMW extends Car//single level inheritance
{
    autoEngine()
    {
        console.log("BMW.....autoEngine()");
        
    }

}

class Audi extends Car//hierarchical inheritance
{
autoGear()
{
    console.log("Audi.........autoGear()");
    
}
}

/*valid scenarios where you can access properties

1. parent class ref and parent class object(Car)= Parent properties

2. child class ref and child class object (BMW)= child+ parent

*/
console.log("1. parent class ref and parent class object(Car)= Parent properties");
let c1=new Car();
c1.startcar();
c1.refule();
c1.stop();
//c1.autoEngine();//child class method-error
//multilevel--->vehical method access
c1.breakFeature();//inherited
console.log("2. child class ref and child class object (BMW)= child+ parent");

let c2=new BMW();
c2.startcar();//inherited method
c2.refule();//inherited method
c2.stop();//inherited method
c2.autoEngine();//individual method
c2.breakFeature();

console.log("-----------");
let c3=new Vehical()
c3.breakFeature();
//c3.startcar();//TypeError: c3.startcar is not a function

console.log("------------");
let c4=new Audi();
c4.startcar();
c4.refule();
c4.stop();
c4.breakFeature();
c4.autoGear();
//c4.autoEngine();//error-TypeError: c4.autoEngine is not a function//

