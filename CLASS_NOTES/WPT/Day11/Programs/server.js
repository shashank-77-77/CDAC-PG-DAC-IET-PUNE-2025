// Import the HTTP module
const http = require('http');
const server = http.createServer((req, res) => {
    res.writeHead
        (200, { 'Content-Type': 'text/html' });
    res.end('Hello, From Node JS Server !\n');
});
server.listen(8080);
