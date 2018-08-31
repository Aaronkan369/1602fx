package 基础;

import java.io.UnsupportedEncodingException;

//1  给出一个英文字符串 统计出现次数最多的字母 
//2  给定一个字符串  abaaabcccabc 打印所有对称格式内容 aba aaa   aaabaaa
public class 打印汉字编码_GBK {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b=new byte[2];
		b[0]=-60;
		for (int i = -128; i <=127; i++) {
			b[1]=(byte)i;
			System.out.print(new String(b,"GBK"));
		}
	}
}
