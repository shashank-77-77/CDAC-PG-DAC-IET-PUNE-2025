
import { Component } from "react";

export default class Calculator extends Component {
    constructor(props) {
        super(props);
        this.state = {
            inputValue: "",
            inputValue1: "",
            result: ""
        };
    }

    Addition(num, num1) {
        num = parseInt(num);
        num1 = parseInt(num1);
        let result = num + num1;

        return result;
    }

    Multi(num, num1) {
        num = parseInt(num);
        num1 = parseInt(num1);
        let result = num * num1;
        return result;
    }

    Div(num,num1){
        num=parseFloat(num);
        num1=parseFloat(num1);

        let result= num / num1;
        return result;
    }

    Sub(num,num1)
    {
        num=parseInt(num);
        num1=parseInt(num1);

        let result= num - num1;
        return result;
    }

    handleInputChange = (e) => {
        const { id, value } = e.target;
        if (id === "t1") {
            this.setState({ inputValue: value });
        }
        else if (id === "t2") {
            this.setState({ inputValue1: value });
        }
    }
    
    myeventHandler = (e) => {
        if (e.target.value === "Addition") {
            const result = this.Addition(this.state.inputValue, this.state.inputValue1);

            this.setState({ result: result });
        }
        if (e.target.value === "Multi") {
            const result = this.Multi(this.state.inputValue, this.state.inputValue1);

            this.setState({ result: result });
        }
        if(e.target.value === "Div"){
            const result = this.Div(this.state.inputValue,this.state.inputValue1);
            this.setState({result : result});
        }
        if(e.target.value === "Sub"){
            const result=this.Sub(this.state.inputValue,this.state.inputValue1);

            this.setState({result : result});
        }
    }

    render() {
        return (
            <>
            <br></br>
            <br></br>
                Enter numbers :
                <input
                    type="text"
                    id="t1"
                    value={this.state.inputValue}
                    onChange={this.handleInputChange}
                />

                <input
                    type="text"
                    id="t2"
                    value={this.state.inputValue1}
                    onChange={this.handleInputChange}
                />

                <button value="Addition" onClick={this.myeventHandler}>
                    Addition
                </button>
                <button value="Sub" onClick={this.myeventHandler}>
                    Substraction
                </button>
                <button value="Multi" onClick={this.myeventHandler}>
                    Multiplication
                </button>
                <button value="Div" onClick={this.myeventHandler}>
                    Divison
                </button>
                <h2>Result: {this.state.result}</h2>
            </>
        );
    }

}