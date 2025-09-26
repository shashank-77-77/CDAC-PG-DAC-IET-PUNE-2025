let arr = [12, 34, 56, 78, 99, 21, 32, 1, 5, 10]

function callbk(x) {
    console.log("SEE THIS ", x)
}
arr.forEach(callbk)
arr.forEach((x) => console.log(x))

//get the square of each number 
// in the aray
let sqrarr = arr.map((e) => e * e)

console.log("origianl array ", arr)
console.log("square array ", sqrarr)

//write a lamda function for map  that will return 1 tenth value of each element in the array

//console.log(arr.map((x) => x / 10))

let arr2 =
    ["red", "green", "blue", "yellow"]

//  display arr2 -- 2 char  Uppercase 

//using map and lamda show first 2 letters if each string in uppercase 
console.log(arr2.map((ele) =>
    ele.substring(0, 2).toUpperCase()))

//using map and lamda show  each string in titlecase 
//console.log(arr2.map((e) => e.substring(0, 1).toUpperCase().concat(e.substring(1).toLowerCase())))


let oddnumbers =
    arr.filter((e) => { return e % 2 != 0 })
console.log(oddnumbers)

//write using filter and lamda  get all the strings having length less than 5
//console.log(arr2.filter((e) => { return e.length < 5 }))















