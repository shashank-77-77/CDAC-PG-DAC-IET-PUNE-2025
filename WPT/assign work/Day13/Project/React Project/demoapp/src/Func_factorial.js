import { Component } from "react";

export default class Factorial extends Component {
    constructor(props) {
        super(props);
        this.state = {
            inputValue: "",
            result: ""
        };
    }

    factorial(num) {
        num = parseInt(num, 10);
        if (isNaN(num) || num < 0) return "Invalid input";
        let res = 1;
        for (let i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    handleInputChange = (e) => {
        this.setState({ inputValue: e.target.value });
    }

    myeventHandler = (e) => {
        if (e.target.value === "Factorial") {
            const result = this.factorial(this.state.inputValue);
            this.setState({ result: result });
        }
    }

    render() {
        return (
            <>
                <h1>From Class Factorial</h1>
                Enter a number
                <input
                    type="text"
                    id="t1"
                    value={this.state.inputValue}
                    onChange={this.handleInputChange}
                />
                <button value="Factorial" onClick={this.myeventHandler}>
                    Calculate Factorial
                </button>
                <h2>Result: {this.state.result}</h2>
            </>
        );
        }
}
