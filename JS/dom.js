//! INNER HTML & INNER TEXT
//? are the property of DOM to fetch,remove the content of html Element. 
//? where innerHTML property accepts the html tags and perform its functionality on the web page.but, innertext property doesnot accept the functionality of html tags instead of that it will print whatever the content even within a string exactly same on the web page along with tags. 

// let a=document.getElementById("demo").innerHTML
let a=document.getElementById("demo")
console.log(a);

//~ fetch the content
console.log(a.innerHTML);
console.log(a.innerText);

//~ change the content
a.innerHTML="Geetha"
a.innerText="Kamal"

//~ remove the content
a.innerHTML=""
a.innerText=""

//~ Differentiate b/w innerHTML & innerText
let b=document.getElementById("demo").innerText="<h1>Rohit</h1>"
console.log(b);

let c=document.getElementById("demo").innerHTML="<h1>Rohit</h1>"
console.log(c);
















