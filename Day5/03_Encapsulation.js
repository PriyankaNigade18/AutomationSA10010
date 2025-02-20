/*

Encpasulation is process of wrapping data  and functions todether
Purpose = data hiding
in javascript using scope it is possible
*/

class Employee
{
    constructor()
    {
        //private  or local
        let id;
        let fname;

    }
    //getters and setters method to access this private data

    setId(id)
    {
        this.id=id;
    }
    getId()
    {
        return this.id;
    }
    setFname(fname)
    {
        this.fname=fname;
    }
    getFname()
    {
        return this.fname;
    }

}
//access members of class-Using Object
let e1=new Employee();
e1.setId(1818);
e1.setFname("Pooja");
console.log("Id is: "+e1.getId()+" : "+"name is: "+e1.getFname());


console.log("-------------------------");
/*
if amount is greater than 0 then set the amount
*/

class Account{

    constructor()
    {
        let amount;
    }
    
    //using getters and setters
    setAmount(amount)
    {
        if(amount>0)
        {
        this.amount=amount;
        }

    }

    getAmount()
    {
        return this.amount;
    }


}

//create Object

let user1=new Account();
user1.setAmount(0);
console.log(user1.getAmount());

console.log("-----------");

let user2=new Account();
user2.setAmount(1000);
console.log(user2.getAmount());

