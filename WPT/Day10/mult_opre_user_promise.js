const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function multiplyIfPositive(a, b) {
  return (a > 0 && b > 0)
    ? Promise.resolve(a * b)
    : Promise.reject("Both numbers must be positive.");
}

rl.question("Enter first number: ", (input1) => {
  rl.question("Enter second number: ", (input2) => {
    const a = parseFloat(input1);
    const b = parseFloat(input2);

    multiplyIfPositive(a, b)
      .then(result => console.log("Result:", result))
      .catch(error => console.log("Error:", error))
  });
});
