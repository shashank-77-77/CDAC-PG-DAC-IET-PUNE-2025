function factorial(n) 
{
    if (n < 0) {
        console.log("Enter number greater than zero.");
        return;
    }
    if (n === 0 || n === 1) {
        return 1;
    }
    return n * factorial(n - 1);
}
const args = process.argv.slice(2);
const num = parseInt(args[0], 10);
const result = factorial(num);
if (result !== undefined) 
    {
    console.log(`Factorial of ${num} is: ${result}`);
}
