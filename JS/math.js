console.log(Math);
console.log(typeof Math);

console.log(Math.random);           //ƒ random() { [native code] }
console.log(Math.random());         //0.33934378895519046
console.log(Math.random()*10);      //1.7665483938084359
console.log(Math.random()*100);     //62.18716971720421
console.log(Math.random()*1000);    //266.06308952494385

//? here math.floor only consider the lower integer value
console.log(Math.floor);        //ƒ floor() { [native code] }
console.log(Math.floor());      //NaN
console.log(Math.floor(45.6));  //45
console.log(Math.floor(45.9));  //45
console.log(Math.floor(45.3));  //45
console.log(Math.floor(-45.6)); //-46
console.log(Math.floor(-45.9)); //-46
console.log(Math.floor(-45.3)); //-46

//? here math.floor only consider the higher integer value
console.log(Math.ceil(45.3));   //46
console.log(Math.ceil(45.9));   //46
console.log(Math.ceil(-45.3));  //-45
console.log(Math.ceil(-45.9));  //-45

// ? it will round of passed on decimal value
console.log(Math.round(45.9));  //46
console.log(Math.round(45.3));  //45
console.log(Math.round(45.5));  //46
console.log(Math.round(-45.9)); //-46
console.log(Math.round(-45.3)); //-45
console.log(Math.round(-45.5)); //-45

console.log(Math.sqrt(2025));   //45
console.log(Math.sqrt(25));     //5

//? cube root
console.log(Math.cbrt(8));      //2
console.log(Math.cbrt(1103));   //10.332177000911683

console.log(Math.sign(45));     //1   (for positive values)
console.log(Math.sign(-45));    //-1  (for negative values)
console.log(Math.sign(0));      //0
console.log(Math.sign(-0));     //-0

//? gives the absolute(positive) values
console.log(Math.abs(-45));     //45
console.log(Math.abs(45));      //45


//! generation of otp
//? method 1
//* in this method some times we get bugs of.. only getting 3 digit number
console.log(Math.floor(Math.random()*10000));

//? method 2
let otp=""
for(let i=0;i<4;i++){
    otp+=Math.floor(Math.random()*10);
}
console.log(otp);

//? method 3
let str="JSPIDERSSEP2023"
let otp1="";
for(let i=0;i<4;i++){
    otp1+=str[Math.floor(Math.random()*str.length)]
}
console.log(otp1);




//!assignment que--> checkout math method trunc & hypotenuous
console.log(Math.trunc(34.8));  // it will consider only integer value and remove all decimal point
console.log(Math.hypot(3,4));   //sqrt(3^2 + 4^2)



































