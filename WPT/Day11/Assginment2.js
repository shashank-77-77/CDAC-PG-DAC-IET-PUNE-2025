const http = require("http");
const url = require("url");

// our todos array
const todos = [
  { id: 1, task: "Learn Node.js", status: "pending" },
  { id: 2, task: "Practice JavaScript", status: "in-progress" },
  { id: 3, task: "Build small projects", status: "done" }
];

  const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const path = parsedUrl.pathname.split("/");

  res.writeHead(200, { "Content-Type": "application/json" });

  // case 1: /todos → show all todos
    if (path[1] === "todos" && path.length === 2) {
    res.end(JSON.stringify(todos));
  }
  // case 2: /todos/:id → show single todo
  else if (path[1] === "todos" && path[2]) {
    const id = parseInt(path[2]);
    const todo = todos.find(t => t.id === id);

    if (todo) {
      res.end(JSON.stringify(todo));
    } else {
      res.writeHead(404, { "Content-Type": "text/plain" });
      res.end("Todo not found");
    }
  }

});

server.listen(3000);
