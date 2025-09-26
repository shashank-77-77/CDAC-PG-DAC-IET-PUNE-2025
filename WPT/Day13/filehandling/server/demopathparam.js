const h = require('http');
const p = require('url');

const server = h.createServer((req , res)=>{

console.log("s : " +req.url.pathname);

 const baseURL = 'http://' + req.headers.host + '/';  
  const parsedUrl = new URL(req.url, baseURL);

  console.log(parsedUrl.pathname);


let querydata = p.parse(req.url , true);
console.log(querydata)

console.log(req.method)

let f = req.method;

res.write('<h1>'+f+'</h1>');

if(f=='POST'){
 console.log("POST");
    res.write('<h1>'+f+'</h1>');
}
if(f=='PUT'){
 console.log("PUT");
    res.write('<h1>'+f+'</h1>');
}

if(f=='DELETE'){
 console.log("DELETE");
    res.write('<h1>'+f+'</h1>');
}
res.end();





}).listen(3000 , ()=>{
    console.log("server started ")
})