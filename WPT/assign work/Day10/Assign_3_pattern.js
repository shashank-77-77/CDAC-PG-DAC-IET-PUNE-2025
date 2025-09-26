
const input = process.argv[2];


const num = Number(input);


function printPattern(n) {
  for (let i = n; i >= 1; i--) {
    console.log("* ".repeat(i).trim());
  }
}


if (!Number.isInteger(num) || num < 1 || num > 5) {
  console.error("Error: Please enter a valid number between 1 and 5.");
  process.exit(1);  
} else {
  printPattern(num);
}
