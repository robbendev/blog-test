package com.robbendev.blog.recursion;

import com.robbendev.blog.recursion.util.Examination;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class JRecursionTest {

	@Test
	void factorialRecursion() {
		Examination.start();
		BigInteger result = JRecursion.factorialRecursion(BigInteger.valueOf(10L));
		System.out.println("计算结果:" + result);
		Examination.end();
	}

	@Test
	void factorialTailRecursion() {
		Examination.start();
		BigInteger result = JRecursion.factorialTailRecursion(BigInteger.ONE, BigInteger.valueOf(10000000L));
		System.out.println("计算结果:" + result);
		Examination.end();
	}

	@Test
	void factorialTailRecursion1() {
		Examination.start();
		BigInteger result = JRecursion.factorialTailRecursion1(BigInteger.ONE, BigInteger.valueOf(100000L)).invoke();
		System.out.println("计算结果:" + result);
		Examination.end();
	}

}