// in JS multiple values of different datatype can be stored at a time to the single variable is known as Array.
// Arraythe size of an Array is dynamic.


/**
 * ARRAY METHODS:
 * 
 * 1.push():It is used to add the elements to an array where push() adds the element at the ending of an array.
 * 
 * 2.pop(): It is used to remove the elements from an array where it removes the elements from the ending of an array
 * where pop() removes only one element at a time.No arguments should be passed to pop().
 * 
 * 3.unshift(): Adds the element to an array where it adds the element at the beginning of an array.2
 * 
 * 4.shift(): It is used to remove the elements from an array where it removes the element from the beginning of an array.
 * shift() removes only one element at a time.No arguments are passed.
 * 
 * 5.slice(): Accepts two arguments, startIndex and endIndex where startIndex will be included and endIndex will be excluded.
 * slice(startInd,endInd) is used only to fetch the eleemnts from an array.
 * 
 * 6.splice(startInd,no. of elements,elements to be added):  Accepts upto three arguments: startInd,No. of elements to be removed,Elements to be added.
 * splice() removes the element from an array and to add the elements for an existing array.
 */

//!Difference between slice() and splice()

//!slice() is used to fetch the elements from an array.
//*splice() is used to remove elements and adds elements to existing array.
//!slice() accepts two arguments.
//*splice() accepts three arguments.
//!slice() does not affect original array.
//*splice() affects original array.
//!slice() accepts negative values.
//*splice() acceptsnumber of elements to be removed.If number of elements are specified as negative it is considered as 0.


//!push()
let ar = [10, 20, 30, 40, 50]
ar.push("web", "html")
console.log(ar);

//?pop()
ar.pop()
ar.pop()
console.log(ar);


const arr=[10,"raj",1n,null,undefined,true,function(){},[],{}]
console.log(arr);  //(9) [10, 'raj', 1n, null, undefined, true, ƒ, Array(0), {…}]
console.log(typeof arr);  //object

// a declared variable can be check weather it is array or not using Array.isArray()
// where, Array.isArray() returns the value in the form of Boolean.

let a=10;
console.log(Array.isArray(a)); //false
console.log(Array.isArray(arr));  //true

let arr1=[10,20,30,40,50]
console.log(arr1);  //(5) [10, 20, 30, 40, 50]
console.log(arr1.length); //5

//!==============================================================
let arr2=[10,20,30,40,50,60,70]

arr2[6]="hii"
console.log(arr2);  //[10, 20, 30, 40, 50, 60, 'hii']

arr2[0]="js"
console.log(arr2);  //['js', 20, 30, 40, 50, 60, 'hii']

//! PUSH - add the elements to the array(accept multiple values)
let arr3=[10,20,30,40,50]
arr3.push("web","html")
console.log(arr3);  //[10, 20, 30, 40, 50, 'web', 'html']

//! POP - remove the elements from the array(accept only one value)
arr3.pop()
console.log(arr3);

// !  unshift() - add elements in begining of array
let arrr=[10,20,30,40,50]
arrr.unshift("a","b")
console.log(arrr);  //['a', 'b', 10, 20, 30, 40, 50]

//! shift() -delete elements at begining of an array.
let arr8=[10,20,30,40,50]
arr8.shift()
console.log(arr8);

//! slice(start index,end index)
let arr9=[10,20,30,40,50]
console.log(arr9.slice(2,4));     //30,40
console.log(arr9.slice(2));       //30,40,50
console.log(arr9.slice(-2));      //40,50
console.log(arr9.slice(-3,-1));   //30,40

//! Splice((start index ,no of elements to be removed , elements to be added)
let arr5=[10,20,30,40,50]
arr5.splice(2,2,"a","b","c")      // [10, 20, 'a', 'b', 'c', 50]
arr5.splice(2,2)                  //[10, 20, 50]
arr5.splice(2)                    //[10, 20]
arr5.splice(-2,-2,"a")           //[10, 20, 30, 'a', 40, 50]
console.log(arr5);

//! Join() - used to convert array to string (doesnt affect original arrray)
let arr4=[10,20,30,40,50]
console.log(arr4.join());               //10,20,30,40,50
console.log(arr4.join(""));            //1020304050
console.log(arr4.join(" "));           //10 20 30 40 50
console.log(arr4.join("@"));           //10@20@30@40@50

//! fill() -Replace all the elemets of an array with given argument (affects original array)
let arr0=[10,20,30,40,50]
arr0.fill()                      // [undefined, undefined, undefined, undefined, undefined]
arr0.fill("10")                  //['10', '10', '10', '10', '10']
arr0.fill(10)                   // [10, 10, 10, 10, 10]
console.log(arr0);


