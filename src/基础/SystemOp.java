package 基础;

public class SystemOp {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3};
		int[] b=new int[] {4,5,0,0,0};
		 System.arraycopy(a, 1, b, 2,1);
		 for (int i : b) {
			System.out.println(i);
		}
	}
}
