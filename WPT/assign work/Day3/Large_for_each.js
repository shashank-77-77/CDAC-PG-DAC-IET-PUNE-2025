const arr = [10,3,90,30,40];
var largest = arr[0];
arr.forEach(element=>{
    if(element>largest)
    {
        largest=element;
    }
})
console.log("Largest number is ",largest);




