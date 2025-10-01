//How to return the value as  function

function doMaths(choice)
{
    function doSquare(x)
    {
        return x*x
    }

   function doPower(a,b)
   {
     let p = Math.pow(a,b)
     return p
   }

   if(choice == 1)
       return doSquare
   else
   {
       return doPower
   }

   //console.log(doSquare(3))

}//end of doMaths


let v = doMaths(1)  // v will hold the function doSquare
let s = v(12)     // s will hold the return value of doSquare
console.log(s)


let p =doMaths(2)   //p will hold the doPower function
let a = p(4,5)
console.log(a)












