import { Component } from "react";

export default class FromViewToCompClass1 extends Component {

    constructor(props) {
        super(props)
        console.log("constructor")
        //this.data = props.data;// instance Object
        this.state = { data: this.props.data }
        // super class 
        this.handler1 = this.handler1.bind(this)

    }

    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps');
    }

    componentDidMount() {
        console.log('componentDidMount');
    }
    // page // snapshot   DOM  
    shouldComponentUpdate() {
        console.log('shouldComponentUpdate');
    }


    handler1(e) {
        // own class 
        //this.data = 'NEW dATA '
        //console.log("in handler :" + this.data)

        //console.log("in handler : " + this.state.data);
        this.setState({ data: 'After Event ' });
    }

    render() {
        console.log("render");
        return <div className="bordered" >
            <button onClick={this.handler1}> Click Me
            </button>
            <p> You's Data   :  {this.state.data}</p>
        </div>
    }
}