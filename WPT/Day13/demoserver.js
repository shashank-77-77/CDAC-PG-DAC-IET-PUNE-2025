const f = require('http');


f.createServer((req, res) => {

    console.log("Method " + req.method)

    if (req.method === 'POST') {
        res.write("Post Method Demo ");
    }

    if (req.method === 'GET') {
        res.write("GET Method Demo ");
    }
    //res.send();
}).listen(4000, () => {
    console.log("server started")

});