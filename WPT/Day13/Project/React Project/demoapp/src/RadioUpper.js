import { Component } from "react";

export default class RadioUpper extends Component {
  constructor(props) {
    super(props);
    this.state = { inputText: '', result: '', selectedCase: '' };

    this.handleChange = this.handleChange.bind(this);
    this.handleRadioChange = this.handleRadioChange.bind(this);
    this.convertText = this.convertText.bind(this);
  }

  handleChange(event) {
    this.setState({ inputText: event.target.value }, this.convertText);
  }

  handleRadioChange(event) {
    this.setState({ selectedCase: event.target.value }, this.convertText);
  }

  convertText() {
    const { inputText, selectedCase } = this.state;
    let result = inputText;

    const toTitleCase = (str) => {
      return str.toLowerCase().split(' ').map(word => 
        word.charAt(0).toUpperCase() + word.slice(1)
      ).join(' ');
    };

    if (selectedCase === 'upper') {
      result = inputText.toUpperCase();
    } else if (selectedCase === 'lower') {
      result = inputText.toLowerCase();
    } else if (selectedCase === 'title') {
      result = toTitleCase(inputText);
    }

    this.setState({ result });
  }

  render() {
    return (
      <div>
        <h1>Form RadioButton Class</h1>
        <input type="text"  value={this.state.inputText} onChange={this.handleChange}/>

        <input type="radio" id="Uppercase" name="case" value="upper" onChange={this.handleRadioChange}
          checked={this.state.selectedCase === 'upper'}
        />
        <label htmlFor="Uppercase">Uppercase</label>

        <input type="radio" id="Lowercase" name="case" value="lower" onChange={this.handleRadioChange}
          checked={this.state.selectedCase === 'lower'}
        />
        <label htmlFor="Lowercase">Lowercase</label>

        <input 
          type="radio" 
          id="Titlecase" 
          name="case" 
          value="title" 
          onChange={this.handleRadioChange}
          checked={this.state.selectedCase === 'title'}
        />
        <label htmlFor="Titlecase">Title Case</label>

        <h1>Result: {this.state.result}</h1>
      </div>
    );
  }
}
