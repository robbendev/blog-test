package com.robbendev.blog.recursion;

import com.robbendev.blog.recursion.util.TailInvoke;
import com.robbendev.blog.recursion.util.TailRecursion;

import java.math.BigInteger;

public class JRecursion {

	/**
	 * 递归写法
	 *
	 * @param n n
	 * @return 阶乘
	 */
	public static BigInteger factorialRecursion(final BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) < 0) {
			throw new IllegalArgumentException();
		}
		if (n.compareTo(BigInteger.ONE) == 0) {
			return BigInteger.ONE;
		} else {
			return factorialRecursion(n.subtract(BigInteger.ONE)).multiply(n);
		}
	}

	/**
	 * 尾递归写法
	 *
	 * @param result res
	 * @param n      n
	 * @return res
	 */
	public static BigInteger factorialTailRecursion(final BigInteger result, final BigInteger n) {
		if (n.equals(BigInteger.ONE)) {
			return result;
		} else {
			return factorialTailRecursion(result.multiply(n), n.subtract(BigInteger.ONE));
		}
	}

	/**
	 * 阶乘计算 -- 使用尾递归接口完成
	 *
	 * @param factorial 当前递归栈的结果值
	 * @param number    下一个递归需要计算的值
	 * @return 尾递归接口, 调用invoke启动及早求值获得结果
	 */
	public static TailRecursion<BigInteger> factorialTailRecursion1(final BigInteger factorial,
			final BigInteger number) {
		if (number.equals(BigInteger.ONE))
			return TailInvoke.done(factorial);
		else
			return TailInvoke
					.call(() -> factorialTailRecursion1(factorial.multiply(number), number.subtract(BigInteger.ONE)));
	}


}
