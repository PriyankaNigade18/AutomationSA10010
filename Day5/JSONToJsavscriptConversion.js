/*

Json data we can convert into javascript object
JSON.parse()

*/

let testData=`{
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral",
        "text": "Tired of writing endless social media content? Let Content Caddy generate it for you."
    }
}`;

//conevrt jason data to Javascript object
let obj=JSON.parse(testData);

//javascript object---read json body
console.log("id is: "+obj.data.id);

console.log("first name is: "+obj.data.first_name);

