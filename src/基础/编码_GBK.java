package ����;

public class ����_GBK {
	public static void main(String[] args) {
		String s="���a"; 
		byte[] bs = s.getBytes();
		for (byte b : bs) {
			System.out.println(b);
		}
	}
}
