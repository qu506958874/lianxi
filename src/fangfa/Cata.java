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
		cat1.setName("С������è��");
		System.out.println(cat1.getName());
		int d=cat1.add(1, 4,8);
		System.out.println(d);
		int e=cat1.add(2, 2.5);
		System.out.println(e);
		cat1.method();
		System.out.println();
		//�׳�
		jiecheng jie=new jiecheng();
		jie.setK(20);
		System.out.println();
		//����
		ruinian rui=new ruinian();
		rui.setYear(1100);
		System.out.println();
		//ð������
		maopaopaixu mao=new maopaopaixu();
		int[] a={45,65,78,98,33,12,88};
		mao.setA(a);
		System.out.println();
		//ѡ������
		xuanzepaixu xuan=new xuanzepaixu();
		int[] b={45,65,78,98,33,12,88};
		xuan.setA(b);
		System.out.println();
		//����
		nishu nishu=new nishu();
		nishu.setI(1578);
		System.out.println("����Ϊ:"+nishu.getI());
		System.out.println();
		//��*���������
		System.out.println("��*���������");
		sanjiaoxing san=new sanjiaoxing();
		san.setA(6);
		System.out.println();
		//������
		zhishu he=new zhishu();
		he.setA(101);
		
		
	}
}
