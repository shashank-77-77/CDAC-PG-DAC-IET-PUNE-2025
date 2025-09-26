const http = require ('http');
const server = http.createServer((req,res) => {res.writeHead (200,{'content-type':'text/html'})

res.end('Hello world')
});

server.listen(8080);