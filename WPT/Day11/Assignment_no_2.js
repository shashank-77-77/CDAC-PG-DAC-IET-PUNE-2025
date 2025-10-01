const express = require('express');
const app = express();
const port = 3000;

// Sample todos array
const todos = [
  { id: 1, task: 'Learn Node.js', completed: false },
  { id: 2, task: 'Build a REST API', completed: true },
  { id: 3, task: 'Write tests', completed: false },
];

// Route to display all todos as JSON
app.get('/todos', (req, res) => {
  res.json(todos);
});

// Route to display a specific todo by id on a web page
app.get('/todos/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const todo = todos.find(t => t.id === id);

  if (!todo) {
    return res.status(404).send('<h1>Todo not found</h1>');
  }

  res.send(`
    <h1>Todo #${todo.id}</h1>
    <p><strong>Task:</strong> ${todo.task}</p>
    <p><strong>Completed:</strong> ${todo.completed ? 'Yes' : 'No'}</p>
  `);
});

app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});
