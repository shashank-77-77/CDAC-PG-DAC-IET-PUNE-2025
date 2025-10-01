const array = [10, 5, 20, 8, 15];
let largest = array[0];

array.forEach(element => {
    if (element > largest) {
        largest = element;
    }
});

console.log("Largest element:", largest);