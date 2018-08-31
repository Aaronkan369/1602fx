package 基础;

public class 打印汉字编码_UTF8 {
	public static void main(String[] args) {
		for (int i = -28; i <= -27; i++) {
			for (int j = -67; j <= -60; j++) {
				for (int k = -96; k <= -95; k++) {
					byte[] b=new byte[3];
					b[0]=(byte)i;
					b[1]=(byte)j;
					b[2]=(byte)k;
					System.out.print(new String(b));
				}
			}
			
		}
	}
}
