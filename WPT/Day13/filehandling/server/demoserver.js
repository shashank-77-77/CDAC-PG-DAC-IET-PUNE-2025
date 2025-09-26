const h = require('http');
const p = require('url');

const server = h.createServer((req , res)=>{

console.log(req.url);

let querydata = p.parse(req.url , true).query;
console.log(querydata)

console.log(req.method)

let f = req.method;

res.write('<h1>'+f+'</h1>');

if(f=='POST'){
 console.log("asasa");
    res.write('<h1>'+f+'</h1>');
}
res.end();





}).listen(3000 , ()=>{
    console.log("server started ")
})