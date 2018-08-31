package 基础;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.math.BigInteger;
import java.util.Arrays;

public class 打印质数 {
	public static void main(String[] args) {
		int i=1000;
		System.out.println(2);
		clac(i);
	}

	/** 
	 * 计算i以内的质数
	 * @param i
	 */
	private static void clac(int i) {
		
		//如果不是大于2的数 肯定不是质数
		if (i<=1) {
			return ;
		}
		
		//循环计算所有的指数
		for (int j = 3; j <= i; j+=2) {
			if(isPrime(j)) {//判断是否是质数
				System.out.println(j);
			}
		}
		
	}

	/**是否是质数
	 * @param j
	 * @return
	 */
	private static boolean isPrime(int j) {
		//循环小于j的所有数  判断是否有约数
		for (int x = 3; x < j; x+=2) {
			if (j%x==0) {//判断是否能被整除
				return false;
			}
		}
		
		return true;
	}
}
