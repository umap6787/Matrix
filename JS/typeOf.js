// ! typeOf - Typeof operator is used to check the datatype of the variable.
console.log(typeof "a");    //string
console.log(typeof 123);    //number
console.log(typeof 1.4);    //number
 console.log(typeof null); //object
console.log(typeof undefined); //undefined
console.log(typeof 1n); //bidint
console.log(typeof []); // object
console.log(typeof {}); //object
console.log(typeof function(){}); //function
console.log(typeof NaN); //number
console.log(typeof emp); //undefined
console.log(typeof true); //boolean
console.log(typeof ""); //string


// ? if we use typeof typeof at a function it will be string
console.log(typeof typeof null); //string

console.log(typeof 20+"JAVA");  //numberJAVA
console.log(typeof (20+"JAVA"));  //string

console.log(typeof null+"10");  //object10
console.log(typeof NaN+NaN);    //numberNaN
console.log(typeof true+10);    //boolean10
































