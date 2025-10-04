import Count1 from "./Count1";
import Count2 from "./Count2";
import ErrorBound from "./Error_boundry";
const { useState } = require("react")

const Count12 = () => {
    const[count1,setCount1] =useState(1);
    const increament1= () => {
        setCount1(count1 + 1);
    }

    const[count2,setCount2]=useState(1);
    const increament2=()=> {
        setCount2(count2 + 1);
    }


    return (
    
    <>
    <ErrorBound>
        <Count1 value ={count1} onClick={increament1}></Count1>
    </ErrorBound>
        <Count2 value ={count2} onClick={increament2}></Count2>

     
     
     
     </>)
}

export default Count12;


