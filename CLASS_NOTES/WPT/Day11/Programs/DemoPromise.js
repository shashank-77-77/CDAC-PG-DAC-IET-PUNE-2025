function resolveLater(callback) {
    return new Promise(
        (resolve) => {
            setInterval(() => {
                resolve(console.log("Hello World "));
            }, 2000);
        });
}

function display() {
    console.log("Hello World ");
}

resolveLater(display)
