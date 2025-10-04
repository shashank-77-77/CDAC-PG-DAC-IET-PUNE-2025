import React, { useCallback, useState } from "react";
// unique
const funcSet = new Set();

const DemoCallBack = () => {
    const [cnt, setCnt] = useState(0);
    const [num, setNum] = useState(0);

    //const incCnt = () => setCnt(cnt + 1);//Object 
    //cache --- prevcnt   ----- cnt 
    const incCnt = useCallback(
        () => setCnt((prevcnt) => prevcnt + 1)
        , []);//Object 
    const incCnt1 = useCallback(
        () => setCnt(cnt + 1)
        , [cnt]);//Object 
    const decCnt = useCallback(() => setCnt(cnt - 1),
        []);
    const incNum = useCallback(() => setNum(num + 1),
        [num]);

    // console.log(incCnt)
    funcSet.add(incCnt);
    funcSet.add(decCnt);
    funcSet.add(incNum);


    //alert(funcSet.size);


    return (
        <div>
            <h2>Without useCallback Hook</h2>
            <button onClick={incCnt}>Increase Counter</button>
            <button onClick={decCnt}>Decrease Counter</button>
            <button onClick={incNum}>Increase Number</button>

            <h1>Count : {cnt}</h1>
            <h1>Number : {num}</h1>
            <h2>Set Size  : {funcSet.size}</h2>
        </div>
    );
};

export default DemoCallBack;