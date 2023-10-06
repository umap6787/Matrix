console.log("object");

//! NUMBER:
let a=10;
console.log(typeof a); //number
let b=4.6;
console.log(typeof b); //number

// ! 
let c=99999999999999999;
console.log(typeof c); //number
console.log(c); //100000000000000000  //it will round of the values
//we cannot give the 16 digits number

let d=9999999999999999n;
console.log(typeof d); //BigInt

let e=1n;
console.log(typeof e); //BigInt

// ! null -> empty -> null called as bug(because null is primitive data type)
// ? null is considered as big/error in JS because the null belongs to primitive datatype but the typeof null is object.
let f=null;
console.log(f); //null
console.log(typeof f); //object

let g=prompt("Enter the number");
console.log(g); //user i/p (or) null
console.log(typeof g); //string (or) object

// ! undefined (it is a datatype)
let h=undefined;
console.log(h); //undefined
console.log(typeof h); //undefined

var i;
console.log(i); //undefined

// ! not-defined (it is an error)
// ~ NOTE: the type of not-defined is un-defined
console.log(typeof j); //undefined

// ! boolean
let k=true;
console.log(typeof h); //boolean

let l=false;
console.log(typeof l); //boolean

// !string
// ? three ways of declaring a string
// ? 1. double quotes
// ? 2. single quotes
// ? 3. interpolation/template string
//within the string we cannot able to break the line
// to break the line we need to go for \n 
let m="developer \n umapathy";
console.log(m);   //developer 
                    //umapathy
console.log(typeof m); //string

let n='umapathy';
console.log(n); //umapathy
console.log(typeof n); //string

let o=`umapathy`;
console.log(o); //umapathy
console.log(typeof o); //string

let p=10;
let q=20;
console.log("the value of a is: "+p); //the value of a is: 10
console.log("the value of a is: "+p+q); //the value of a is: 1020
console.log('the value of a is: '+p); //the value of a is: 10

// ! interpolation or template string
// ? the value of the variable can be fetched along with the string
// we can fetch the value of the variable along within the string
//  we can break the string
console.log(`the value of a is: `+p); //the value of a is: 10
console.log(`the value of
 a is: ${p}`);   //the value of 
                    //a is: 10


























