/*
JavaScript Array is collection of similar or differnt data types
Array has multiple method support in js


*/

let arr=[10,20,30,40,50];

console.log(arr);
console.log("Total elements are: "+arr.length);
//specific element from array-as per index
console.log("element at index 3: "+arr[3]);//40
console.log("element form wrong index as 9: "+arr[9]);//undefined

console.log("----Iteration using simple for loop----");

for(let i=0;i<arr.length;i++)
{
    console.log(arr[i]);
    
}

console.log("----Iteration using for...of loop----");
/*
for...of loop iterates over values
for...in loop iterates over index or keys(Object)
*/
for(let e of arr)
{
    console.log(e);//[10,20,30,40,50]
    
}

console.log("----Iteration using for...in loop----");
/*
for...of loop iterates over values
for...in loop iterates over index(array) or keys(Object)
*/

for(let e in arr)
{
    console.log(e);//[0,1,2,3,4]
    
}

console.log("------------------");

for(let e in arr)
    {
        console.log("At index: "+e+" value is="+arr[e]);
        
    }

console.log("------------Array Method-----------");


//add new element in array- push() and unshift()

//push(): Appends new elements to the end of an array, and returns the new length of the array.
let color=["red","blue","pink","purple"];
console.log(color);
console.log("----push()-----");

color.push("black");
console.log(color);

console.log("----unshift()-----");
//unshift():Inserts new elements at the start of an array, and returns the new length of the array
color.unshift("white");
console.log(color);

//to remove element from array pop() and shift()
//pop:Removes the last element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
console.log("----pop()-----");
color.pop();

console.log(color);
//for empty array
let arr2=[];
console.log(arr2);//[]
let newpop=arr2.pop();
console.log(newpop);//undefined
console.log(arr2);//[]
//shift:Removes the first element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
console.log("----shift()-----");

color.shift();
console.log(color);

//[ 'red', 'blue', 'pink', 'purple' ]

//indexOf():Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
let fname=["Ravi","Sameer","Kiran","Raju","Kiran"];
//             0    1        2       3      4 
console.log(fname);
let findex=fname.indexOf("Kiran");//2
console.log("first value index is: "+findex);//2

//get the index of next Kiran=4
let nextIndex=fname.indexOf("Kiran",3);
console.log("second value index is: "+nextIndex);


//[ 'Ravi', 'Sameer', 'Kiran', 'Raju', 'Kiran' ]
//splice():delete any element form any position and add element from same position
//Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
//splice(strat number,delete count,replace)
// let deletedEle=fname.splice(0,1);//strats at 0 index and delete 1 element
// console.log(deletedEle);
// console.log(fname);

let deletedEle=fname.splice(0,1,"Kumar","Jay");//it strats with o index delete 1 element and replace oth position with Kumar
console.log(deletedEle);//[ 'Ravi' ]
console.log(fname);//[ 'Kumar', 'Jay', 'Sameer', 'Kiran', 'Raju', 'Kiran' ]

//slice():Returns a copy of a section of an array. For both start and end, a negative index can be used to indicate an offset from the end of the array. For example, -2 refers to the second to last element of the array.

let newArr=fname.slice(1,4)//starts with 1 and upto lastindex-1(4-1)=3

console.log(newArr);//[ 'Jay', 'Sameer', 'Kiran' ]
console.log(fname);//[ 'Kumar', 'Jay', 'Sameer', 'Kiran', 'Raju', 'Kiran' ]


console.log("-----includes-----");

//includes():Determines whether an array includes a certain element, returning true or false as appropriate.
console.log(fname.includes("Dheeraj"));//false
console.log(fname.includes("Jay"));//true


console.log("-----------Multi D array----------");

let testData=[["admin","admin123"],
                ["Rushi","test123"],
                ["Smita","test123"]];

    console.log("Number of rows: "+testData.length);//3
    console.log("Number of columns: "+testData[0].length);//2
    
    //iterate
    for(let e of testData)
    {
        console.log(e);
        
    }

    console.log("--------------");
    
    //specific row

console.log(testData[0]);//[ 'admin', 'admin123' ]
console.log(testData[1][0]);//"Rushi"
































