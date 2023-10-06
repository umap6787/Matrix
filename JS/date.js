let date= new Date();
console.log(date);    //Thu Sep 28 2023 09:00:34 GMT+0530 (India Standard Time)
console.log(date.getFullYear());    //2023
console.log(date.getMonth());       //8  //~ 0-11 => 0->jan to 11->dec
console.log(date.getDate());        //28
console.log(date.getDay());         //4  //~ 0-6 => 0->sun to 6->sat
console.log(date.getHours());       //9
console.log(date.getMinutes());     //2
console.log(date.getSeconds());     //41
console.log(date.getMilliseconds());//791

//! Date(year,month)
let date1=new Date(2022,8)
console.log(date1);   //Thu Sep 01 2022 00:00:00 GMT+0530 (India Standard Time)

//! Date(year,month,date)
let date2=new Date(2022,8,4)
console.log(date2);   //Sun Sep 04 2022 00:00:00 GMT+0530 (India Standard Time)

//! Date(year,month,date,hour)
let date3=new Date(2022,8,4,9)
console.log(date3); //Sun Sep 04 2022 09:00:00 GMT+0530 (India Standard Time)

//! Date(year,month,date,hour,min)
let date4=new Date(2022,8,4,7,43)
console.log(date4); //Sun Sep 04 2022 07:43:00 GMT+0530 (India Standard Time)

//! Date(year,month,date,hour,min,sec)
let date5=new Date(2022,8,4,8,23,56)
console.log(date5); //Sun Sep 04 2022 08:23:56 GMT+0530 (India Standard Time)

//! Date(year,month,date,hour,min,sec,ms)
let date6=new Date(2022,8,4,6,36,7,789)
console.log(date6); //Sun Sep 04 2022 06:36:07 GMT+0530 (India Standard Time)

//!==============================================================================

let time=document.querySelector("h1")
console.log(time);
time.innerHTML=new Date().toTimeString().slice(0,8)

function time1(){
    document.querySelector("h1").innerHTML=new Date().toTimeString().slice(0,8);
}
time1(setInterval(time1,1000))

































