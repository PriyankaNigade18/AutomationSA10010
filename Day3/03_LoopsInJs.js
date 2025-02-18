/*

1.for loop:Number of iterations are known (calendar,list/menu/dropdown)

2.while loop:Entry control loop-Number of iterations are not known


3.do while loop:Exit control loop-one time execution without matter what condition it is


*/

console.log("-----for loop-----");

//print Hello 5 time

for(let i=1;i<=5;i++)
{
    console.log("Hello");
    
}

console.log("------------");

//print 1 to 10 number
for(let i=1;i<=10;i++)
{
    console.log(i);
    
}
console.log("------------");
//10 to 1
for(let i=10;i>=1;i--)
{
    console.log(i);
    
}

console.log("------------");

//print all even number upto 10
for(let i=1;i<=10;i++)
{
    if(i%2==0)
    {
        console.log("Even number: "+i);
        
    }
}

console.log("------------");
/* by default for loop condition is true 
so this will run infinite time Hi in console

for(;;)
{
    console.log("Hi");
    
}*/

console.log("---while loop-----");

//welcome 10 time

let i=1;

while(i<=10)
{
    console.log("welcome!");
      i++; 
}

//sum of natural number 100
//1+2+3+4+..+100=5050

let num=1,sum=0;
while(num<=100)
{
    sum=sum+num;
    num++;

}

console.log("Sum of 100 natural numbers: "+sum);

//factoral of 5!=5*4*3*2*1=120

let fact=1;
for(let n=5;n>=1;n--)
{
fact=fact*n;
}

console.log("foctorial for 5 is: "+fact);

console.log("--------do while------");

//one time execution without matter what condition it is

let a=1;

do{
    console.log("Bye All!");
    a++;//2

}while(a>=10);//condition is false

console.log("-------------------");

//break
for(let k=1;k<=10;k++)
{
    if(k>5)
    {
        break;//exit form loop
    }else
    {
        console.log(k);
        
    }
}

console.log("-------------");

for(let k=1;k<=10;k++)
{
    if(k==5)
    {
        continue;
    }else{
        console.log(k);
        
    }
}




