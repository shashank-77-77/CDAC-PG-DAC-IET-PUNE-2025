const express = require('express');
const f = require('fs');
const p = require('path');
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


//req param    string   /users/12
app.get('/users/:id ', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const user = users1.find(
        user => user.id === id
    )
    // console.log(user)
    return res.json(user);
});

app.get('/users/:id/:email ', (req, res) => {
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
    const userIndex = users1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = users1.splice(userIndex, 1);
    return res.json("Dae ");
});
// POST   data in database 
// read the Data ---- request 

//put   update data 

//  search the Record id ---- :id 
//  Object  == value from body 
//  push //   add new entry 
//replace   index 

app.use(express.urlencoded({ extended: false }))

app.post('/adduser', (req, res) => {
    const data = req.body;// 
    console.log("data " + data.email);
    users1.push(
        { data, id: users1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(users1), (err) => {
            console.log(err)
        });

    return res.json("data added ");
    // req.url.query // queryString   html form   params 
    //req.params.firstName
    //lastName
    //email  id    variable    Object ---  json 
    //convert json
    //users1 // global
    // writeFile users1

})

// setContent-Type  html   information   document 
// static html page 
//sendFile Absolute Path 
// res.write("Data ");  static 

//C:\Users\Admin\Desktop\WPT\Day13\Project1
app.get('/aboutus', (req, res) => {
    const t = p.join(__dirname, aboutus.html);
    console.log(t);
    res.sendFile(t);
});


app.listen(port)// 
console.log("From Start Script ");