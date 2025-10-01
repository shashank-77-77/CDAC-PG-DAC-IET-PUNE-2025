function add(a, b) {
    console.log("addition of 2 number " + (a + b));
}

function add(a, b, c) {
    console.log("addition of 3 number " + (a + b + c));
}
//  a array   data same type 
function add(...a) {
    console.log("from new function");
    let sum = 0;
    for (let i = 0; i < a.length; i++) {
        sum += a[i];
    }

    console.log("Addition of " + (a.length) + " numbers = " + sum);

}



add(18, 20, 30, 12, 23, 34);
add(1, 2);
add(18, 20, 30);
add();