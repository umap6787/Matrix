//! BOM: Browser Object Model
//? it is required to commi=unicate with the browser
// ? Js communicate with the browser through browser object model
//? BOM consists of window object where window object as a inbuild methods and functions requied to communicate with the browser
//? the window object consist of document object model which is in the form of tree structure

//! DOM : Document object Model
//? JS file can not understand html directly. so, whenever html file runned on the browser. browser refreshes and create DOM. where, DOM in the format of tree Structure only this tree Structure is understandable by JS.

let b=document.getElementById
let c=document.getElementsByClassName("para")
console.log(c);
console.log(c.length);
console.log(c[0]);
console.log(c[1]);

let d=document.getElementById;
console.log(d);
console.log(Array.isArray());

let f=document.querySelector("#para1")
console.log(f);

let e=document.querySelector(".para2")
console.log(e);

let g=document.querySelector("p")
console.log(g);

let h=document.querySelectorAll(".para2")
console.log(h); //NodeList [p.para2]
console.log(g[0]);  // undefined
console.log(g[1]);  // undefined






































