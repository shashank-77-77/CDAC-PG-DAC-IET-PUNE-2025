let arr=[12,13,90,100]

arr.forEach((value,index)=>{console.log(index,value)});

let squares = arr.map((value)=>{return value*value})
console.log("squares=",squares, " arr=",arr)

//write a code to show all numbers above 20 using filter
let arr2 =arr.filter(
    (v)=>{if(v > 20) return true; else return false }
    )

console.log("arr2=",arr2,"arr=",arr)

var arr3=[10,4,56,78,1,99,0,-99,-20]

console.log("before sorting ",arr3)
arr3.sort((n1,n2)=>{
    if(n1>n2) return -1;
    if(n1<n2) return 1;
    else return 0;
})
console.log("after sorting ",arr3)

//let pattern4 = /[0-9]{3}$/

 //3 numbers preceded by 1 or more charachters
 let pattern5= /[a-z A-Z]+[0-9]{3}$/

var arr6= ['hellow123','1234567',
'678','re5tr34','rto09','row333','111rrrr444']

arr6.filter((element)=>{
    return element.match(pattern5)
}).forEach((v)=>{console.log(v)})

let emailpattern = /[a-zA-Z -_]+@[a-z A-z]+\.[a-z A-Z]{2,3}$/
var arr7= ['---@aaa.com','pra@gmail.org',
'pra_g@hotmail.com','pra@hotmail','pra__gre@ggg.vvv',
"test@gov.in"]

arr7.filter((element)=>{
    return element.match(emailpattern)
}).forEach((element)=>{console.log(element)})




