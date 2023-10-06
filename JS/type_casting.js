// ! IMOLICIT CONVERSION
// number+string   => string
// string+number   => string
// string+string   => string
// number+number   => number
// number+boolean  => number
// boolean+number  => number
// boolean+string  => string
// string+boolean  => string
// boolean-string  => number
// string-boolean  => number
// boolean+boolean => number

console.log(10+"50");       //1050
let a=10;
let b="50";
let sum=a+b;
console.log(typeof a);      //number
console.log(typeof b);      //string
console.log(typeof sum);    //string

console.log(10+"a");        //10a
console.log("a"+"a");       //aa

console.log(50-"10");       //40
console.log(50*"10");       //500
console.log(50/"10");       //5
console.log(50%"10");       //0

console.log(10+true);         //11  --> true is consider as 1  ==> (10+1)
console.log(10+false);        //10  --> false is consider as 0 ==> (10+0)
console.log(true-false);      //1   --> (1-0)
console.log(true+true);       //2   --> (1-0)
console.log(false-true);      //-1
console.log(false-false);     //0
console.log(true-"10");       //-9
console.log(true+"10");       //true10
console.log(false-"10");      //-10

let x=prompt("Enter the num1"); //6
let y=prompt("Enter the num2"); //9
console.log(x+y);               //69
console.log(typeof x+y);        //string10
console.log(typeof (x+y));      //string

console.log(10+null);       //10
console.log(10+NaN);        //NaN
console.log(NaN+NaN);       //NaN
console.log(10+undefined);  //NaN
console.log("a"-"b");       //NaN
console.log(10-"b");        //NaN


// ! EXPLICIT CONVERTION
let a1="100";
let a2="web10";
let a3="10web";
let a4="web";
console.log(Number(a1));            //100
console.log( typeof Number(a1));    //number
console.log(Number(a2));            //NaN --> not a number
console.log(typeof Number(a2));     //number
console.log(Number(a3));            //NaN --> not a number
console.log(typeof Number(a3));     //number
console.log(Number(a4));            //NaN --> not a number
console.log(typeof Number(a4));     //number

//? parseInt parseFloat can convert number and charecter
console.log(parseInt(a1));  //100
console.log(parseInt(a2));  //NaN
console.log(parseInt(a3));  //10
console.log(parseInt(a4));  //NaN

console.log(parseFloat(a1));  //100
console.log(parseFloat(a2));  //NaN
console.log(parseFloat(a3));  //10
console.log(parseFloat(a4));  //NaN

console.log(parseInt(108.25));      //108
console.log(parseFloat("108.25"));  //108.25

console.log(Number(true));      //1
console.log(Number(false));     //0

console.log(parseFloat(true));  //NaN
console.log(parseInt(true));    //NaN

let num=Number(prompt("enter the number"));
console.log(typeof num);    //number



























