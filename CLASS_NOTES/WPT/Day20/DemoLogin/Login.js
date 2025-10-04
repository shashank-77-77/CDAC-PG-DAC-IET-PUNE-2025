import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";

let n1 = useNavigate();
export default function LoginDemo() {

    const [uname, setUname] = useState('default');
    const [pass, setPass] = useState('');
    const [msg, setMsg] = useState('');





    function check(e) {

        e.preventDefault();
        if (validate()) {
            setMsg('Valid User');
            // Redirect PROG
            // hOME PAGE 
            n1.push('/home');

        }

    }
    useEffect(() => {
        console.log("use Effect ")
        // Load Data   JSON 

    }, []);

    function validate() {
        //docune  API BASE 
        // Database // Json Data  1000{u , p}
        return (uname == 'a' && pass == 'a')
    }





    return (

        <>



            <div style={{ padding: 150, backgroundColor: 'cyan' }}>
                <form onSubmit={check}>
                    Enter UserName :
                    <input type="text" value={uname}
                        onChange={
                            (e) => { setUname(e.target.value) }} />
                    <br />
                    Enter Password  : <input type="password" id="pass1" value={pass}
                        onChange={(e) => { setPass(e.target.value) }} />
                    <br />
                    <input type="submit" value={'submit'} />


                </form>


            </div>
        </>


    )






}