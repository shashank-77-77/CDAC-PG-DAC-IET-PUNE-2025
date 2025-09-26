const h=require('http');
var url = require('url');
const server =h.createServer(
    function(request,response) {
        let d= request.url;
        let d2=url.parse(d,true).query;
        let d3=url.parse(d,true).query;

        response.writeHead(200,{'content-type':'text/html'});
        console.log(request.headers);
        if(d2.fname == 'soham' && d3.lname == 'shelar')
        {
            response.write("<h1>" + d2.fname + d3.lname + "</h1>")
        }
        else
        {
            response.write(JSON.stringify({message : "Hello"}));
        }
        response.end();
    
});
server.listen(3000);
