function factorial(n) {
    if (n < 0) {
        console.log("Factorial is not defined for negative numbers.");
        return;
    }

    if (n === 0 || n === 1) {
        return 1;
    }

    return n * factorial(n - 1);
}

const readline = require ('readline');
const n1 = readline.createInterface({
    input : process.stdin, output : process.stdout
    
});
n1.question('Enter number ',(num)=>{
console.log(`Factorial of ${num} is: ${factorial(num)}`);

})



