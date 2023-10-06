let employee={
    ename: "Raj",
    eid: "EMP101",
    edes: "ASW",
    sal: 45000,
    dec: 5000,
    e_skills: ["Java", "Web", "SQL"],
    c_add:{
        city: "Bangalore",
        state: "Karnataka"
    },
    //? object method
    e_sal: function(){
        console.log(`The salary of an employee is ${employee.sal - employee.dec}`);
    }
}
console.log(employee);   //{ename: 'Raj', eid: 'EMP101', edes: 'ASW', sal: 45000, dec: 5000, …}
console.log(typeof employee);  //object

//& NOTE:
// the value of each property in an object can be declared any of the datatype 
// type of employee is object
// there are 2 ways to fetch the value of the property
// 1. using dot operator
// 2. square bracket notation

//! fetch (two ways to fetching the data)
//* dot operator
console.log(employee.ename);   //Raj
//* square bracket notation
console.log(employee["eid"]);  //EMP101

//! update
employee.edes="SSE";
console.log(employee); //{ename: 'Raj', eid: 'EMP101', edes: 'SSE', sal: 45000, dec: 5000, …}

//! insert
employee.gender="male";
console.log(employee);

//! remove
delete employee.eid;
console.log(employee); //{ename: 'Raj', edes: 'SSE', sal: 45000, dec: 5000, e_skills: Array(3), …}

//! object Method
// when ever a function is declared as a value to a key then the whole property is called as object method.
// Object method should be invoke with the key name
employee.e_sal()    //The salary of an employee is 40000

//! String method
// whenever String datatype is initilized as a value string() can be performed
console.log(employee.ename); //Raj
console.log(employee.ename.toUpperCase()); //RAJ

//! array method
// whenever array datatype is initilized as a value array() can be performed
console.log(employee.e_skills);  //['Java', 'Web', 'SQL']
employee.e_skills.push("ReactJS")
console.log(employee.e_skills);  //['Java', 'Web', 'SQL', 'ReactJS']

let obj={
    1:"uma",
    2:"impu",
    3:"suju"
}
console.log(obj);  //{1: 'uma', 2: 'impu', 3: 'suju'}
// console.log(obj.1);  //~Uncaught SyntaxError: missing ) after argument list (at object.js:67:13)
//& the value of the property cannot be fetched dot operator, when the key is in the format of numbers.

console.log(obj[1]);   // uma
console.log(obj["1"]); // uma

//! ways of creating the object
//* 1. object literal
let emp={
    e_name:"Raj",
    eid:"emp101"
}
console.log(emp);  //{e_name: 'Raj', eid: 'emp101'}

//* 2. using new key word along with object constructor
let obje= new Object({e_name:"Raju",eid:"emp103"})
console.log(obje); //{e_name: 'Raju', eid: 'emp103'}

//* 3. using constructor function
function Laptop(brand,cost,color){
    this.brand=brand
    this.cost=cost
    this.color=color
    console.log("constructor function");
}
console.log(Laptop);  //^ print whole constructor function(because we didnt give a function(Laptop()))

Laptop(); //^call constructor

let m1=new Laptop("POCO",13000,"blue")
console.log(m1); 

let m2=new Laptop("samsung",20000,"black")
console.log(m2); 

let m3=new Laptop("redmi",10000,"green")
console.log(m3); 

//~OUTPUT
// ƒ Laptop(brand,cost,color){
//     this.brand=brand
//     this.cost=cost
//     this.color=color
//     console.log("constructor function");
// }  //*line 92

// constructor function  //*line 90

// constructor function  //*line 90
// Laptop {brand: 'POCO', cost: 13000, color: 'blue'}  //*line 95

// constructor function  //*line 90
// Laptop {brand: 'samsung', cost: 20000, color: 'black'}  //*line 97

// constructor function  //*line 90
// Laptop {brand: 'redmi', cost: 10000, color: 'green'}  //*line 99

