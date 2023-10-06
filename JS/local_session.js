//! LOCAL STORAGE & SESSION STORAGE
//& to store the data
localStorage.setItem("username","Rohit")
localStorage.setItem("phone number",1234567890)

sessionStorage.setItem("ename","Geetha")
sessionStorage.setItem("eid","EMP123")

//& to fetch the data
console.log(localStorage.getItem("username"));
console.log(sessionStorage.getItem("ename"));

//& to remove the data
localStorage.removeItem("phone number")
sessionStorage.removeItem("eid")

//& t0 clear all the data
localStorage.clear()
sessionStorage.clear()

















