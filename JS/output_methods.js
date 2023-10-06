// ! Output Methods
console.log("output")

// ?document.write(): prints the output on the webpage, doesnot gives the space b/w the statement
document.writeln("HII")
document.write("HII")
document.write("HII")

// ?document.writeln(): prints the output on the webpage, gives one charecter space b/w the statement
document.writeln("Java Script")
document.writeln("<h1>Java Script</h1>")

// &NOTE: document.write() and writeln() is not used to provide functionality because overrides the entire structure of html.

// ~console.log(): prints the output on the console window. it is used only for testing purpose, which is for developers output.
console.log("hii");

// &prompt: takes the data from the user. the data is in the form of string
// prompt: giving the data in the popup window (it will take the data in the form of String)
let a=prompt("Enter your Name")
console.log(a)
// ~ typeof: operator is used to check the datatype of variable. 
console.log(typeof a)

// ~ alert(): a pop-up, use to specify the alert messages
alert("login crediential is not verified")

// ~ confirm(): a pop-up, use to specify the confirmation messages
confirm("Logged in Successfully");

