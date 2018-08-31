package 基础;

public class 编码_UTF8 {
	public static void main(String[] args) {
		//打印编码
//		String s="你好a";
//		byte[] bs = s.getBytes();
//		for (byte b : bs) {
//			System.out.println(b);
//		}
		byte[] bs=new byte[4];
		bs[0]=-28;
		bs[1]=-67;
		bs[2]=-96;
		bs[3]=97;
		System.out.println(new String(bs));
		
	}
}
