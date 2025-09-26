function Smallest(arr)
{
    arr.sort((a,b)=>b-a)
    return arr[arr.length-1];
}

let arr=[20,33,4,65,67];
Smallest(arr);
console.log("Smallest number is",Smallest(arr));


