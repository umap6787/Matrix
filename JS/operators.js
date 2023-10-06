let a=2023;     //number
let b="2023";   //string

//! == (or) != only checks the value of the variable
//~ EQUALSTO (==)
console.log(a==b);  //true
//~ NOT EQUALSTO (!=)
console.log(a!=b);  //false

//! === (or) !== only checks the value of the variable
//~ STRICTLY EQUALSTO (===)
console.log(a===b) //false
//~ STRICTLY EQUALSTO (!==)
console.log(a!==b) //true

//* NOTE:
console.log(null==undefined);   //true
console.log(null===undefined);  //false

let c=prompt("enter the dosage");
//! if we use the ternary operator the data must be given within double quotes
console.log((c==="1")?alert("take dosage 2"):(c==2)?alert("take booster dosage"):(c=="booster")?alert("take precation"):alert("dabba fellow enter valid input"));

// >1000 --> 5%
// >2000 --> 10%
// >3000 --> 15%

let d=prompt("enter the bill amount");
(d>=3000)?alert(d-(d*0.15)):(d>=2000)?alert(d-(d*0.10)):(d>=1000)?alert(d-(d*0.05)):alert(d);




























