import { useState } from "react";
import ChildComponent from "./ChildComponent";
import "./ex2.css"

export default function ParentComponent() {
    let [n1, setN1] = useState(0)
    let [n2, setN2] = useState(0)
    let [res, setRe] = useState(100)

    function changeResult(v) {
        setRe(v)
    }

    return <div className="outline">
        Num1: <input type="number" onBlur={(e) => { setN1(e.target.value) }} />
        <br></br>
        Num2 :<input type="number" onBlur={(e) => { setN2(e.target.value) }} />
        <p>Result = {res} </p>


        <ChildComponent f1={changeResult}
            num1={parseInt(n1)} num2={parseInt(n2)}></ChildComponent>
    </div>

}

