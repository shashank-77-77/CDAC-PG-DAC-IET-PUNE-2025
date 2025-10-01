console.log('First');
setTimeout(() => console.log('in timeout'), 0);
console.log('Third ');
Promise.resolve().then(() => console.log('Second'));
