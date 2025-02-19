/*
1.Simple If(true)
2.If-else(true/false)
3.LadderIf(Multiple condition validation)
4.Nested if(Multiple condition validation)
5.switch case(Multiple condition validation)
*/
console.log("---Simple If Demo---");

//year validation
let year=2025;

if(year === 2025)
{
    console.log("true:This is current year!: "+year);
    
}

console.log("-------------");

year=2026;

if(year === 2025)
{
    console.log("true:Year match!: "+year);
    
}

console.log("Done!");//false condition

console.log("-----If-else condition----");

//age validation for voating

let age=10;

if(age>=18)
{
    console.log("true:User is Audult and he/she can voat!");
    
}else{
    console.log("false:User is teanager and he/she can not voat!");

}

console.log("----ladder if-----");

let num=200;

if(num>0)
{
    console.log(num+" is Positive");
    
}else if(num<0)
{
    console.log(num+" is Negative");
    
}else 
{
    console.log(num+" is zero");
    
}

console.log("-----Browser validation------");

let bname="safari";

if(bname === "chrome")
{
    console.log("test case is executing on "+bname);
    
}else if(bname === "edge")
{
    console.log("test case is executing on "+bname);
}else if(bname === "firefox")
{
    console.log("test case is executing on "+bname);
}else{
    console.log("Wrong Browser!"+bname);
}



console.log("-----Nested if Demo-----");
/*
one if condition into other if condition is called nested if

mraks are greater equal than 90---A
marks are greater equal than 95 ----A++
otherwise grade should be B
*/

let marks=83;

if(marks>=90)
{
    if(marks>=95)
    {
        console.log("A++");
        
    }else{
        console.log("A");
        
    }
}
else{
    console.log("B");
    
}

console.log("-----switch case statement-----");

//tarffic scenario key==value

//break statment will exit form loop and switch body

let color="red"

switch (color) {
        case "red":
        console.log("STOP");
        break;

        case "yellow":
        console.log("READY");
        break;

        case "green":
        console.log("GO");
        break;

    default:
        console.log("wrong color!");
        
        break;
}

//role validation with access
let role="editor";

switch (role) {
    case "admin":
        console.log("Admin can access everything!");

        break;
        case "viewer":
            console.log("Viewer can have read only access");
    
            break;

            case "editor":
                console.log("Editor can have edit access");
        
                break;
        

    default:
        console.log("Default its only user and not have any access");
        
        break;
}
































