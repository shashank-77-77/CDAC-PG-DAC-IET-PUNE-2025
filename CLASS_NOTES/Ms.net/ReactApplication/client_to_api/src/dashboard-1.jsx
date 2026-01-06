import axios from "axios";
import { useEffect, useState } from "react";

function Dashboard() 
{
    const [emps, setEmps] = useState([]);

    useEffect(()=>{
        axios.get("http://localhost:5208/api/emps")
        .then((response)=>{
            setEmps(response.data);
        })
        .catch((error)=>{
            console.log(error);
        });
    }, []);

    return (<>
        <center>
               <h1>Employee Details</h1>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>Emp No</th>
                                <th>Emp Name</th>   
                                <th>Emp Address</th>
                            </tr>
                        </thead>
                        <tbody>
                            {emps.map((emp) => (
                                <tr key={emp.no}>
                                    <td>{emp.no}</td>
                                    <td>{emp.name}</td> 
                                    <td>{emp.address}</td>
                                </tr>
                                    ))}
                                </tbody>
                            </table>
        </center>
        </>)
}

export default Dashboard;