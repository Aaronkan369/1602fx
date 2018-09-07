package 基础;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOp {
	public static void main(String[] args) {
		List<String> al=new LinkedList<String>() {
			{
				add("az");add("ca");add("bx");
			}
		};
		al.add("fff");
		al.remove(1);
		System.out.println(al.size());
//		al.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.charAt(1)-o2.charAt(1);
//			}
//		});
		Collections.sort(al);
		//Collections.shuffle(al);
		al.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Math.random()>0.5?1:-1;
			}
		});
		
		System.out.println(al);
		
	}
}
