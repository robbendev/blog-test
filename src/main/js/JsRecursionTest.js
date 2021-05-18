"use strict";
import {factorialRecursion, factorialTailRecursion} from 'JsRecursion' ;


function factorialRecursionTest() {
    let res = factorialRecursion(100000);
    console.log("打印结果" + res);
}

function factorialTailRecursionTest() {
    let res = factorialTailRecursion(1, 100000);
    console.log("打印结果" + res);
}

describe("加法函数测试", function () {
    before(function () {
        // runs before all tests in this block
    });

    // it: 定义一个测试用例
    it("1 加 1 应该等于 2", function () {
        // assert: nodejs内置断言模块
        assert.equal(add(1, 1), 2);
    });

    after(function () {
        // runs after all test in this block
    });
});
