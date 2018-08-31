package 基础;

public class 打印ascII {
	public static void main(String[] args) {
		for (int i = -128; i <= 127; i++) {
			System.out.println(i+":"+(char)i);
		}
	}
}
