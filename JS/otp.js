let otp_box=document.getElementsByTagName("aside")

let otp=""
for(let i=0;i<4 ;i++){
    otp+=Math.floor(Math.random()*10)
}

// alert(`The OTP is ${otp}`)

// setTimeout(()=>{
//     otp_box[0].innerHTML=otp[0]
// },500)
// setTimeout(()=>{
//     otp_box[1].innerHTML=otp[1]
// },1000)
// setTimeout(()=>{
//     otp_box[2].innerHTML=otp[2]
// },1500)
// setTimeout(()=>{
//     otp_box[3].innerHTML=otp[3]
// },2000)

for(let j=0;j<otp_box.length;j++){
    setTimeout(()=>{
        otp_box[j].innerHTML=otp[j]
    })
}







