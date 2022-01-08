package test;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String args[]) {
	HashMap<String, Object> map = new HashMap<>();
	map.put("name","张三");
	map.put("sex","男");
	map.put("age",22);
	map.put("high",170);
	map.put("money",88888);
	//遍历键位和值
	for (Map.Entry<String, Object> arg : map. entrySet()){
	System. out . println("键位: " + arg. getKey() +"值: " +arg. getValue());}
	//只获取键位
	for(String key : map. keySet()){
	System.out. println("键位: " + key);}
	//只获取value值
	for(Object value : map. values()){
	System.out.println("value:"+ value);}
	}
	}
