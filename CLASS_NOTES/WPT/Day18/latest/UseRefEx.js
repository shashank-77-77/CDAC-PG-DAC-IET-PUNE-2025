import { useEffect, useRef, useState } from "react";

export default function UseRefEx()
{
    let x = useRef()  //initialized only when the component is created, not on RERENDER
    let z = useRef()
    let y = 100 //initialized when component is created + on RERENDER
    let [s1,setS1] = useState("")
    useEffect(()=>{
        x.current=100
        
    },[])
    
  
    return(<div>
        <input type="text"  onChange={(e)=>{ 
            x.current++
            y++
            setS1(e.target.value)
            }} ></input>
        <p>x={x.current}
           y={y} 
        </p>

        <input type="text" ref={z} onChange={()=>{console.log("heere",z.current.value )}} />
        <p>The value in input tag = {z.current?.value} </p>
        </div>
    )

}