//?Advantage
//^ we can create multiple object for the same constructor function

//& NOTE:
console.log(window);
console.log(this);
console.log(window==this);  //true
//!=========================================================================

//! Proto type 
// 	Proto type is a object which is inbuild functionality of JS.
// 	Whenever, a function and object is created  JS by default adds Proto type object to that function and objects.
// 	__proto__   is a property which is use to link Proto type of different objects.
// 	Proto type object consist of some inbuild function of JS.
// 	Property can be added for multiple object using __proto__ property with the object created for the same constructor function.

m1.__proto__.discount=10%
console.log(m1);
console.log(m2);
console.log(m3);

// Property can be added for multiple object using Proto type property with the constructor function name.
Laptop.prototype.company="Amazon";
console.log(m1);
console.log(m2);
console.log(m3);

//! object methods
//? assign method
//* it adds the properties of source object to targeted object
let obj1={
    ename:"Anand",
    eid:"EMP123"
}
console.log(obj1);  //{ename: 'Anand', eid: 'EMP123'}

let obj2={
    e_cmp:"TCS"    
}
console.log(obj2);  //{e_cmp: 'TCS'}

let obj3={
    cmp_address:"Bangalore"
}
console.log(obj3);  //{cmp_address: 'Bangalore'}

Object.assign(obj1,obj2,obj3)
console.log(obj1);  //{ename: 'Anand', eid: 'EMP123', e_cmp: 'TCS', cmp_address: 'Bangalore'}        //* Targetted object
console.log(obj2);  //{e_cmp: 'TCS'}
console.log(obj3);  //{cmp_address: 'Bangalore'}

//? freeze method
//* it prevents the object properties from getting altered
Object.freeze(obj1)
obj1.eid="tcs123"
obj1.ecmp="TCS"
delete obj1.eid
console.log(obj1);  //{ename: 'Anand', eid: 'EMP123', e_cmp: 'TCS', cmp_address: 'Bangalore'}

//? entries
//* it converts object into an array where each property of an object inside an array of the converted object
let entries=Object.entries(obj1)
console.log(entries);       //[Array(2), Array(2), Array(2), Array(2)]
console.log(Array.isArray(entries));    //true

//? keys
//* it gives the key names of the each property in the form of array
let keys=Object.keys(obj1);
console.log(keys);  //['ename', 'eid', 'e_cmp', 'cmp_address']

//? values
//* it gives the value of the each property in the form of array
let values=Object.values(obj1);
console.log(values);    // ['Anand', 'EMP123', 'TCS', 'Bangalore']


//! for of & for in loop
//* for of loop is used to iterate element of an array
//* for in loop is used to iterate index of an array
let arr=[12,34,456,667,78];
for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
    console.log(i);
}
//~output
// 12
// 0
// 34
// 1
// 456
// 2
// 667
// 3
// 78
// 4

//? for of loop
for(let ele of arr){
    console.log(ele);   //*elements of an array
    console.log(arr.indexOf(ele));  //* index of an element
}
//~output
// 12
// 0
// 34
// 1
// 456
// 2
// 667
// 3
// 78
// 4

//? for in loop
//* object can be iterator using for-in loop.
//* where for-in loop iterate a key name of object in the form of string
for(let index in arr){
    console.log(index);
}
//~ output
// 0
// 1
// 2
// 3
// 4

let obj4={
    ename:"Anand",
    eid:"emp123"
}
console.log(obj4.ename);    //~ Anand
//console.log(obj4."ename"); //*Identifier expected.      //Uncaught SyntaxError: Unexpected string  
//console.log(obj4[ename]);   //*object.js:231 Uncaught ReferenceError: ename is not defined
for(let a in obj4){
    console.log(a);
    console.log(typeof a);
    console.log(obj4.a);    //*undefined
    console.log(obj4[a]);
}
//~ output
// ename
// string
// undefined
// Anand
// eid
// string
// undefined
// emp123








