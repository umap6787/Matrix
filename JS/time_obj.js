function first(){
    console.log("first function");
}
function second(){
    console.log("second function");
}

setTimeout(first,1000)
second()
console.log("hii");
console.log("byee");

setInterval(first,5000)

let a=() => console.log("function A");
let b=() => setTimeout(()=>console.log("function B"));
let c=() => console.log("function C");

a()
b()
c()



// function smile(){
//     let a=document.querySelector("p")
//     a.innerHTML="❤️😘"
// }

// let timeout;
// function start(){
//     timeout=setTimeout(smile,3000)
// }

// function stop(){
//     clearTimeout(timeout)
// }


function smile(){
    let a=document.querySelector("p")
    a.innerHTML+="❤️💙"
}

let timeout;
function start(){
    timeout=setInterval(smile,3000)
}

function stop(){
    clearInterval(timeout)
}


