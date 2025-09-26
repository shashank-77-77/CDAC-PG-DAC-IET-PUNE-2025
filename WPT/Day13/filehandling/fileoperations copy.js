const { constants } = require('buffer');
const f = require('fs');

let name = 'sample1.txt';
let data = "Data sent to File sync ";



//f.writeFileSync(name , data );


/*
f.unlink(name , (err)=>{
    console.log(err);
});*/
/*
f.rename(name , 'newName.txt' , (err)=>{
    console.log(err);
});*/
f.access('sample1.txt' , f.constants.W_OK , (err)=>{

    if(err){
     console.log('file NOT  availble for writing  ');
    }
    else {
        console.log('file is availble for reading ');
    }
});
let fromFile = f.readFileSync(name , 'utf-8');
console.log(fromFile);
