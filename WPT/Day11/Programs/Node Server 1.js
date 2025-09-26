// Import the HTTP module
const http = require('http');
// server   port number 
// Create a server object
const server = http.createServer((req, res) => {
  // Set the response HTTP header with HTTP status and Content type
  // header   extra <html> <head>  cdn 
  // response code status code   , content type 
  res.writeHead
    (200, { 'Content-Type': 'text/html' });
  // Send the response body as 'Hello, World!'
  res.end('Hello, From Node JS Server !\n');
});
// Define the port to listen on const PORT = 3000;

// Start the server and listen on the specified port
server.listen(8080);
