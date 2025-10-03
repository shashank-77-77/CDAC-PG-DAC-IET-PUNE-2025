import { useEffect, useRef, useState } from "react"

export default function RefFunct() {
    let x = useRef()  

    let y = 105 
    let [s1, setS1] = useState("")


    useEffect(() => {
        x.current = 25  
    }, [])


    return (<div>
        <h3>---------------------------------------------------------------------------------</h3>
        <br></br>
        <label>Enter Input Text Below : </label>
        <br></br>
        <input type="text"
            onChange={(e) => {
                x.current = e.target.value
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

    </div>
    )

}