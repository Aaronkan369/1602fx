package 网络.tomcat扩展;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tomcat {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8080);
		System.out.println("服务器已经启动");
		Socket s = ss.accept();//等待请求   客户端请求
		InputStream in = s.getInputStream();//req
		OutputStream ou = s.getOutputStream();//resp
		
		//浏览器对服务器说了什么？
		byte[] bs=new byte[10000];
		in.read(bs);//读取到数组
		String reqstr=new String(bs);
		System.out.println("浏览器说:\r\n"+reqstr);
		
		String line1=reqstr.split("\r\n")[0];
		String path=line1.split(" ")[1];
		
		if (path.indexOf(".jpg")!=-1) {
			
			String str="HTTP/1.1 200 OK\r\n"+
					"Content-Type: image/jpg\r\n"+  //返回的内容是html utf8
					"\r\n";				//报文头和内容之间必须有一个空行
					ou.write(str.getBytes());
			
			
			FileInputStream fi=new FileInputStream("C:\\Users\\wc\\eclipse-workspace\\1602b复习\\src\\网络\\tomcat扩展\\"+path.substring(1));
			int rs=fi.read();//读取一个int
			while (rs!=-1) { // -1表示结束
				ou.write(rs);
				rs=fi.read();
			}
			
		}else {
			String str="HTTP/1.1 200 OK\r\n"+
					"Content-Type: text/html;charset=utf-8\r\n"+  //返回的内容是html utf8
					"\r\n"+					//报文头和内容之间必须有一个空行
					"<button style='background:red' onclick='alert(12);'>对不起 资源不存在</button>ok success~~";

					ou.write(str.getBytes());
		}
		
		
		
		
		//关闭
		in.close();
		ou.flush();
		ou.close();
	}
}
