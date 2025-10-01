import { useState } from "react";
export default function Counter()
{
    let data='';
    let[count,setCount]=useState(0)



    function handler()
    {
        setCount(count + 1);
        console.log("count : "+ count)
    }

    return(<>

        counter = {count}
        <br/>
        <button onClick={handler}>click me </button>
        <br></br>
        <br></br>
        <br></br> 

    
    </>)
}