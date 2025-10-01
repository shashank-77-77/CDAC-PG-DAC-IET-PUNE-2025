// Try File Handling Write and Read data synchronous method 
//    and try asynchronous method 
const fs= require('fs');

fs.writeFile('SSS.txt','sss Error',(err)=>{
    console.log("this the my file created some Error for creating File!");
});



