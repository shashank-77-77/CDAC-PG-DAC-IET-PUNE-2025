const path =  require('path');

console.log("name " , __dirname);
console.log("file name " , __filename);

const d = path.join(__dirname  , 'd.json')
console.log(d);