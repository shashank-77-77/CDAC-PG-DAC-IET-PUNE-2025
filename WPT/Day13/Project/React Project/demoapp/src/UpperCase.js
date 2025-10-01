import { Component } from "react";
export default class UpperCase extends Component {
  constructor(props) {
    super(props);
    this.state = { inputText: '', result: '' };

    this.handleChange = this.handleChange.bind(this);
    this.handleUpperCase = this.handleUpperCase.bind(this);
    this.handleLowerCase = this.handleLowerCase.bind(this);
  }

  handleChange(event) {
    this.setState({ inputText: event.target.value });
  }

  handleUpperCase() {
    this.setState({ result: this.state.inputText.toUpperCase() });
  }

  handleLowerCase() {
    this.setState({ result: this.state.inputText.toLowerCase() });
  }

  render() {
    return (
      <div>
        <h1>Form UpperCase Class</h1>
        <input 
          type="text"
          placeholder="Type here"
          value={this.state.inputText}
          onChange={this.handleChange}
        />
        <button onClick={this.handleUpperCase}>UPPER CASE</button>
        <button onClick={this.handleLowerCase}>lower case</button>
        <h1>Result: {this.state.result}</h1>
      </div>
    );
  }
}
