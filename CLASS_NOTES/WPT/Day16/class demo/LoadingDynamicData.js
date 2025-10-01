import { Component } from "react";

export default class State extends Component {
    constructor() {
        super()
        //this.state = { s: '' };
        this.state = { arr: ["Pune", "Nagpur", "Mumbai", "Hyderabad"] }
    }


    getLi = () => {
        let arrayoflistitems = []
        for (var i = 0; i < this.state.arr.length; i++) {
            let jsxelement = <li>{this.state.arr[i]}</li>
            arrayoflistitems.push(jsxelement)
        }
        return arrayoflistitems

        //return this.state.arr.map((fruitname,index)=>{return <li key={index}>{fruitname}</li>})
    }

    changeState(d) {
        console.log(d)

    }

    //this.state = { arr: ["Pune", "Nagpur", "Mumbai", "Hyderabad"] }
    getSelectBox = () => {
        {/*let arrayoflistitems = []
        for (var i = 0; i < this.state.arr.length; i++) {
            let jsxelement = <option>{this.state.arr[i]}</option>
            arrayoflistitems.push(jsxelement)
        }
        return arrayoflistitems
*/}
        return this.state.arr.map
            ((sname, index) => { return <option value={index}>{sname}</option> })
    }
    render() {
        return <div style={{ margin: "10px" }} className="outline">

            {/* <p>Arr = {this.state.arr}</p> */}
            <select onChange={(e) => {
                this.changeState(e.target.value);
            }}>
                {this.getSelectBox()}

            </select>

            <h1>State : {this.state.s}</h1>
        </div>
    }
}