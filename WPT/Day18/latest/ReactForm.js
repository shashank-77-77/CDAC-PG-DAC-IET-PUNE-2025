import { useState } from "react"


export default function ReactForm() {

    const [fName, setFName] = useState();

    function validate(e) {

        e.preventDefault();
    }


    return (

        <>
            <form onSubmit={validate}>

                Enter a FirstName
                <input type="text" id="fName" name="fName" />
                <br />
                <input type="submit" />



            </form>

        </>


    )



}