function isPrime(n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 === 0 || n % 3 === 0) return false;
    for (let i = 5; i * i <= n; i += 6) {
        if (n % i === 0 || n % (i + 2) === 0) return false;
    }
    return true;
}

function main() {
    const args = process.argv.slice(2);

    if (args.length !== 10) {
        console.log("Please provide exactly 10 numbers as command line arguments.");
        return;
    }

    const arr = args.map(Number);

    if (arr.some(isNaN)) {
        console.log("All arguments must be valid numbers.");
        return;
    }

    // 1) Addition of even numbers only
    const sumEvenNumbers = arr.filter(x => x % 2 === 0).reduce((a, b) => a + b, 0);

    // 2) Addition of numbers at even indexes
    const sumEvenIndex = arr.filter((_, idx) => idx % 2 === 0).reduce((a, b) => a + b, 0);

    // 3) Addition of prime numbers
    const sumPrimes = arr.filter(isPrime).reduce((a, b) => a + b, 0);

    console.log("Array:", arr);
    console.log("Sum of even numbers:", sumEvenNumbers);
    console.log("Sum of numbers at even indexes:", sumEvenIndex);
    console.log("Sum of prime numbers:", sumPrimes);
}

main();
