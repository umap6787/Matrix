// ! var let const

// var a1;
// ! var 1a;
// ! var if;
// ! var #a;
// var _b;
// var $a;

// ~declare
var a;

// ~initialise
a=10;
console.log(a);

// ~re-declare
var a;

// ~re-initialize
a=45;
console.log(a);

// ~ declare & initializing
var b=20;

// ? LET

// ~declare
let d;

// ~initialze
d=27;
console.log(d);

// ~re declare
// let d; //! Cannot redeclare block-scoped variable 'd'.

// ~re-initialize
d=25;
console.log(d);

// ~ declare & initializing
let c=96;

// ? CONST
//! declare
// const a; //!'const' declarations must be initialized.
//! initialze
//! re declare
//! re-initialize

// ~ declare & initializing //* this only possible in const
const f=27;
console.log(f);


// ! WINDOWS OBJECT
console.log(window);
var aa=10;
console.log(aa);
console.log(window.aa); //10

let bb=20;
console.log(bb); 
console.log(window.bb); //Undefined

const cc=30;
console.log(cc); 
console.log(window.cc); //Undefined

// ! HOISTING
console.log(r); //undefined
var r=10;

// ! TDZ
//console.log(l); //uncaught reference error: cannot access 'l' before initialization
let l=20;

// console.log(n); //uncaught reference error: cannot access 'n' before initialization
const n=20;


var xa=45;
let xb=60;
const xc=75;
console.log(xa);
console.log(xb);
console.log(xc);




















