package 基础;

import java.util.Arrays;
import java.util.Iterator;

public class 数组操作 {
	public static void main(String[] args) {
		//一但定义不能改变长度  数组是内存中连续的空间
		int[] i=new int[] {4,1,3,8,5};
		i[3]=1111;
		for (int j : i) {
			System.out.println(j);
		}
//		String[] str=new String[3];//new String[] {"a","b","c"};
//		for (String string : str) {
//			System.out.println(string);
//		}
//		
		
		System.out.println("index:"+Arrays.binarySearch(i, 3));
		Arrays.sort(i);//工具类排序
		
		for (int j : i) {
			System.out.println(j);
		}
		
		
//		System.out.println(i.getClass());
	}
}
