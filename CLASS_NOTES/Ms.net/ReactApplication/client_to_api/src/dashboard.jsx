import { useEffect, useState } from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import axios from 'axios';

function Dashboard() 
{
   const [emps, setEmps] =   useState([]);
   const [emp, setEmp] = useState({"id":0,"name":"","address":""});
    
//    var url = "http://localhost:5208/api/emps";

var url = "http://localhost:3562/api/emps";

   const GetData=()=>{
    axios.get(url)
    .then((result)=>{
                   debugger;
                       setEmps(result.data);
                    });
   }

   useEffect(()=>{
    GetData();
   }, []);
   
   const OnTextChange=(args)=>
   {
    debugger;
    var copyOfEmp = {...emp};
    copyOfEmp[args.target.name] = args.target.value;
    setEmp(copyOfEmp);
   }

   const Add = ()=>{
    axios.post(url,emp,{ headers: { "Content-Type": "application/json"}})
         .then((result)=>
         {
           //debugger; 
           if(result.status == 200)
           {
            GetData();
            setEmp({"id":0,"name":"","address":""});
           }
         });
   }
   const Remove =(id)=>{
    axios.delete(url + "/" + id)
    .then((result)=>
    {
      //debugger; 
      if(result.status == 200)
      {
       GetData();
      }
    });
   }

   const Update =()=>{
    axios.put(url + "/" + emp.id,emp,{ headers: { "Content-Type": "application/json"}})
    .then((result)=>
    {
      //debugger; 
      if(result.status == 200)
      {
       GetData();
       setEmp({"id":0,"name":"","address":""});
      }
    });
   }

   return (<>
                <div className='container'>
                    <h1>Welcome to Dashboard</h1>
                    <hr></hr>
                    <div className='table-responsive'>
                        <table className='table table-bordered'>
                            <tbody>
                                <tr>
                                    <td>Id</td>
                                    <td>
                                        <input  value={emp.id} onChange={OnTextChange}
                                                name='id'/>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Name</td>
                                    <td>
                                        <input  value={emp.name} name='name' onChange={OnTextChange}/>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Address</td>
                                    <td>
                                        <input  value={emp.address} name='address' onChange={OnTextChange}/>
                                    </td>
                                </tr>

                                <tr>
                                    <td colSpan={2}>
                                     <button onClick={Add} className='btn btn-primary'>Add Employee</button> {"  "}
                                     <button onClick={Update} className='btn btn-info'>Update Employee</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <hr></hr>
                    <div className='table-responsive'>
                        <table className='table table-bordered'>
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Address</th>
                                    <th>

                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    emps.map((e)=>{
                                        return <tr key={e.id}>
                                                    <td>
                                                        {e.id}
                                                    </td>
                                                    <td>
                                                        {e.name}
                                                    </td>
                                                    <td>
                                                        {e.address}
                                                    </td>
                                                    <td>
                                                        <button className='btn btn-warning' onClick={()=>{
                                                            setEmp(e);
                                                        }}>Edit</button>

                                                        {"  "}

                                                        <button className='btn btn-danger' onClick={()=>{
                                                            Remove(e.id);
                                                        }}>Delete</button>
                                                    </td>
                                                </tr>
                                    })
                                }
                            </tbody>
                        </table>
                    </div>
                </div>
            </>);
}

export default Dashboard;