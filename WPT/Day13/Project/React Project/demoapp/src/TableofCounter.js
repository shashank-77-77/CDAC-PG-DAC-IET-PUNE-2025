import { useEffect , useState } from "react";
export default function Count()
{
    let data='';
    let[count,setCount]=useState(0)

    useEffect(()=> {
            console.log("in useEffect")
            //setCount(count + 1);
      

    },[count])

    function handler()
    {
        setCount(count + 1);
        console.log("count : "+ count)
    }

    function eventHandler()
    {
        let row=[];
        for(let i=1;i<=10;i++)
        {
            row.push(
                <tr key ={i} >
                <td>{count} x {i}</td>
                <td>{count *i} </td>
            {/* console.table("Count table" + count) */}
            </tr>
            );   
        }
        return row;
        
    }

    return(
    
    <>

        counter = {count}
        <br/><br/>
        
        <br/>
        <table border='1' cellPadding="5" >
        <thead>
            <tr>
                <th>Expression</th>
                <th>Result</th>
            </tr>
        </thead>
        <tbody>
            {eventHandler()}
        </tbody>

        </table>
        <button onClick={handler}>click me </button>
    
    </>)
}