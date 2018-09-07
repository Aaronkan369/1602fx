package 基础;

public class 不定长参数 {
	public static void main(String[] args) {
		print("1","2");
		print("1","2","3","a");
	}

	private static void print(String...as) {
		for (String x : as) {
			System.out.println(x);
		}
	}
}
