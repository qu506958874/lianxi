package fangfa;

import shuxing.Cat;
import ruinian.jiecheng;
import ruinian.maopaopaixu;
import ruinian.nishu;
import ruinian.ruinian;
import ruinian.sanjiaoxing;
import ruinian.xuanzepaixu;
import ruinian.zhishu;
public class Cata {
	public static void main(String[] args){
		Cat cat1=new Cat();
		cat1.setName("小白在走猫步");
		System.out.println(cat1.getName());
		int d=cat1.add(1, 4,8);
		System.out.println(d);
		int e=cat1.add(2, 2.5);
		System.out.println(e);
		cat1.method();
		System.out.println();
		//阶乘
		jiecheng jie=new jiecheng();
		jie.setK(20);
		System.out.println();
		//瑞年
		ruinian rui=new ruinian();
		rui.setYear(1100);
		System.out.println();
		//冒泡排序
		maopaopaixu mao=new maopaopaixu();
		int[] a={45,65,78,98,33,12,88};
		mao.setA(a);
		System.out.println();
		//选择排序
		xuanzepaixu xuan=new xuanzepaixu();
		int[] b={45,65,78,98,33,12,88};
		xuan.setA(b);
		System.out.println();
		//逆数
		nishu nishu=new nishu();
		nishu.setI(1578);
		System.out.println("正数为:"+nishu.getI());
		System.out.println();
		//用*输出三角形
		System.out.println("用*输出三角形");
		sanjiaoxing san=new sanjiaoxing();
		san.setA(6);
		System.out.println();
		//质数和
		zhishu he=new zhishu();
		he.setA(101);
		
		
	}
}
