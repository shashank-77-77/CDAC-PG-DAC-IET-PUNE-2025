console.log('First');
setTimeout(() => console.log('Third'), 0);
Promise.resolve().then(() => console.log('Second'));
console.log('Fourth');
setImmediate(() => console.log('immediate'))
process.nextTick(() => console.log("next"))