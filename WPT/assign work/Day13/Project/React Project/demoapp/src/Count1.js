import { Component } from "react";

class Count1 extends Component{
    constructor(props)
    {
        super(props)
    }
    render()
    {
        if(this.props.value == 4)
        {
            throw Error("Error");
        }

        return(
        <>
            <h2>count1 data {this.props.value}</h2>
            <button onClick={this.props.onClick}>Click</button>
        </>
        )
    }
}

export default Count1;