const fs = require('fs').promises;

async function readFileAsync() {
    try {
        const data = await fs.readFile('sample.txt', 'utf8');
        console.log(data);
    } catch (err) {
        console.log('Error occurred: ' + err);
    }
}
readFileAsync();
