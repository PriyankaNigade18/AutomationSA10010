

/*
String is collection of characters

*/

let info="Selenium WebDriver is WebUi automation library";
console.log(info);

//total length of string= length property
console.log("Total length is: "+info.length);//46

let s1="Hello All";
console.log("total length is: "+s1.length);//9

//conversion- toUpperCase() and toLowerCase()
console.log(info.toUpperCase());
console.log(info.toLowerCase());

//get the character at specific index-charAt()
console.log("character at index 4: "+info.charAt(4));//n

//trim(): ignore white space before and after the string
let s2="    welcome all     ";
console.log(s2);
console.log(s2.trim());

//concat()
let s3="Welcome all";
let s4="to learn javascript!";
console.log(s3+" "+s4);
console.log(s3.concat(" "+s4));

//replace()  replaceAll()
let statement="Software testing is related to testing the app!";
console.log(statement);
//Replaces text in a string, using a regular expression or search string.
console.log(statement.replace("testing","*******"));

console.log(statement.replaceAll("testing","########"));

//let info="Selenium WebDriver is WebUi automation library";
//include()
console.log(info.includes("WebUi"));//true


//split(regexp):string[]
let date="Feb 2025";

let month=date.split(" ")[0];
let year=date.split(" ")[1];

console.log("month is: "+month);
console.log("year is: "+year);


/*
let splitDate=date.split(" ");
for(let e of splitDate)
{
    console.log(e);
    
}*/

/*
from the bill amount should be either 5000 or greater that 5000
*/

let bill="Your total amount is 5000";
let data=bill.split(" ")[4];
//String data into number

let amount=Number(data);
if(amount>=5000)
{
    console.log("Correct Amount..Test Pass!");
    
}else{
    console.log("Wrong Amount..Test Fail!");

}


// let d=bill.slice(3,4);
// console.log(d);















