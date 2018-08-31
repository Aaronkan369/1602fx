package 基础;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.math.BigInteger;
import java.util.Arrays;

public class String数据结构 {
	public static void main(String[] args) {
		String str="abc";
//		System.out.println(str.hashCode()==((31*97+98)*31+99));
//		String newstr = str.concat("cdefg");
//		System.out.println(newstr==str);
		
		String[] strs=new String[3];
		strs[0]="abc";
		
		strs=Arrays.copyOf(strs, 4);
		strs[3]="ccc";
		for (String ss : strs) {
			System.out.println(ss);
		}
		
		
//		Frame f=new Frame("1602b");
//		f.setVisible(true);
//		f.setBounds(100, 100, 400, 300);
//		f.setLayout(new FlowLayout());
//		Button b0=new Button("xx");
//		
//		f.add(b0);
//		Button b1=new Button("xx");
//		
//		f.add(b1);
//		Button b2=new Button("xx");
//		
//		f.add(b2);
		 BigInteger a = new BigInteger("1231231241241249129481092481092481") ;
		System.out.println(a.add(new BigInteger("1231231241241249129481092481092481")));
	}
}
