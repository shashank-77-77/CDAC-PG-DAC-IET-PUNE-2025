const express=require('express')
const data=require('./MOCK_DATA.json')
const app=express();
const port=3030

app.get('/',(req,res)=>{
    res.send("Hello From Express");

});

app.get('/soham',(req,res)=>{
    res.send("shashank is my brother !!");

});
app.get('/shashank', (req, res) => {
    
    
    res.json(data);
});




app.get('/users', (req, res) => {

    res.json(data);
});
app.get('/users/:id',(req ,res)=>{
    const id=Number(req.params.id)
    const d=data.find(
        d=>d.id===id
    )
    return res.json(d)
    

});

app.post('/adduser',(req,res)=>{
    const id=Number(req.params.id)
    const da=data.find(
        da=>da.id === id

    )
    if(!da)
    {
        return res.json("Data is not found");
    }
    
    return res.json(da);
})
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
