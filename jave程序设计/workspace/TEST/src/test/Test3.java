package test;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String args[]) {
	HashMap<String, Object> map = new HashMap<>();
	map.put("name","����");
	map.put("sex","��");
	map.put("age",22);
	map.put("high",170);
	map.put("money",88888);
	//������λ��ֵ
	for (Map.Entry<String, Object> arg : map. entrySet()){
	System. out . println("��λ: " + arg. getKey() +"ֵ: " +arg. getValue());}
	//ֻ��ȡ��λ
	for(String key : map. keySet()){
	System.out. println("��λ: " + key);}
	//ֻ��ȡvalueֵ
	for(Object value : map. values()){
	System.out.println("value:"+ value);}
	}
	}
