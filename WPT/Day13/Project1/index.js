const express = require('express');
const users1 = require('./MOCK_DATA.json');
const port = 3000;
const app = express();
// server   

app.get('/', (req, res) => {
    res.send("Hello From Express");
});
//  http get /:id === variable logic 
//   /users/110
app.get('/users', (req, res) => {
    // setContent-Type  html 
    res.json(users1);
});
//req param    string 
app.get('/users/:id/:email', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const user = users1.find(
        user => user.id === id
    )
    // console.log(user)
    return res.json(user);
});
// delete search record 

//req param    string 
app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const user = users1.find(
        user => user.id === id
    )

    //users1.delete(user);
    // console.log(user)
    return res.json(user);
});
// POST 
app.post('/users', (req, res) => {
    //req.params.firstName
    //lastName
    //email 
    //convert json
    //users1 // global
    // writeFile users1

}









app.listen(port)// 
console.log("From Start Script ");