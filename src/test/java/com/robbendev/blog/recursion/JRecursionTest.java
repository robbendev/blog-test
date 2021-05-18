package com.robbendev.blog.recursion;

import com.robbendev.blog.recursion.util.Examination;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class JRecursionTest {

	@Test
	void factorialRecursion() {
		JRecursion.factorialRecursion(BigInteger.valueOf(1000000L));
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