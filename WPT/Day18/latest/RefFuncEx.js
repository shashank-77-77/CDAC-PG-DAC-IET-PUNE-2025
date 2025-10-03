import { useEffect, useRef, useState } from "react"

export default function RefFuncEx() {
    let x = useRef()  //initialized only when the component is created, not on RERENDER

    let y = 100 //initialized when component is created + on RERENDER
    let [s1, setS1] = useState("")


    //render()
    useEffect(() => {
        x.current = 20  //Initial value

    }, [])


    return (<div>
        <input type="text"
            onChange={(e) => {
                x.current = e.target.value
                //x.current++
                y++
                setS1(e.target.value)
            }}

        ></input>

        <p>
            x={x.current}
            <br></br>
            y={y}
            <br></br>

        </p>

        {/* <input type="text" ref={z} onChange={()=>{console.log("heere",z.current.value )}} />
        <p>The value in input tag = {z.current?.value} </p> */}
    </div>
    )

}