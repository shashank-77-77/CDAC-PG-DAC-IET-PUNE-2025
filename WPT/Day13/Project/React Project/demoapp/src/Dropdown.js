
import { Component } from "react";

class GraduateComponent extends Component {
  render() {
    return (
      <div>
        <label>Degree: <input type="text" /></label><br />
        <label>Year: <input type="text" /></label><br />
        <label>Final Year Score: <input type="text" /></label><br />
        <label>University: <input type="text" /></label>
      </div>
    );
  }
}

class PGComponent extends Component {
  render() {
    return (
      <div>
        <label>Year: <input type="text" /></label><br />
        <label>Thesis Subject: <input type="text" /></label>
      </div>
    );
  }
}

class UnderGradComponent extends Component {
  render() {
    return (
      <div>
        <label>SSC: <input type="text" /></label><br />
        <label>HSC: <input type="text" /></label>
      </div>
    );
  }
}

export default class Dropdown extends Component {
  constructor() {
    super();
    this.state = {
      arr: ["PG", "UNGRAD", "GRAD"],
      selected: ""
    };
  }

  changeState(value) {
    this.setState({ selected: value });
  }

  getSelectBox = () => {
    return this.state.arr.map((sname, index) => (
      <option key={index} value={sname}>
        {sname}
      </option>
    ));
  };

  render() {
    return (
      <div style={{ margin: "10px" }} className="outline">
        Enter  Name : <input type="text" /><br />
        Enter Email : <input type="email" /><br />

        <select
          onChange={(e) => this.changeState(e.target.value)}
          value={this.state.selected}
        >
          <option value="">--Select--</option>
          {this.getSelectBox()}
        </select>

        <h2>Selected: {this.state.selected}</h2>

        {this.state.selected === "GRAD" && <GraduateComponent />}
        {this.state.selected === "PG" && <PGComponent />}
        {this.state.selected === "UNGRAD" && <UnderGradComponent />}
      </div>
    );
  }
}