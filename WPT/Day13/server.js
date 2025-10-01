const express=require('express')
const data1=require('./MOCK_DATA.json')
const app=express();
const f=require('fs');
const port=3000

app.get('/',(req,res)=>{
    //res.send("Hello From Express");
    res.send(data1)

});

app.get('/users', (req, res) => {

    res.json(data1);
});
app.get('/users/:id',(req ,res)=>{
    const id=Number(req.params.id)
    const d=data.find(
        d=>d.id===id
    )
    return res.json(d)
    

});

app.use(express.urlencoded({ extended: false }))

app.post('/add',(req,res)=>{
    const data = req.body; 
    console.log("data " + data.email);
    console.log("data id " + data.id);
    console.log("data frist " + data.first_name);
    console.log("data gender " + data.gender);
    data1.push(
        { data, id: data1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(data1), (err) => {
            console.log(err)
        });

    return res.json("data added ");

})


    // const da=data.find(
    //     da=>da.id === id

    // )
    // if(!da)
    // {
    //     return res.json("Data is not found");
    // }
    
    

app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id); 
    const userIndex = data.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = data.splice(userIndex, 1);
    return res.json(" Data was deleted ");
});



app.listen(port);