//~ concat() --> used to merge to or more array
let arr6=[10,20,30];
let brr=["a","b","c"];
let crr=[true,false];
console.log(arr6.concat(brr,crr)); //[10, 20, 30, 'a', 'b', 'c', true, false]

//~ includes() --> used to check the element is in the array or not
let arr7=[10,20,30,20];
console.log(arr7.includes("30")); //false
console.log(arr7.includes(30));   //true

//~ indexof()
console.log(arr7.indexOf(20));  //1
console.log(arr7.indexOf(50));  //-1

//~ lastIndexOf()
console.log(arr7.lastIndexOf(20));  //3
console.log(arr7.lastIndexOf(50));  //-1

//! Array Higher Order Methods
//? a which accepts the callback function is called as HOM
//? HOM are
        //   1. map() --> is use to iterate each element of the array which is called as mapping the elements of the array
                            // the call back function of map() accepts three arguments (elements, index, array)

        //   2. filter() --> IT RETURS A filtered array based on the condition.
                            // the call back function of filter() accepts three arguments (elements, index, array)

        //   3. reduce() --> it convets the entier element of an array into a single value.
                            // the call back function of filter() accepts two arguments (accumulator,value)
                            // at the initial stage accu will fetch 1st element of the array and value will fetch 2nd element of an array. later-on, value will fetch each elements of an array and accu will hold the final result.

        //   4. sort() --> it is used to sorting array elements. where sort() can be used as helper method as well as higher order method.

        //   5. some() --> IT CHECKS atleast one of the elements of an array satiesfy the condition or not.
                            // it returns true , if atleat one element satiesfy the condition.

        //   6. every() -->  IT Checks all the elements of an array should satiesfy the condition.
                            // it returns true , if all the element satiesfy the condition or else false.

//! map()
//~EXAMPLE 1
let a1=[10,20,30,40,50];
console.log(a1.map((ele,index,array)=>{ //[Array(5), Array(5), Array(5), Array(5), Array(5)]
    return array;
}));

//~EXAMPLE 2
a1.map((ele,index,array)=>{
    console.log(ele,index,array);
});
//&output:
// 10 0  [10, 20, 30, 40, 50]
// 20 1  [10, 20, 30, 40, 50]
// 30 2  [10, 20, 30, 40, 50]
// 40 3  [10, 20, 30, 40, 50]
// 50 4  [10, 20, 30, 40, 50]

//~ EXAMPLE 3
a1.map((ele,index,array)=>{
    console.log(ele,index,"@");
});
//& OUTPUT
// 10 0 '@'
// 20 1 '@'
// 30 2 '@'
// 40 3 '@'
// 50 4 '@'

//! FILTER()
//~ EXAMPLE 1
let ar1=[10,20,30,40,50];
ar1.filter((ele,index,array)=>{
    console.log(ele,index,array);
})
//&output:
// 10 0  [10, 20, 30, 40, 50]
// 20 1  [10, 20, 30, 40, 50]
// 30 2  [10, 20, 30, 40, 50]
// 40 3  [10, 20, 30, 40, 50]
// 50 4  [10, 20, 30, 40, 50]

//~ EXAMPLE 2
let ar2=[10,20,30,40,50];
console.log(ar2.filter((ele,index,array)=>{
    return ele>30;
}));   //[40, 50]

//! REDUCE()
let ar3=[11,12,13,14,15]
let result=ar3.reduce((accu,value)=>{
    return accu+value;
})
console.log(result);  //65

//!SORT()
//~EXAMPLE 1
let a2=["uma","nitshuu","hemu","kamluu","sanjuu","benjuu"]
console.log(a2.sort());  //['benjuu', 'hemu', 'kamluu', 'nitshuu', 'sanjuu', 'uma']

//~EXAMPLE 2
let b=[101,46,27,0,9,69]
console.log(b.sort());  //[0, 101, 27, 46, 69, 9]

//~ EXAMPLE 3
//? ASCENDING ORDER
console.log(b.sort((a,b)=>{ //[0, 9, 27, 46, 69, 101]
    return a-b;
}));

//~ EXAMPLE 4
//? DESENDING ORDER
console.log(b.sort((a,b)=>{ //[101, 69, 46, 27, 9, 0]
    return b-a;
}));

//! SOME()
let b1=[101,0,49,9,67];
//it will check any one of the element is satisfy the condition
console.log(b1.some((ele)=>{
    return ele>100;
}));        //true

//! EVERY()
//it will check all the element should satisfy the condition
let b2=[101,0,49,9,67];
console.log(b2.every((ele)=>{
    return ele>100;
}));        //false





































