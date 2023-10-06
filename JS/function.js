// NOTE: WHENEVER THE FUNCTION NAME IS CONSOLED THE RESULT WILL BE THE ENTIRE FUNCTION DECLARATION

// ! ANONYMOUS FUNCTION
// function(){
//     console.log("java script");
// }
// () //? Uncaught SyntaxError: Function statements require a function name

// ! NAMED FUNCTION
function demo(){
    console.log("Flower");
}; //whenevere we calling the method we need to terminate this line by going next line or using semi-colon
demo()  //Flower

//  ! FUNCTION WITH EXPRESSION // when we initialise the function to the variable whole expression is called as FWE
let test=function(){
    console.log("naguu");
}
test()  //naguu

let test1=function mark(){
    console.log("nagu");
}
// mark()  //? Uncaught ReferenceError: mark is not defined
test1() //nagu

// ! IMPLICIT RETURN
//WHENEVER WE ARE NOT RETURNING ANYTHING OUTSIDE A FUNCTION IT IS CALLED AS IMPLICITE RETURN. EVEN THOUGH RETURN KEYWORD IS USED INSIDE THE FUNCTION IF IT IS NOT RETURNING ANY VALUE THEN IT WILL BE CONSIDERED AS IMPLICITE RETURN.
function uma(){
    console.log("object");  //object
    return;
}
console.log(uma);       //ƒ uma(){
                            // console.log("object");
                        //}
console.log(uma());  //undefined

// ! EXPLICIT RETURN
// WHENEVER WE ARE RETURNING VALUIE OUTSIDE A FUNCTION IT IS CALLED AS EXPLICITE RETURN.
function ums(){
    console.log("object");  //object
    return 10;
}
console.log(ums());  //10

// ~ NOTE:
// WHENEVER THERE IS A RETURN EXPRESSION INSIDE A FUNCTION, THE FUNCTION INVOKE STATEMENT SHOULD BE CONSOLED OUTSIDE THE FUNCTION TO GET THE RESULT OF RETURNED EXPRESSION.
// WHENEVER A FUNCTION INVOKE STATEMENT CONSOLED OUTSIDE THE FUNCTION WITHOUT A RETURN EXPRESSION INSIDE THE FUNCTION THEN THE RESULT WILL BE UNDEFINED.

// ! ---------------------------------------------------------------------------

// ! PARAMETERS AND ARGUMENTS:
// the variables that are declared in the function DECLARATION are called as Parameters.
// the values that are specified is called as arguments.where the arguments are initialized to the Parameters.

function add(a,b){
    console.log(a,b);
    console.log(a+b); 
}
add(10,20)
add("Uma","pathy")
add(Number(prompt("enter a value")),Number(prompt("enter b value")))

// ! TYPES OF FUNCTIONS

//~ 1. ANONYMOUS Function -> //?A FUNCTION WITHOUT NAME IS CALLED AS... 
                             //? IT CANNOT BE EXECUTED ALONE. BUT, IT CAN BE EXECUTED WITH THE HELP OF OTHER FUNCTION
// function(){
//     console.log("java script");
// }
// () //? Uncaught SyntaxError: Function statements require a function name
//! ====================================================================

//~ 2. NAMED Function --> // NAMED FUNCTION IS A NORMAL FUNCTION WHICH HAS NORMAL NAME.
function demo(){
    console.log("Flower");
} //whenevere we calling the method we need to terminate this line by going next line or using semi-colon
demo()  //Flower
//! ====================================================================

//~ 3. FUNCTION WITH EXPRESSION --> WHENEVER A FUNCTION IS INITIALIZED AS A VALUE TO THE VARIABLE THEN THE WHOLE EXPRESSION IS CALLED AS FUNCTION WITH EXPRESSION
                                // WHENEVER A Function IS InITIALIZED AS A VALUE TO THE VARIABLE THE Function should be called or invoke with VARIABLE Name. AFTER TERMINATING THE Function DECLARATION.                             
let tests=function(){
    console.log("naguu");
}
tests()  //naguu
                                
let tests1=function mark(){
  console.log("nagu");
}
// mark()  //? Uncaught ReferenceError: mark is not defined
tests1() //nagu
//! ====================================================================

//~ 4. FIRST CLASS FUNCTION / FIRST CITIZEN FUNCTION --> WHENEVER THE FUNCTION IS INITIALIZED AS A VALUE TO THE VARIABLE ONLY THE FUNCTION IS CALLED AS,,,,,
let test2=function(){
    console.log("object");
}
test2()
//! ====================================================================

//~ 5. ARROW FUNCTION --> it consits of fat arrow where it does not have function keyword and then identifier
//~ arrow function reduces the function syntax 
//~ it cannot be executed AudioListener. where, it need to be initilized to a variable and than it should be invoke with the variable name.
//& syntax -->    ( ) => { }
let a=()=>{
    console.log("arrow function");
}
a()

// ! RULES:
// ? 1 --> whenever there is a single statement inside the function no need to declare a block.
let a1=()=>console.log("Rule 1 of arrow function");
a1();
//! --------------------------------------------------------------------
// ? 2 --> whenever there is a multiple statements a block should be declare.
let b1=()=>{
    console.log("Statement 1");
    console.log("Statement 2");
}
b1();
//! --------------------------------------------------------------------

