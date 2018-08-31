package 网络;
//给飞秋发送消息
import java.io.*;
import java.net.*;
public class 飞秋测试 {
	
	public static void main(String[] args) throws IOException {
		//飞秋的数据格式
		String str="1:100:我:dell:10.2.11.85:hello 你好啊";
		byte[] array=str.getBytes();
		//发送的管道
		DatagramSocket ds=new DatagramSocket();
		//数据包
		DatagramPacket dp=new DatagramPacket(array, array.length,InetAddress.getByName("125.220.70.16"),2425);
		//ds.send(dp);
		while(true){
			ds.send(dp);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
 
}