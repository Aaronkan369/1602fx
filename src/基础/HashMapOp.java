package 基础;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOp {
	public static void main(String[] args) {
		Map<String,String> hm=new HashMap<String,String> () {{put("name", "zhangsan");put("age", "11");}};
		System.out.println(hm);
		Set<Entry<String, String>> en = hm.entrySet();
		for (Entry<String, String> e : en) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