// ? 3 --> whenever there is a return keyword inside a function the block should be declared
let c1=()=>{return}
console.log(c1());
//! --------------------------------------------------------------------

// ? 4 --> whenever there is a return expression inside a function a invoke statement should be consoled outside the function
let d1=()=>{return 10}
console.log(d1());
//! ====================================================================
//~ 6. HIGHER ORDERED FUNCTION - it accept another function as an argument
//~ 7. CALL BACK FUNCTION
//* a function which accepts another function as an argument is called as hof
//* a function which is passed as a argument to another is called as cbf
//* hof dose two task 1.it accepts another function as a argument 2.it calles and invoke that function.
//* call back function builds a relationship b/w 2 function where multiple operations can be performed
//* JS synchronous but we can make it asynchronous using hof & cbf={}
//? EXAMPLE 1
function hof(){
    console.log("HIGHER ORDERED FUNCTION");
}
hof(cbf())

hof(cbf)    //here cbf will act like a parameter not as calling function and it wont get executed for cbf it only execute hof.

function cbf(){
    console.log("CALL BACK FUNCTION");
}
//& OUTPUT
//  CALL BACK FUNCTION
//  HIGHER ORDERED FUNCTION
//  HIGHER ORDERED FUNCTION
//!--------------------------------------------------------------------
//? EXAMPLE 2
function hof1(result){
    result()    //CALL BACK FUNCTION
    console.log("HIGHER ORDERED FUNCTION");
    result()    //CALL BACK FUNCTION
}

hof1(cbf1)

function cbf1(){    //this wont be called
    console.log("CALL BACK FUNCTION");
}
//& OUTPUT
//  CALL BACK FUNCTION
//  HIGHER ORDERED FUNCTION
//  CALL BACK FUNCTION
//!--------------------------------------------------------------------
//? EXAMPLE 3
function sum(a,b,task){ //CALL BACK FUNCTION(likes) //arrow function is initialized to task
    console.log(task(3,5)); //3,5 initialized to x,y
    console.log(task(a,b)); //a,b are arguments of task function
}
sum(10,20,(x,y)=>{return (x+y)})   //HIGHER ORDERED FUNCTION(likes)
//& OUTPUT
// 8
// 30
//!-------------------------------------------------------------------
//? EXAMPLE 4
function opr(a,b,task){
    task(a,b)
}
opr(10,20,(x,y) => {
    console.log(x+y);
    console.log(x-y);
    console.log(x*y);
})
//& OUTPUT
// 30
// -10
// 200
//! ====================================================================

//~ 8. NESTED FUNCTION

// ? a function inside another function is called as nested function. when nested function is invoking using JS currying a child function should be return to parent function.

function gp(){
    let gp_p="20acre";
    let gp_m=80000;
    console.log(`The grand parents property is ${gp_p} and ${gp_m}`);
    function p(){
        let p_p="10acre";
        let p_m="60000";
        console.log(`The parents property is ${p_p} and ${p_m}`);
        console.log(`The parents property is ${gp_p}`);
        function c(){
            let c_p="2acre";
            let c_m="20000";
            console.log(`The child property is ${c_p} and ${c_m}`);
        }
        // c()
        return c;
    }
    // p()
    return p;
}
// gp()
gp()()() //java currying function
// ? lexical scope -> JS engine will search for the variable in the global scope when it is not available in local scope
// ? it is unidirectional
// ? if will occur only because of closure (which hold the variable in out of the function) 
// ? fetch the data from (gp -> p -> c) or (gp -> c) not (c -> p -> gp)
//& gp property is global scope 

// closure is the combination of function and scope. closure will holds the data of parent function which is required for the child function even when the parent function is out of the call stack. 
// closure will not hold all the data of the parent function where it will hold only the required data to the child function from the parent function.

// ! LEXICAL SCOPE:
// the ability of the JS engine to search for a variable in the global scope or outer scope whenever it is not available in the local scope. 
// it is uni-directional it is not bi-directional which means parents function data can be fetch by child function but child function data cannot be fetch by parent function. 

// !====================================================================

//~ 9. IMIDIATE INVOKE FUNCTION EXPRESSION

// a function which is declared inside the parantisis is called as imidiate invoke function expression. 
// IIFE function should be invoke right after the declaration
// it is only one time usable function, we cannot reuse the code again and again (eg: validation of otp) 
// anonumous function can be executed using IIFE function.
// (function (){
//     console.log("IIFE");
// })
// ()    //& IIFE
//()  //&function.js:260 Uncaught TypeError: (intermediate value)(...) is not a function.

// !=====================================================================
//~ 10.RECURTION FUNCTION
// a function calling itself again and again is called as recurtion function.
// it should be specify with the condition to make use of that function.
// a function recurtion function should be called inside the specified condition after decrement or incrementing statement.
// if the recution function is called without the condition maximum size of the call stack will be excided.
let n=2
function res(){
    console.log("Recursion Function1");
    if(n>0){
        n--;
        res()
        console.log("Recursion Function");
    }
}
res()

// & output:
// Recursion Function1
// Recursion Function1
// Recursion Function1
// Recursion Function   
// Recursion Function
