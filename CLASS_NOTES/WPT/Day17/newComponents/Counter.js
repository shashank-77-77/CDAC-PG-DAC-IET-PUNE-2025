import { useEffect, useState } from "react";

export default function Counter() {

    // useState
    //let count = 10;
    let data = '';// Ref
    let [count, setCount] = useState(0);


    // lifecycle of function comp 

    //setInterval   setTimeout 
    // useEffect  (()=> { } , <parameters>)
    // useEffect  (()=> { } )  always 
    // useEffect  (()=> { } , [])  1 
    // useEffect  (()=> { } , [<var names ])

    useEffect(() => {
        console.log('in useEffect ')
        // setCount(count + 1)   var c =  render ajax 
    }, [count]);

    function handler() {
        //count += 1;
        setCount(count + 1);// DOM state 
        console.log("Count " + count);
    }


    return (

        <>
            Counter =   {count}
            <br />
            <button onClick={handler}> Click Me </button>
        </>


    )







}