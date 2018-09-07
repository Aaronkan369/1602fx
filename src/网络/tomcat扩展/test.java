package 网络.tomcat扩展;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class test {
	public static void main(String[] args) throws IOException {
		InputStream a = test.class.getClassLoader().getResourceAsStream("a.jpg");
		System.out.println(a.read()+"");
	}
}
