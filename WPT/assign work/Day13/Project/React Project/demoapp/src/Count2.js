import { Component } from "react";

class Count2 extends Component{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
        <>
            <h3>Count2 data {this.props.value}</h3>
            <button onClick={this.props.onClick}>Click</button>
        
        </>)
    }
}

export default Count2;
