package jihe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jihe {
	public static void main(String[] args){
		/*List list=new ArrayList();
		list.add(45);
		list.add(55);
		list.add(88);
		list.add(66);
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println();
		for(Object a:list){
			System.out.println(a);
		}
		
		System.out.println();
		
		Map map=new HashMap();
		map.put(1, 8);
		map.put("a", "威");
		System.out.println(map.get("a"));
		Set set=map.keySet();
		Object value=map.values();
		System.out.println(value);
		System.out.println();
		for(Object key:set){
			System.out.println(map.get(key));
		}
		System.out.println(map.containsKey("a"));
		System.out.println();
		
		
		/*Set set=new HashSet();
		set.add("skadjf");
		set.add(5);
		set.add("2");
		set.add(5);
		set.add("skadjf");
		set.remove(5);
		for(Object obj:set){
			System.out.println(obj);
		}*/
		String a="a";
		a+="b";
		a+="c";
		a+="d";
		a+="c";
		StringBuilder builder=new StringBuilder("a");
		builder.append("b");
		builder.append("c");
		builder.append("d");
		builder.append("e");
		builder.append("f");
		System.out.println(builder);
		System.out.println(builder.length());
		//替换
		String r=a.replace('c','h');
		System.out.println(r);
		//截取字符串  第一个参数是开始位置，第二个参数是结束位置 左闭右开
		String h=builder.substring(1,5);
		System.out.println(h);
		
		
		System.out.println();
		String y="666";
		String t="666";
		System.out.println(y==t);
		
		String l=new String("a");
		String m=new String("a");
		//l和m的地址不一样
		System.out.println(l==m);
		
		//l和m的值一样
		System.out.println(l.equals(m));
		
		int i=1;
		String c=String.valueOf(i);
		System.out.println(c+2);
		System.out.println(i+2);
	}
}
