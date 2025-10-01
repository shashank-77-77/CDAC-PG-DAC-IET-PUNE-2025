const file=require('fs');

const data= file.readFile('SSS.txt',(err)=>{

    console.log(err);
});
const SSS=file.readFileSync('SSS.txt','utf8');


 console.log('File content:', SSS);

