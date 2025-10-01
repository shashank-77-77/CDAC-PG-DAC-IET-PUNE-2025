const f = require('fs');
// document 
// current directory 
// Binary Format //  system language 
// type = utf8 // 

// write handle Error   callback functions 
// file name    , Data 
// code  generate 
//Write   FileName create the File 
let d = "Data "

f.writeFile('newsample.txt', d, (err) => {
    console.log(err);
});

f.close('newsample.txt');



