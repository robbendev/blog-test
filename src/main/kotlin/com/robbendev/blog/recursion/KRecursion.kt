package com.robbendev.blog.recursion

import java.math.BigInteger


class KRecursion {
    /**
     * 递归写法
     *
     * @param n n
     * @return 阶乘
     */
    fun factorialRecursion(n: BigInteger): Int {
        require(n.compareTo(BigInteger.ZERO) >= 0)
        return if (n.compareTo(BigInteger.ONE) == 0) {
            1
        } else {
            factorialRecursion(n.subtract(BigInteger.ONE).multiply(n))
        }
    }

    /**
     * 尾递归写法
     *
     * @param result res
     * @param n      n
     * @return res
     */
    tailrec fun factorialTailRecursion(result: BigInteger, n: BigInteger): BigInteger? {
        return if (n == BigInteger.ONE) {
            result
        } else {
            factorialTailRecursion(result.multiply(n), n.subtract(BigInteger.ONE))
        }
    }

}