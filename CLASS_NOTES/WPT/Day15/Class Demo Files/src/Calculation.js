//  Function 

export default function Calulator(props) {

    let n1 = parseFloat(props.num1);
    let n2 = parseFloat(props.num2);

    function Addition() {
        return (n1 + n2);
    }
    return (

        <>
            <p>Calculator </p>

            <h2> Addition  : {Addition()} </h2>

            <h2> Multiplication   : {n1 * n2} </h2>


        </>

    )





}