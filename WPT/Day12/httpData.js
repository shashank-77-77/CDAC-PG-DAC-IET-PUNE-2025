const http = require('http');
const { URL } = require('url');

// In-memory data store (for demonstration)
let todos = [
    { id: 1, task: 'Read Carefully' },
    { id: 2, task: 'Implement' }

];
//Rest API 

// Http Methods get   retrive Data 
// insert PUT 
// DELETE 
const server = http.createServer(function (request, res) {
    const { method, url } = request;

    // request.fetch().then()
    // let a = request.url;
    //  let b = request.method;
    const parsedUrl =
        new URL(url, `http://${request.headers.host}`);
    //console.log(parsedUrl);
    const pathname = parsedUrl.pathname;

    // /todos
    if (method == 'GET' && pathname == '/todos') {
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify(todos));
    }

})
server.listen(3409, () => (console.log("server started ")))