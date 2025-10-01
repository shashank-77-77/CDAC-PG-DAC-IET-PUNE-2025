// access attribute in comp  --- props   properties 
function MyFunction(props) {
    const msg = "Hello From Function    ";
    //{ var name   , 34*23   ,  }
    return (
        <>
            <h1>{msg} {props.data} </h1>

            <h1>{props.skills[0]}</h1>

            <Function2></Function2>

        </>
    );

}
export function Function2() {

    return <h1>Function 2 Data </h1>
}

export function Function3() {

    return <h1>Function 3 Data </h1>
}

export default MyFunction;
