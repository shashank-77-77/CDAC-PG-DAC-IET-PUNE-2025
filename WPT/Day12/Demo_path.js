const p = require('path');
const fs = require('fs'); 
const db = {
    properties: 'db_config.txt' // or whatever value is expected
};
console.log("Name " + __dirname);
let config = p.join(__dirname,'Day12', db.properties);
FileSystem.readFile(config)


