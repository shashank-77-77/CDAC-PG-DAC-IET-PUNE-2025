
function findlargets(arr)
{
    arr.sort((a,b)=>a-b);
    return arr[arr.length -2];
   
}
let arr=[10,200,31,45,50];
 console.log("Largest number is ",findlargets(arr));


