"use strict";

function factorialRecursion(n) {
    if (n === 1) {
        return 1;
    } else {
        return n * factorialRecursion(n);
    }
}

function factorialTailRecursion(result, n) {
    if (n === 1) {
        return result;
    } else {
        return factorialTailRecursion(result * n, n - 1);
    }
}


function factorialRecursionTest() {
    let res = factorialRecursion(100000);
    console.log("打印结果" + res);
}

function factorialTailRecursionTest() {
    let res = factorialTailRecursion(1,100000);
    console.log("打印结果" + res);
}

