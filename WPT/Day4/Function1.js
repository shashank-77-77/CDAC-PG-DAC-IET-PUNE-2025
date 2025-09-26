//HOW to assign a function to a variable 
let s = "Hello";  // global  char array  

s[0] = "h";

console.log(s);

s = "Data";
console.log(s);




function f1() {
    let a = "data";  // local 
    console.log("f1 runs " + a);
    a = "A";
}

function f2() {
    var a = "data";
    console.log("f1 runs");
    var a = "data3";
}

/*f1();


let y=f1()  // y holds the return value of f1
console.log(typeof(y))  
let x=f1   // x holds the function itself
console.log(typeof(x))
x()*/
function add(a1, a2) {
    console.log("addition  " + (a1 + a2));
}
add(1, 2);
add(2, 3, 4, 5);





