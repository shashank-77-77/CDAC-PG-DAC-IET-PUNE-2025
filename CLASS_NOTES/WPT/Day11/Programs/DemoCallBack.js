function resolveLater(callback) {
    let a = 10;
    const p = new Promise(res, rej);

    if (a == 10) {
        return res;
    }

    p.then(){

    resolved display();

        reject

    }

}





function display() {
    console.log("Hello World ");
}

resolveLater(display)