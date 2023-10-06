console.log("object");

let a="JavaScript";
// ! length is a property to check the length of the string
console.log(a.length); //10 //length is a property

//! toUpperCase
// this function is for the properties
console.log(a.toUpperCase); //ƒ toUpperCase() { [native code] }
// toUpperCase/toLowerCase is an method so we need to use paranthasis
console.log(a.toUpperCase()); //JAVASCRIPT

// ! toLowerCase
console.log(a.toLowerCase()); //javascript

// ! slice(start index, end index)
// ? start index will be included,end index will be excluded and negative values can also be specified.
// it includes the 1st index value and excludes the last index value
// we need to give smaller value to larger value
console.log(a.slice(1,4)); // ava
console.log(a.slice(4)); // Script
// it will take from reverse order
console.log(a.slice(-4)); // ript
console.log(a.slice(-8,-5)); //vaS

// ! substring(start index, end index)
// ? start index will be included,end index will be excluded and simialr to slice but negative values will be consider as 0.
// it will behave same as slice
console.log(a.substring(1,4));
//& it will take the negative value as 0 and print whole value
console.log(a.substring(-4)); // JavaScript
//& the negative value is consider as 0 and print upto end index
console.log(a.substring(-8,3)); // Jav

// ! concat(): merge two or more string
let str1="JavaScript";
let str2="is";
let str3="easy-peasy";
console.log(str1.concat(" ",str2," ",str3))
let str5=str1.concat(" ",str2," ",str3)
console.log(str5);

// ! replace() and replaceAll()
// ? replace(): replace method replaces only first matched word.
// ? replaceAll(): replace method replaces all the matched word.
let str4="My students are good with good skills";
console.log(str4.replace("good","best"))
console.log(str4.replaceAll("good","best"))
console.log(str4);

// ? /i is the regular expression called as insensitive
// ? /g is the regular expression called as global matched
console.log(str4.replace(/GooD/i,"best")) //it will ignore the upper & lower case
console.log(str4.replace(/good/g,"best"))
// ~ NOTE: for replaceAll() both insensitive and global match should be used.
console.log(str4.replace(/Good/ig,"best"))

// ! padStart() and padEnd()
// ? padStart("length of string + content length" , "content")
// ? padStart() adds the content to the starting of the string
// ? padEnd() adds the content to the end of the string
let str6="Raj"
console.log(str6.padStart(4,"@"))
console.log(str6.padStart(5,"@"))
console.log(str6.padStart(6,"@#$"))
console.log(str6.padStart(5,"@#$"))

console.log(str6.padEnd(4,"@"))
console.log(str6.padEnd(5,"@"))
console.log(str6.padEnd(6,"@#$"))
console.log(str6.padEnd(5,"@#$"))

// ! split(): converts the string to an array based on the given value inside the method
let str7="JavaScript is easy-peasy";
console.log(str7.split())        // ['JavaScript is easy-peasy']
console.log(str7.split(""))      // (24) ['J', 'a', 'v', 'a', 'S', 'c', 'r', 'i', 'p', 't', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y', '-', 'p', 'e', 'a', 's', 'y']
console.log(str7.split(" "))     // (3) ['JavaScript', 'is', 'easy-peasy']
console.log(str7.split("a"))     // (5) ['J', 'v', 'Script is e', 'sy-pe', 'sy']

// ! trim():
// ? removes the space from the starting and ending of the string
// ! trimStart():
// ? removes the space from the starting of the string
// ! trimEnd():
// ? removes the space from the ending of the string
let str8="  JavaScript   "
console.log(str8.length);               //15
console.log(str8.trim().length)         //10
console.log(str8.trimStart().length)    //13
console.log(str8.trimEnd().length)      //12


// ! includeS()
// ? includes method checks whether the specified character or substring is present or not. Returns the value in the form of boolean.
let str="Web  Technology"
console.log(str.includes("z"))          //false
console.log(str.includes("o"))          //true
console.log(str.includes(" "))          //true
console.log(str.includes("  "))         //true
console.log(str.includes("   "))        //false
console.log(str.includes("Tech"))       //true
console.log(str.includes("tech"))       //false (case sensitive)

// ! indexOf()
// ? indexOf() returns the index value of the character in the string
// ? if the character is not present then returns -1
console.log(str.indexOf("W"))   //0
console.log(str.indexOf("w"))   //-1
console.log(str.indexOf("z"))   //-1
console.log(str.indexOf("o"))   //10

// ! lastIndexOf()
// ? lastIndexOf() returns the index value of the matching last encountered character in the string
// ? if the character is not present then returns -1
console.log(str.lastIndexOf("o"))   //12
console.log(str.lastIndexOf("x"))   //-1






















