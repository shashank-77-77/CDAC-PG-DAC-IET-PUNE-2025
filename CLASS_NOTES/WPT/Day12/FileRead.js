const f = require('fs');

// binary   synchrouns   internal Working 
f.readFile("sample1.txt", "utf8", (err, data) => {
    if (err) {
        console.log("error occured " + err)
    } else
        console.log(data);
})

f.readFileAsync()  /// Prmoise   async  