var text = "Visit to Center ";
var n = text.search(/to Center/i);

console.log(n);

var text = " to Center Visit to Center ";
var n = text.match(/to Center/g);

console.log(n);