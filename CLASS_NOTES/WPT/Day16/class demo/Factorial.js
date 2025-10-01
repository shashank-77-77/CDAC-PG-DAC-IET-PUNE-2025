import { Component } from "react";

//  class   Object init 



export default class Factorial extends Component {
    // init 
    constructor(props) {
        super(props)  // pass to superclass 
        this.a = props.num1

        this.ans = 1;

        // eventerHanler 
        this.eventHandler = this.myeventHandler.bind(this)
    }

    doOperation() {
        return <>
            fact ====
            ans
            <h1>from doOperation</h1>
        </>

    }

    myeventHandler(e) {
        console.log(e.target);//whole Event 
        console.log(e.target.value);// component   event source 
        console.log("in event handler ")

        if (e.target.value == 'Factorial') {
            // this.doOperation();
        }
        if (e.target.value == 'Call') {
            // this.doOperation();
        }

        if (e.target.value == 'Call2') {
            // this.doOperation();
        }



    }



    // <Fact>
    render() {
        return (
            <>
                doOperation();

                <h1>from Class Component</h1>
                Enter a number <input
                    type="text" id="t1"
                    onBlur={(e) => { console.log(e) }}

                ></input>

                <button value="Factorial" onClick={this.myeventHandler}>
                    Call Factorial
                </button>

                <button value="Call" onClick={this.myeventHandler} >Call  </button>

                <button value="Call2" onClick={this.myeventHandler}>Call 2 </button>


                {/*doOperation()  // this - instance of same class */}
                {this.doOperation()}
            </>
        )

    }


}