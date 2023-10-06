//! this --> this in function point to the global window object
// this is a keyword of JS which is same as window Object
// this keyword behaves differently at different position 
// whenever this keyword used alone it points to the global window Object 

console.log(window);
console.log(this);

console.log(window==this);

//! this is object method points to the current object.
// whenever this keyword is used inside the function it points to the local Object

function demo(){
    console.log(this);  // Window {window: Window, self: Window, document: document, name: '', location: Location, …}
}
demo();

// whenever this keyword is used inside the object it points to the current object
let emp={
    ename:"Rohit",
    eid:"EMP123",
    e_det:function(){
        console.log(this);
        console.log(this.ename);    //Rohit
        console.log(this.eid);      //EMP123
        console.log(this.e_det);    // ƒ (){
                                    //    console.log(this);
                                    //    console.log(this.ename);
                                    //    console.log(this.eid);
                                    //    console.log(this.e_det);
                                    // }
    }
}
console.log(emp);   // {ename: 'Rohit', eid: 'EMP123', e_det: ƒ}
emp.e_det();        // {ename: 'Rohit', eid: 'EMP123', e_det: ƒ}

//? whenever this keyword is used in the constructor function for creating an objects their this keyword points to the values assigned for the parameters by the function call for creating a object using new keyword

//^========================================================================

//! BOM: Browser Object Model
//? it is required to commi=unicate with the browser
// ? Js communicate with the browser through browser object model
//? BOM consists of window object where window object as a inbuild methods and functions requied to communicate with the browser
//? the window object consist of document object model which is in the form of tree structure

//! DOM : Document object Model
//? JS file can not understand html directly. so, whenever html file runned on the browser. browser refreshes and create DOM. where, DOM in the format of tree Structure only this tree Structure is understandable by JS.
















