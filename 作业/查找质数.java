
public class 查找质数 {
	public static void main(String[] args) {
		int range=10000;
		根据范围查找质数(range);
	}

	private static void 根据范围查找质数(int range) {
		for (int i = 2; i <= range; i++) {
			if(是不是质数(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean 是不是质数(int i) {
		return false;
	}
}
