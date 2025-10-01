const f = require('fs');

let name = 'sample.txt';
let data = "Data sent to File ";



f.writeFile(name , data , (err) => {
    console.log(err);
})


/*
f.unlink(name , (err)=>{
    console.log(err);
});*/
/*
f.rename(name , 'newName.txt' , (err)=>{
    console.log(err);
});*/

f.readFile(name , 'utf-8' , (err , data)=>{
    console.log(data.length)
    console.log(data);
    
})