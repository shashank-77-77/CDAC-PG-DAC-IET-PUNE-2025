import axios from 'axios'
import { useState } from 'react';

// npm install axios    array   logic 
//  node js    RestAPI    url 
// data  display 
// map()/// iterate data 100  predefined 

// lifecycle useEffect []

export default function DemoAjax() {
    let [jsonData, setData] = useState([]);
    let p = axios.get("https://jsonplaceholder.typicode.com//posts");

    p.then((response) => {
        //console.log(response.data);
        setData(response.data);
    })


}