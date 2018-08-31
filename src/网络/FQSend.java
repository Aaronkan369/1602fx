package 网络;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
 
/**
 *nihao
 */
public class FQSend {
 
    
    public static void main(String[] args) throws Exception {
        
        DatagramSocket send=new DatagramSocket();
        
        String content=getFQData("哈哈哈，我是神！收到你哦一声啊！");
        String content1=getFQData("ip:10.2.11.75" +
                                  "port:2425" +
        		  "这样就可以群发了，但是不能while循环啊！会出事！");

        DatagramPacket packet=new DatagramPacket(content1.getBytes(), 
                                                 content1.getBytes().length,
                                                 InetAddress.getByName("10.2.11.75"),2425);
        
        send.send(packet);   
 
    }
    
    private static String getFQData(String content){
        
        StringBuilder sb = new StringBuilder();
          sb.append("1.0:")                                    
            .append(System.currentTimeMillis()+":")            
            .append("cccc")                                
            .append("192.168.9.251:")                        
            .append("32:")                                    
            .append(content);                              
        return sb.toString();
    }
    
 
}