function fetchData(callback) {
    console.log('All arguments:', process.argv);
    let a = process.argv[2];// read the command line arg
    for (let i = 1; i < 11; i++) {
        console.log(i * a);
    }
}

// node Args.js 12 15 18 16 

fetchData()