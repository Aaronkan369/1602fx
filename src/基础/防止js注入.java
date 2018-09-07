package 基础;

public class 防止js注入 {
	public static void main(String[] args) {
		String param="<script>alert(1)</script>";
		System.out.println(param.replace("<", "&lt;").replace(">", "&gt;"));
	}
}
