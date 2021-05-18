package com.robbendev.blog.recursion

import com.robbendev.blog.recursion.util.Examination
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.math.BigInteger


internal class KRecursionTest {

    @Test
    fun factorialRecursion() {
        KRecursion().factorialRecursion(BigInteger.valueOf(1000000L));
    }

    @Test
    fun factorialTailRecursion() {
        Examination.start()
        val res = KRecursion().factorialTailRecursion(BigInteger.ONE, BigInteger.valueOf(100000L))
        println("计算结果：$res")
        Examination.end()
    }
}