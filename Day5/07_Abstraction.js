/*
hiding internal implementation of software and provide relevant features to user

In javscript no Abstract class /interface
To achieve this use scope
*/


function Employee(id,fname,basicSal)
{
    this.id=id;
    this.fname=fname;
    this.basicSal=basicSal;
    //this.bonus=10000;
    let bonus=10000;
    // this.calculateBonus=function()
    //         {
    //             finalsal=this.basicSal+this.bonus;
    //             console.log("Including bonus amout is: "+finalsal);
                
    //         }

            let calculateBonus=function()
            {
                finalsal=basicSal+bonus;
                console.log("Including bonus amout is: "+finalsal);
                
            }
            this.display=function()
                {
                    console.log(this.id+" : "+fname);
                    calculateBonus();
                    
                }

}

let e1=new Employee(101,"Jay",20000);
e1.display();
// e1.calculateBonus();
// e1.bonus=40000;
// e1.calculateBonus();