function largestElement(arr) {
    let largestNum = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > largestNum) {
            largestNum = arr[i];
        }
    }
    return largestNum;
}

const num1 = [10, 15, 18, 20, 23];
const result = largestElement(num1);

console.log("The largest element in the array is:" + result);
