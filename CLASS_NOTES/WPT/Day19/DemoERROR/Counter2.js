import {   Component } from "react";
const { useState } = require("react")

export default class Counter2 extends Component{

  constructor(props){
    super(props);
  }



render(){

    return (

      <div>
        <h1>Counter2</h1>
        <h2>Data {this.props.value}</h2>
        <button onClick={this.props.onClick}>Click </button>
      </div>

    )

}


}